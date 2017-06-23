package org.offer.bean;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * <p>Description: [报价单详情实体类]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 */
public class QuotationInfoBean implements Serializable {

	private Long id;//自增主键

	private Long modId;//子模块id

	private String proSupName;//项目或耗材名称

	private String unit;//项目单位

	private BigDecimal unitPrice;//项目价格

	private Integer num;//数量

	private String desConstruction;//施工描述

	private String desStuff;//材料描述

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
	 * <p>Discription:[获取子模块id]</p>
	 * Created on 2017年06月23日
	 * @return Long 子模块id
	 * @author:[王力]
	 */	
	public Long getModId() {
		return modId;
	}


	/**
	 * <p>Discription:[设置子模块id]</p>
	 * Created on 2017年06月23日
	 * @param modId 子模块id
	 * @author:[王力]
	 */		
    public void setModId(Long modId) {
		this.modId = modId;
	}

	
	/**
	 * <p>Discription:[获取项目或耗材名称]</p>
	 * Created on 2017年06月23日
	 * @return String 项目或耗材名称
	 * @author:[王力]
	 */	
	public String getProSupName() {
		return proSupName;
	}


	/**
	 * <p>Discription:[设置项目或耗材名称]</p>
	 * Created on 2017年06月23日
	 * @param proSupName 项目或耗材名称
	 * @author:[王力]
	 */		
    public void setProSupName(String proSupName) {
		this.proSupName = proSupName;
	}

	
	/**
	 * <p>Discription:[获取项目单位]</p>
	 * Created on 2017年06月23日
	 * @return String 项目单位
	 * @author:[王力]
	 */	
	public String getUnit() {
		return unit;
	}


	/**
	 * <p>Discription:[设置项目单位]</p>
	 * Created on 2017年06月23日
	 * @param unit 项目单位
	 * @author:[王力]
	 */		
    public void setUnit(String unit) {
		this.unit = unit;
	}

	
	/**
	 * <p>Discription:[获取项目价格]</p>
	 * Created on 2017年06月23日
	 * @return BigDecimal 项目价格
	 * @author:[王力]
	 */	
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}


	/**
	 * <p>Discription:[设置项目价格]</p>
	 * Created on 2017年06月23日
	 * @param unitPrice 项目价格
	 * @author:[王力]
	 */		
    public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	
	/**
	 * <p>Discription:[获取数量]</p>
	 * Created on 2017年06月23日
	 * @return Integer 数量
	 * @author:[王力]
	 */	
	public Integer getNum() {
		return num;
	}


	/**
	 * <p>Discription:[设置数量]</p>
	 * Created on 2017年06月23日
	 * @param num 数量
	 * @author:[王力]
	 */		
    public void setNum(Integer num) {
		this.num = num;
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
