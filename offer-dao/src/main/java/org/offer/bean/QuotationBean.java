package org.offer.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * <p>Description: [报价单实体类]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 */
public class QuotationBean implements Serializable {

	private Long id;//自增主键

	private Long userId;//用户id

	private String name;//报价单名称

	private String custName;//客户姓名

	private String custPhone;//客户手机号

	private String custEmail;//客户email

	private BigDecimal totalPrice;//统计价格

	private String descripton;//报价单描述

	private Integer isSend;//是否发送

	private Date createDt;//创建时间
    /**
    * <p>创建时间范围查询-开始</p>
    */
	private String createDtStart;

    /**
    * <p>创建时间范围查询-结束</p>
    */
	private String createDtEnd;

	private Date sendDt;//发送时间



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
	 * <p>Discription:[获取用户id]</p>
	 * Created on 2017年06月23日
	 * @return Long 用户id
	 * @author:[王力]
	 */	
	public Long getUserId() {
		return userId;
	}


	/**
	 * <p>Discription:[设置用户id]</p>
	 * Created on 2017年06月23日
	 * @param userId 用户id
	 * @author:[王力]
	 */		
    public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	/**
	 * <p>Discription:[获取报价单名称]</p>
	 * Created on 2017年06月23日
	 * @return String 报价单名称
	 * @author:[王力]
	 */	
	public String getName() {
		return name;
	}


	/**
	 * <p>Discription:[设置报价单名称]</p>
	 * Created on 2017年06月23日
	 * @param name 报价单名称
	 * @author:[王力]
	 */		
    public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * <p>Discription:[获取客户姓名]</p>
	 * Created on 2017年06月23日
	 * @return String 客户姓名
	 * @author:[王力]
	 */	
	public String getCustName() {
		return custName;
	}


	/**
	 * <p>Discription:[设置客户姓名]</p>
	 * Created on 2017年06月23日
	 * @param custName 客户姓名
	 * @author:[王力]
	 */		
    public void setCustName(String custName) {
		this.custName = custName;
	}

	
	/**
	 * <p>Discription:[获取客户手机号]</p>
	 * Created on 2017年06月23日
	 * @return String 客户手机号
	 * @author:[王力]
	 */	
	public String getCustPhone() {
		return custPhone;
	}


	/**
	 * <p>Discription:[设置客户手机号]</p>
	 * Created on 2017年06月23日
	 * @param custPhone 客户手机号
	 * @author:[王力]
	 */		
    public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	
	/**
	 * <p>Discription:[获取客户email]</p>
	 * Created on 2017年06月23日
	 * @return String 客户email
	 * @author:[王力]
	 */	
	public String getCustEmail() {
		return custEmail;
	}


	/**
	 * <p>Discription:[设置客户email]</p>
	 * Created on 2017年06月23日
	 * @param custEmail 客户email
	 * @author:[王力]
	 */		
    public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	
	/**
	 * <p>Discription:[获取统计价格]</p>
	 * Created on 2017年06月23日
	 * @return BigDecimal 统计价格
	 * @author:[王力]
	 */	
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}


	/**
	 * <p>Discription:[设置统计价格]</p>
	 * Created on 2017年06月23日
	 * @param totalPrice 统计价格
	 * @author:[王力]
	 */		
    public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	/**
	 * <p>Discription:[获取报价单描述]</p>
	 * Created on 2017年06月23日
	 * @return String 报价单描述
	 * @author:[王力]
	 */	
	public String getDescripton() {
		return descripton;
	}


	/**
	 * <p>Discription:[设置报价单描述]</p>
	 * Created on 2017年06月23日
	 * @param descripton 报价单描述
	 * @author:[王力]
	 */		
    public void setDescripton(String descripton) {
		this.descripton = descripton;
	}

	
	/**
	 * <p>Discription:[获取是否发送]</p>
	 * Created on 2017年06月23日
	 * @return Integer 是否发送
	 * @author:[王力]
	 */	
	public Integer getIsSend() {
		return isSend;
	}


	/**
	 * <p>Discription:[设置是否发送]</p>
	 * Created on 2017年06月23日
	 * @param isSend 是否发送
	 * @author:[王力]
	 */		
    public void setIsSend(Integer isSend) {
		this.isSend = isSend;
	}

	
	/**
	 * <p>Discription:[获取创建时间]</p>
	 * Created on 2017年06月23日
	 * @return Date 创建时间
	 * @author:[王力]
	 */	
	public Date getCreateDt() {
		return createDt;
	}


	/**
	 * <p>Discription:[设置创建时间]</p>
	 * Created on 2017年06月23日
	 * @param createDt 创建时间
	 * @author:[王力]
	 */		
    public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

    /**
    * <p>Discription:[获取创建时间范围查询-开始]</p>
    * Created on 2017年06月23日
    * @return String 创建时间范围查询-开始
    * @author:[王力]
    */
    public String getCreateDtStart() {
    	return createDtStart;
    }

    /**
    * <p>Discription:[获取创建时间范围查询-结束]</p>
    * Created on 2017年06月23日
    * @return String 创建时间范围查询-结束
    * @author:[王力]
    */
    public String getCreateDtEnd() {
    	return createDtEnd;
    }

    /**
    * <p>Discription:[设置创建时间范围查询-开始]</p>
    * Created on 2017年06月23日
    * @param createDtStart 创建时间范围查询-开始
    * @author:[王力]
    */
    public void setCreateDtStart(String createDtStart) {
    	this.createDtStart = createDtStart;
    }

    /**
    * <p>Discription:[设置创建时间范围查询-结束]</p>
    * Created on 2017年06月23日
    * @param createDtEnd 创建时间范围查询-结束
    * @author:[王力]
    */
    public void setCreateDtEnd(String createDtEnd) {
    	this.createDtEnd = createDtEnd;
    }
	
	/**
	 * <p>Discription:[获取发送时间]</p>
	 * Created on 2017年06月23日
	 * @return Date 发送时间
	 * @author:[王力]
	 */	
	public Date getSendDt() {
		return sendDt;
	}


	/**
	 * <p>Discription:[设置发送时间]</p>
	 * Created on 2017年06月23日
	 * @param sendDt 发送时间
	 * @author:[王力]
	 */		
    public void setSendDt(Date sendDt) {
		this.sendDt = sendDt;
	}

	

}
