package org.offer.bean;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * <p>Description: [报价单子模块实体类]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 */
public class QuoModularBean implements Serializable {

	private Long id;//自增主键

	private Long quoId;//报价单id

	private String modNamer;//模块名称

	private BigDecimal modPrice;//合计价格

	private Integer modOrder;//排序



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
	 * <p>Discription:[获取报价单id]</p>
	 * Created on 2017年06月23日
	 * @return Long 报价单id
	 * @author:[王力]
	 */	
	public Long getQuoId() {
		return quoId;
	}


	/**
	 * <p>Discription:[设置报价单id]</p>
	 * Created on 2017年06月23日
	 * @param quoId 报价单id
	 * @author:[王力]
	 */		
    public void setQuoId(Long quoId) {
		this.quoId = quoId;
	}

	
	/**
	 * <p>Discription:[获取模块名称]</p>
	 * Created on 2017年06月23日
	 * @return String 模块名称
	 * @author:[王力]
	 */	
	public String getModNamer() {
		return modNamer;
	}


	/**
	 * <p>Discription:[设置模块名称]</p>
	 * Created on 2017年06月23日
	 * @param modNamer 模块名称
	 * @author:[王力]
	 */		
    public void setModNamer(String modNamer) {
		this.modNamer = modNamer;
	}

	
	/**
	 * <p>Discription:[获取合计价格]</p>
	 * Created on 2017年06月23日
	 * @return BigDecimal 合计价格
	 * @author:[王力]
	 */	
	public BigDecimal getModPrice() {
		return modPrice;
	}


	/**
	 * <p>Discription:[设置合计价格]</p>
	 * Created on 2017年06月23日
	 * @param modPrice 合计价格
	 * @author:[王力]
	 */		
    public void setModPrice(BigDecimal modPrice) {
		this.modPrice = modPrice;
	}

	
	/**
	 * <p>Discription:[获取排序]</p>
	 * Created on 2017年06月23日
	 * @return Integer 排序
	 * @author:[王力]
	 */	
	public Integer getModOrder() {
		return modOrder;
	}


	/**
	 * <p>Discription:[设置排序]</p>
	 * Created on 2017年06月23日
	 * @param modOrder 排序
	 * @author:[王力]
	 */		
    public void setModOrder(Integer modOrder) {
		this.modOrder = modOrder;
	}

	

}
