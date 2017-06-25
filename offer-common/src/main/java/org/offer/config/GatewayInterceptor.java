package org.offer.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.offer.utils.RedisDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import io.swagger.annotations.Authorization;
/**
 * 
 * <p>Description: [拦截器:拦截所有请求]</p>
 * Created on 2017年6月23日
 * @author  <a href="mailto: wuyingya@camelotchina.com">吴迎亚</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部
 */
public class GatewayInterceptor implements HandlerInterceptor {

	@Resource
	private RedisDB redisDB;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GatewayInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {
	}

	/**
	 * <p>
	 * Discription:对接滴滴sso系统,获得登录用户信息并存入redis
	 * </p>
	 * 
	 * @param ticket
	 *            滴滴sso提供回调生成ticket,基本格式为json字符串
	 *            auth_ticket:e24la346jljlja99tg3, auth_system:ecm
	 * @return Map<String,Map<String,Object>> 登录用户信息
	 * @author: <a href="mailto: wuyingya@camelotchina.com">吴迎亚<br/>
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("[Gateway] api gateway...");
		String ticket = request.getParameter("auth_ticket");
		String system = request.getParameter("auth_system");
		System.out.println("[ticket] "+ticket + " [system] " + system);
		Map<String,String[]> map = request.getParameterMap();
		if ( map != null ) {
			Iterator<Entry<String, String[]>> it = map.entrySet().iterator();
			while ( it.hasNext() ) {
				Entry<String, String[]> o = it.next();
				System.out.println("[Param] "+ o.getKey() + " = "+o.getValue()[0]);
			}
			
		
		}
		
		// 获得用户权限
		String key = "e24la346jljlja99tg3";
		Map<Object, Object> hashMap = redisDB.getHashMap(key);
		String functions = (String) hashMap.get("functions");
		LOGGER.info("\n 方法[{}]，返回值：[{}]","GatewayInterceptor-preHandle",functions);
		// 获得访问路径中的访问模块和方法
		String servletPath = request.getServletPath();
		LOGGER.info("\n 方法[{}]，返回值：[{}]","GatewayInterceptor-preHandle",servletPath);
		
		// 判断是否是方法控制类,非方法控制类，无需进行权限鉴定，直接放行
		        if (!handler.getClass().isAssignableFrom(HandlerMethod.class)) {
        	return true;
		}
        // 判断是否有权限控制，没有权限注解的方法，无需权限鉴定，直接放行
        Authorization auth = ((HandlerMethod) handler).getMethodAnnotation(Authorization.class);
        if ( auth == null || auth.value().isEmpty() ) {
        	return true;
        }
        if(functions.indexOf(servletPath)>0){
        	return true;
        }
        ajaxResponse(response,auth.value());
		return false;
	}
	/**
	 * 
	 * <p>Discription:[返回ajax结果]</p>
	 * Created on 2017年6月22日
	 * @param response HttpServletResponse
	 * @param message 返回的消息
	 * @return 返回true
	 * @author[hanshixiong]
	 */
	private boolean ajaxResponse(HttpServletResponse response, String message) {
        //异步请求 返回json数据
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.append(message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
        return true;
    }

}
