package org.offer.bean;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * <p>Description: [系统用户表实体类]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 */
public class UserinfoBean implements Serializable {

	private Long id;//自增主键

	private String loginName;//登录名

	private String loginPwd;//登录密码

	private String realName;//姓名

	private String phone;//手机号

	private String email;//Email

	private BigDecimal type;//用户类型

	private BigDecimal proYear;//职业年份

	private String company;//所属公司

	private String status;//状态



	/**
	 * <p>Discription:[获取自增主键]</p>
	 * Created on 2017年06月23日
	 * @return Long 自增主键
	 * @author:[王力]
	 */	
	public Long getId() {
		return id;
	}


	/**
	 * <p>Discription:[设置自增主键]</p>
	 * Created on 2017年06月23日
	 * @param id 自增主键
	 * @author:[王力]
	 */		
    public void setId(Long id) {
		this.id = id;
	}

	
	/**
	 * <p>Discription:[获取登录名]</p>
	 * Created on 2017年06月23日
	 * @return String 登录名
	 * @author:[王力]
	 */	
	public String getLoginName() {
		return loginName;
	}


	/**
	 * <p>Discription:[设置登录名]</p>
	 * Created on 2017年06月23日
	 * @param loginName 登录名
	 * @author:[王力]
	 */		
    public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	
	/**
	 * <p>Discription:[获取登录密码]</p>
	 * Created on 2017年06月23日
	 * @return String 登录密码
	 * @author:[王力]
	 */	
	public String getLoginPwd() {
		return loginPwd;
	}


	/**
	 * <p>Discription:[设置登录密码]</p>
	 * Created on 2017年06月23日
	 * @param loginPwd 登录密码
	 * @author:[王力]
	 */		
    public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	
	/**
	 * <p>Discription:[获取姓名]</p>
	 * Created on 2017年06月23日
	 * @return String 姓名
	 * @author:[王力]
	 */	
	public String getRealName() {
		return realName;
	}


	/**
	 * <p>Discription:[设置姓名]</p>
	 * Created on 2017年06月23日
	 * @param realName 姓名
	 * @author:[王力]
	 */		
    public void setRealName(String realName) {
		this.realName = realName;
	}

	
	/**
	 * <p>Discription:[获取手机号]</p>
	 * Created on 2017年06月23日
	 * @return String 手机号
	 * @author:[王力]
	 */	
	public String getPhone() {
		return phone;
	}


	/**
	 * <p>Discription:[设置手机号]</p>
	 * Created on 2017年06月23日
	 * @param phone 手机号
	 * @author:[王力]
	 */		
    public void setPhone(String phone) {
		this.phone = phone;
	}

	
	/**
	 * <p>Discription:[获取Email]</p>
	 * Created on 2017年06月23日
	 * @return String Email
	 * @author:[王力]
	 */	
	public String getEmail() {
		return email;
	}


	/**
	 * <p>Discription:[设置Email]</p>
	 * Created on 2017年06月23日
	 * @param email Email
	 * @author:[王力]
	 */		
    public void setEmail(String email) {
		this.email = email;
	}

	
	/**
	 * <p>Discription:[获取用户类型]</p>
	 * Created on 2017年06月23日
	 * @return BigDecimal 用户类型
	 * @author:[王力]
	 */	
	public BigDecimal getType() {
		return type;
	}


	/**
	 * <p>Discription:[设置用户类型]</p>
	 * Created on 2017年06月23日
	 * @param type 用户类型
	 * @author:[王力]
	 */		
    public void setType(BigDecimal type) {
		this.type = type;
	}

	
	/**
	 * <p>Discription:[获取职业年份]</p>
	 * Created on 2017年06月23日
	 * @return BigDecimal 职业年份
	 * @author:[王力]
	 */	
	public BigDecimal getProYear() {
		return proYear;
	}


	/**
	 * <p>Discription:[设置职业年份]</p>
	 * Created on 2017年06月23日
	 * @param proYear 职业年份
	 * @author:[王力]
	 */		
    public void setProYear(BigDecimal proYear) {
		this.proYear = proYear;
	}

	
	/**
	 * <p>Discription:[获取所属公司]</p>
	 * Created on 2017年06月23日
	 * @return String 所属公司
	 * @author:[王力]
	 */	
	public String getCompany() {
		return company;
	}


	/**
	 * <p>Discription:[设置所属公司]</p>
	 * Created on 2017年06月23日
	 * @param company 所属公司
	 * @author:[王力]
	 */		
    public void setCompany(String company) {
		this.company = company;
	}

	
	/**
	 * <p>Discription:[获取状态]</p>
	 * Created on 2017年06月23日
	 * @return String 状态
	 * @author:[王力]
	 */	
	public String getStatus() {
		return status;
	}


	/**
	 * <p>Discription:[设置状态]</p>
	 * Created on 2017年06月23日
	 * @param status 状态
	 * @author:[王力]
	 */		
    public void setStatus(String status) {
		this.status = status;
	}

	

}
