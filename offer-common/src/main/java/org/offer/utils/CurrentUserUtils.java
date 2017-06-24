package org.offer.utils;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.offer.bean.UserinfoBean;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

/** 
 * <p>Description: [当前用户工具类]</p>
 * Created on 2017年6月16日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部 
 */ 
@Component
public class CurrentUserUtils {
	
	private final static String LOING_PREFIX = "didi-online-login";

	//用户缓存失效时间-20分钟
	private final static int USER_CACHE_SECONDS = 60 * 20;
	
	@Resource
	private RedisDB redisDB;
	
	/**
	 * <p>Discription:[获取当前登录用户]</p>
	 * Created on 2017年6月16日
	 * @param authTicket  登录用户的tiket
	 * @return UserBean 用户bean对象
	 * @author:[王力]
	 */
	public UserinfoBean getCurrentLoginUser(String authTicket){
		String str = redisDB.get(LOING_PREFIX+authTicket);
		if(StringUtils.isNotEmpty(str)){
			return  JSONObject.parseObject(str, UserinfoBean.class);
		}
		return null;
	}

	/**
	 * Discription: [更新当前用户信息缓存]
	 * Created on: 11:14 2017/6/21
	 * @param authTicket 用户ticket
	 * @param data 用户bean
	 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
	 */
	public void updateUserCache(String authTicket, UserinfoBean data) {
		redisDB.setAndExpire(LOING_PREFIX + authTicket, JSONObject.toJSONString(data), USER_CACHE_SECONDS);
	}

}
