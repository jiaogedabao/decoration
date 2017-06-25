package org.offer.controller;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.offer.bean.DicProjectBean;
import org.offer.bean.UserinfoBean;
import org.offer.common.LoginBean;
import org.offer.http.APIStatus;
import org.offer.http.ApiResponse;
import org.offer.service.UserinfoService;
import org.offer.utils.CurrentUserUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

import com.alibaba.fastjson.JSONObject;
import com.camelot.openplatform.common.bean.ExecuteResult;

/**
* @ClassName: LoginController
* @Description: 用户管理--用户登录web接口
* @author tongrongbing
* @date 2017年6月25日
*
*/
@Api(value = "用户登录web接口", description="用户登录web接口")
@RestController
@RequestMapping("/sys")
public class LoginController {
	
	@Resource
	private UserinfoService userinfoService;

	@Resource 
	private CurrentUserUtils userUtils;
	
	/**
	* @Title: loginSys
	* @Description: 用户登录
	* @param 
	* @return JSONObject    返回类型
	* @throws
	*/
	@ApiOperation("用户登录")
	@PostMapping("login")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "loginName", value = "登录名", required = true, paramType = "query"),
		@ApiImplicitParam(name = "loginPwd", value = "登录密码", required = true, paramType = "query")})			
	public JSONObject loginSys(String loginName, String loginPwd){
		ExecuteResult<APIStatus> result = userinfoService.loginSys(loginName, loginPwd);
		if(result.getResult().code == 200){
			UserinfoBean userinfoBean = userUtils.getCurrentByLoginName(loginName);
			String ticket = userUtils.getAutoTicket(loginName);
			LoginBean loginBean = new LoginBean();
			loginBean.setUser(userinfoBean);
			loginBean.setTicket(ticket);			
			return ApiResponse.jsonData(result.getResult(),loginBean);
		}
		return ApiResponse.jsonData(result.getResult());
	}
	
}









