package org.offer.bean;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * <p>Description: [耗材表实体类]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 */
public class SuppliesBean implements Serializable {

	private Long id;//自增主键

	private Long userId;//用户id

	private String name;//耗材名称

	private BigDecimal price;//耗材价格

	private String remarks;//备注



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
	 * <p>Discription:[获取耗材名称]</p>
	 * Created on 2017年06月23日
	 * @return String 耗材名称
	 * @author:[王力]
	 */	
	public String getName() {
		return name;
	}


	/**
	 * <p>Discription:[设置耗材名称]</p>
	 * Created on 2017年06月23日
	 * @param name 耗材名称
	 * @author:[王力]
	 */		
    public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * <p>Discription:[获取耗材价格]</p>
	 * Created on 2017年06月23日
	 * @return BigDecimal 耗材价格
	 * @author:[王力]
	 */	
	public BigDecimal getPrice() {
		return price;
	}


	/**
	 * <p>Discription:[设置耗材价格]</p>
	 * Created on 2017年06月23日
	 * @param price 耗材价格
	 * @author:[王力]
	 */		
    public void setPrice(BigDecimal price) {
		this.price = price;
	}

	
	/**
	 * <p>Discription:[获取备注]</p>
	 * Created on 2017年06月23日
	 * @return String 备注
	 * @author:[王力]
	 */	
	public String getRemarks() {
		return remarks;
	}


	/**
	 * <p>Discription:[设置备注]</p>
	 * Created on 2017年06月23日
	 * @param remarks 备注
	 * @author:[王力]
	 */		
    public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

}
