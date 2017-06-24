package org.offer.service;

import org.offer.bean.DicProjectBean;

import com.alibaba.fastjson.JSONObject;
import com.camelot.openplatform.common.bean.DataGrid;
import com.camelot.openplatform.common.bean.ExecuteResult;
import com.camelot.openplatform.common.bean.Pager;

/** 
 * <p>Description: [工程项目表服务]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 */
public interface DicProjectService{
	
	
	/**
	* @Title: addProject
	* @Description: 添加工程项目
	* @param @param bean  工程项目对象
	* @param @return    参数
	* @return ExecuteResult<Map<String,Boolean>>    返回类型
	* @throws
	*/
	ExecuteResult<JSONObject> addProject(DicProjectBean bean);
	
	
	/**
	* @Title: updateProject
	* @Description: 修改工程项目
	* @param @param bean 工程项目对象
	* @param @return    参数
	* @return ExecuteResult<Map<String,Boolean>>    返回类型
	* @throws
	*/
	ExecuteResult<JSONObject> updateProject(DicProjectBean bean);
	
	
	/**
	* @Title: queryPage
	* @Description: 分页查询工程项目列表
	* @param @param name  工程项目名称
	* @param @param page  分页参数
	* @param @return    参数
	* @return DataGrid<DicProjectBean>    返回类型
	* @throws
	*/
	DataGrid<DicProjectBean> queryPage(String name, Pager<DicProjectBean> page);
	
	
	/**
	* @Title: deleteProject
	* @Description: 删除工程项目
	* @param @param id  工程项目id
	* @param @return    参数
	* @return ExecuteResult<Map<String,Boolean>>    返回类型
	* @throws
	*/
	ExecuteResult<JSONObject> deleteProject(Long id);

}
