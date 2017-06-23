package org.offer.dao;

import org.apache.ibatis.annotations.Mapper;
import org.offer.bean.QuotationBean;

import com.camelot.openplatform.common.dao.BaseDAO;


/** 
 * <p>Description: [报价单持久层接口]</p>
 * Created on 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0
 * Copyright (c) 2017 北京柯莱特科技有限公司
 */
@Mapper
public interface QuotationDAO extends BaseDAO<QuotationBean> {


}