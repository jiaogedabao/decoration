package org.offer.bean;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * <p>Description: [工程项目表实体类]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 */
public class DicProjectBean implements Serializable {

	private Long id;//自增主键

	private Long userId;//用户id

	private String name;//工程项目名称

	private String unit;//工程项目单位

	private String desConstruction;//施工描述

	private String desStuff;//材料描述

	private BigDecimal price;//价格

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
	 * <p>Discription:[获取工程项目名称]</p>
	 * Created on 2017年06月23日
	 * @return String 工程项目名称
	 * @author:[王力]
	 */	
	public String getName() {
		return name;
	}


	/**
	 * <p>Discription:[设置工程项目名称]</p>
	 * Created on 2017年06月23日
	 * @param name 工程项目名称
	 * @author:[王力]
	 */		
    public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * <p>Discription:[获取工程项目单位]</p>
	 * Created on 2017年06月23日
	 * @return String 工程项目单位
	 * @author:[王力]
	 */	
	public String getUnit() {
		return unit;
	}


	/**
	 * <p>Discription:[设置工程项目单位]</p>
	 * Created on 2017年06月23日
	 * @param unit 工程项目单位
	 * @author:[王力]
	 */		
    public void setUnit(String unit) {
		this.unit = unit;
	}

	
	/**
	 * <p>Discription:[获取施工描述]</p>
	 * Created on 2017年06月23日
	 * @return String 施工描述
	 * @author:[王力]
	 */	
	public String getDesConstruction() {
		return desConstruction;
	}


	/**
	 * <p>Discription:[设置施工描述]</p>
	 * Created on 2017年06月23日
	 * @param desConstruction 施工描述
	 * @author:[王力]
	 */		
    public void setDesConstruction(String desConstruction) {
		this.desConstruction = desConstruction;
	}

	
	/**
	 * <p>Discription:[获取材料描述]</p>
	 * Created on 2017年06月23日
	 * @return String 材料描述
	 * @author:[王力]
	 */	
	public String getDesStuff() {
		return desStuff;
	}


	/**
	 * <p>Discription:[设置材料描述]</p>
	 * Created on 2017年06月23日
	 * @param desStuff 材料描述
	 * @author:[王力]
	 */		
    public void setDesStuff(String desStuff) {
		this.desStuff = desStuff;
	}

	
	/**
	 * <p>Discription:[获取价格]</p>
	 * Created on 2017年06月23日
	 * @return BigDecimal 价格
	 * @author:[王力]
	 */	
	public BigDecimal getPrice() {
		return price;
	}


	/**
	 * <p>Discription:[设置价格]</p>
	 * Created on 2017年06月23日
	 * @param price 价格
	 * @author:[王力]
	 */		
    public void setPrice(BigDecimal price) {
		this.price = price;
	}

	
	/**
	 * <p>Discription:[获取价格]</p>
	 * Created on 2017年06月23日
	 * @return String 价格
	 * @author:[王力]
	 */	
	public String getRemarks() {
		return remarks;
	}


	/**
	 * <p>Discription:[设置价格]</p>
	 * Created on 2017年06月23日
	 * @param remarks 价格
	 * @author:[王力]
	 */		
    public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

}
