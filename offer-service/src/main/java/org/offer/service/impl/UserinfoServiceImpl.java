package org.offer.service.impl;

import javax.annotation.Resource;

import org.offer.bean.UserinfoBean;
import org.offer.dao.UserinfoDAO;
import org.offer.http.APIStatus;
import org.offer.http.ApiResponse;
import org.offer.service.UserinfoService;
import org.offer.utils.CurrentUserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.camelot.openplatform.common.bean.ExecuteResult;
/**
 * <p>Description: [系统用户表服务实现]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on: 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 */
@Service("userinfoService")
public class UserinfoServiceImpl implements UserinfoService {

   /**
    * <p>Discription:[日志对象]</p>
    */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

   /**
    * <p>[系统用户表Dao]</p>
    **/
    @Autowired
    private UserinfoDAO  userinfoDAO ;
    
    @Resource
    private CurrentUserUtils userUtils;

	@Override
	public ExecuteResult<APIStatus> loginSys(String loginName, String loginPwd) {
		logger.info("\n 方法[{}]，入参：[{}]", "UserinfoServiceImpl-loginSys", "params:" + loginName +","+loginPwd);
		ExecuteResult<APIStatus> result = new ExecuteResult<APIStatus>();
		try{
			//判断登录名和密码是否存在
			if(StringUtils.isEmpty(loginName)){
				result.setResult(APIStatus.ERROR_402);
				logger.error("\n 方法[{}]，错误：[{}]", "UserinfoServiceImpl-loginSys", "用户名不能为空！");
			}
			if(StringUtils.isEmpty(loginPwd)){
				result.setResult(APIStatus.ERROR_402);
				logger.error("\n 方法[{}]，错误：[{}]", "UserinfoServiceImpl-loginSys", "密码不能为空！");
			}
			loginName = loginName.trim();
			loginPwd = loginPwd.trim();
			//通过用户名查询该用户是否存在
			UserinfoBean userinfoBean= userinfoDAO.queryByName(loginName);
			if(userinfoBean == null){
				result.setResult(APIStatus.ERROR_402);
				logger.error("\n 方法[{}]，错误：[{}]", "UserinfoServiceImpl-loginSys", "该用户不存在");		
			}else {				
				if(loginPwd.equals(userinfoBean.getLoginPwd())){
					//登录验证成功
					result.setResult(APIStatus.OK_200);	
					userUtils.updateUserCache(userinfoBean);
				}else{
					result.setResult(APIStatus.ERROR_400);
					logger.error("\n 方法[{}]，错误：[{}]", "UserinfoServiceImpl-loginSys", "{" +userinfoBean.getLoginPwd()+ "}错误");	
				}
			}					
		}catch(Exception e){
			logger.error("\n 方法[{}]，错误：[{}]", "UserinfoServiceImpl-loginSys", e.getMessage());
			result.setResult(APIStatus.ERROR_500);
		}	
		return result;
	}

}














