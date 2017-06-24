package org.offer.service.impl;

import java.util.List;

import org.offer.bean.DicProjectBean;
import org.offer.dao.DicProjectDAO;
import org.offer.http.APIStatus;
import org.offer.service.DicProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.camelot.openplatform.common.bean.DataGrid;
import com.camelot.openplatform.common.bean.ExecuteResult;
import com.camelot.openplatform.common.bean.Pager;

/**
 * <p>
 * Description: [工程项目表服务实现]
 * </p>
 * Copyright (c) 2017 北京柯莱特科技有限公司 Created on: 2017年06月23日
 * 
 * @author <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 */
@Service("dicProjectService")
public class DicProjectServiceImpl implements DicProjectService {

	/**
	 * <p>
	 * Discription:[日志对象]
	 * </p>
	 */
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * <p>
	 * [工程项目表Dao]
	 * </p>
	 **/
	@Autowired
	private DicProjectDAO dicProjectDAO;

	@Override
	public ExecuteResult<APIStatus> addProject(DicProjectBean bean) {
		logger.info("\n 方法[{}]，入参：[{}]", "DicProjectServiceImpl-addProject", "params:" + JSONObject.toJSONString(bean));
		ExecuteResult<APIStatus> result = new ExecuteResult<APIStatus>();
		try {
			//判断工程项目是否存在
			if (!isExistsName(bean)) {
				dicProjectDAO.add(bean);
				result.setResult(APIStatus.OK_200);
			} else {
				result.setResult(APIStatus.ERROR_401);
				logger.error("\n 方法[{}]，错误：[{}]", "DicProjectServiceImpl-addProject", "{" + bean.getName() + "}已存在");
			}
		} catch (Exception e) {
			logger.error("\n 方法[{}]，错误：[{}]", "DicProjectServiceImpl-addProject", e.getMessage());
			result.setResult(APIStatus.ERROR_500);
		}
		return result;
	}

	@Override
	public ExecuteResult<APIStatus> updateProject(DicProjectBean bean) {
		logger.info("\n 方法[{}]，入参：[{}]", "DicProjectServiceImpl-updateProject", "params:" + JSONObject.toJSONString(bean));
		ExecuteResult<APIStatus> result = new ExecuteResult<APIStatus>();
		try {
			//判断工程项目是否存在
			if (!isExistsName(bean)) {
				dicProjectDAO.update(bean);
				result.setResult(APIStatus.OK_200);
			} else {
				result.setResult(APIStatus.ERROR_401);
				logger.error("\n 方法[{}]，错误：[{}]", "DicProjectServiceImpl-updateProject", "{" + bean.getName() + "}已存在");
			}
		} catch (Exception e) {
			logger.error("\n 方法[{}]，错误：[{}]", "DicProjectServiceImpl-updateProject", e.getMessage());
			result.setResult(APIStatus.ERROR_500);
		}
		return result;
	}

	@Override
	public DataGrid<DicProjectBean> queryPage(String name, Integer page) {
		logger.info("\n 方法[{}]，入参：[{}]", "DicProjectServiceImpl-queryPage", "params:" + name +","+page);
		DataGrid<DicProjectBean> result = new DataGrid<DicProjectBean>();
		DicProjectBean param = new DicProjectBean();
		param.setName(name);
		Pager<DicProjectBean> pager = new Pager<DicProjectBean>();
		if(page != null){
			pager.setPage(page);
		}
		List<DicProjectBean> list = dicProjectDAO.queryList(param, pager, null);
		Long total = dicProjectDAO.queryCount(param, null);
		result.setRows(list);
		result.setTotal(total);
		return result;
	}

	@Override
	public ExecuteResult<APIStatus> deleteProject(Long id) {
		logger.info("\n 方法[{}]，入参：[{}]", "DicProjectServiceImpl-deleteProject", "params:" + id);
		ExecuteResult<APIStatus> result = new ExecuteResult<APIStatus>();
		try {
			dicProjectDAO.delete(id);
			result.setResult(APIStatus.OK_200);
		} catch (Exception e) {
			logger.error("\n 方法[{}]，错误：[{}]", "DicProjectServiceImpl-deleteProject", e.getMessage());
			result.setResult(APIStatus.ERROR_500);
		}
		return result;
	}

	/**
	 * @Title: isExistsName 
	 * @Description: 校验用户下的工程项目名称是否存在啊 
	 * @param bean 工程项目 用户id 必须有
	 * @return boolean true 存在,false 不存在
	 */
	private boolean isExistsName(DicProjectBean bean) {
		DicProjectBean param = new DicProjectBean();
		param.setName(bean.getName());
		param.setUserId(bean.getUserId());
		List<DicProjectBean> list = dicProjectDAO.queryList(param, null, null);
		if (list.size() > 0) {
			if (bean.getId()!=null && list.get(0).getId().equals(bean.getId())) {
				return false;
			}
			return true;
		}
		return false;
	}

}
