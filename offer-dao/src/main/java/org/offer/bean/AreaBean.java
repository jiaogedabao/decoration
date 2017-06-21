package org.offer.bean;

import java.io.Serializable;

/**
 * <p>Description: [办公区域实体类，映射于area表]</p>
 * Created on 2017年6月16日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部 
 */ 
public class AreaBean implements Serializable{

	private Long id;//主键
	private String areaName;//区域名称
	private String areaLevel;//区域等级(L1:城市,L2:办公楼,L3:楼层)
	private Long parentId;//父级区域id(area->id)
	private java.math.BigDecimal cityStandard;//城市餐标，仅一级区域(城市)可设置餐标
	private Long areaId1;//一级区域id
	private Long areaId2;//二级区域id
	private String areaName1;//一级区域名称
	private String areaName2;//二级区域名称
	private Boolean isDelete;//是否删除( 0 : 否 1: 是)
	private java.util.Date createDate;//创建的时间
	private java.util.Date updateDate;//修改的时间
	
// setter and getter
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public String getAreaName(){
		return areaName;
	}
	
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	public String getAreaLevel(){
		return areaLevel;
	}
	
	public void setAreaLevel(String areaLevel){
		this.areaLevel = areaLevel;
	}
	public Long getParentId(){
		return parentId;
	}
	
	public void setParentId(Long parentId){
		this.parentId = parentId;
	}
	public java.math.BigDecimal getCityStandard(){
		return cityStandard;
	}
	
	public void setCityStandard(java.math.BigDecimal cityStandard){
		this.cityStandard = cityStandard;
	}
	public Long getAreaId1(){
		return areaId1;
	}
	
	public void setAreaId1(Long areaId1){
		this.areaId1 = areaId1;
	}
	public Long getAreaId2(){
		return areaId2;
	}
	
	public void setAreaId2(Long areaId2){
		this.areaId2 = areaId2;
	}
	public String getAreaName1(){
		return areaName1;
	}
	
	public void setAreaName1(String areaName1){
		this.areaName1 = areaName1;
	}
	public String getAreaName2(){
		return areaName2;
	}
	
	public void setAreaName2(String areaName2){
		this.areaName2 = areaName2;
	}
	public Boolean getIsDelete(){
		return isDelete;
	}
	
	public void setIsDelete(Boolean isDelete){
		this.isDelete = isDelete;
	}
	public java.util.Date getCreateDate(){
		return createDate;
	}
	
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	public java.util.Date getUpdateDate(){
		return updateDate;
	}
	
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
}
