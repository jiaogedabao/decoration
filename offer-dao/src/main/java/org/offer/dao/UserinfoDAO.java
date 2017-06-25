package org.offer.dao;

import org.apache.ibatis.annotations.Mapper;
import org.offer.bean.UserinfoBean;

import com.camelot.openplatform.common.dao.BaseDAO;


/** 
 * <p>Description: [系统用户表持久层接口]</p>
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 * Copyright (c) 2017 北京柯莱特科技有限公司
 */
@Mapper
public interface UserinfoDAO extends BaseDAO<UserinfoBean> {
	
	UserinfoBean queryByName(String loginName);

}