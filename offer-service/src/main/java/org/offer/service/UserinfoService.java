package org.offer.service;

import org.offer.bean.DicProjectBean;
import org.offer.http.APIStatus;

import com.camelot.openplatform.common.bean.ExecuteResult;

/** 
 * <p>Description: [系统用户表服务]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 */

public interface UserinfoService {
	
	/**
	* @Title: loginUserinfo
	* @Description: 用户登录
	* @param loginName   登录名
	* @param loginPwd    密码
	* @return ExecuteResult<APIStatus>    返回类型
	* @throws
	*/
	ExecuteResult<APIStatus> loginSys(String loginName,String loginPwd);
}
