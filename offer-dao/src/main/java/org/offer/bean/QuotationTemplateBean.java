package org.offer.bean;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * <p>Description: [报价单模板实体类]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 */
public class QuotationTemplateBean implements Serializable {

	private Long id;//自增主键

	private Long userId;//用户id

	private String temName;//模板名称

	private BigDecimal totalPrice;//统计价格

	private String temDes;//模板描述



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
	 * <p>Discription:[获取模板名称]</p>
	 * Created on 2017年06月23日
	 * @return String 模板名称
	 * @author:[王力]
	 */	
	public String getTemName() {
		return temName;
	}


	/**
	 * <p>Discription:[设置模板名称]</p>
	 * Created on 2017年06月23日
	 * @param temName 模板名称
	 * @author:[王力]
	 */		
    public void setTemName(String temName) {
		this.temName = temName;
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
	 * <p>Discription:[获取模板描述]</p>
	 * Created on 2017年06月23日
	 * @return String 模板描述
	 * @author:[王力]
	 */	
	public String getTemDes() {
		return temDes;
	}


	/**
	 * <p>Discription:[设置模板描述]</p>
	 * Created on 2017年06月23日
	 * @param temDes 模板描述
	 * @author:[王力]
	 */		
    public void setTemDes(String temDes) {
		this.temDes = temDes;
	}

	

}
