package org.offer.dao;

import org.apache.ibatis.annotations.Mapper;
import org.offer.bean.AreaBean;

import com.camelot.openplatform.common.dao.BaseDAO;

/** 
 * <p>Description: [办公区域持久层接口]</p>
 * Created on 2017年6月16日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部 
 */ 
@Mapper
public interface AreaDAO extends BaseDAO<AreaBean>{
}
