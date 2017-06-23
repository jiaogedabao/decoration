package org.offer.service.impl;

import org.offer.dao.SuppliesDAO;
import org.offer.service.SuppliesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p>Description: [耗材表服务实现]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on: 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 */
@Service("suppliesService")
public class SuppliesServiceImpl implements SuppliesService {

   /**
    * <p>Discription:[日志对象]</p>
    */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

   /**
    * <p>[耗材表Dao]</p>
    **/
    @Autowired
    private SuppliesDAO  suppliesDAO ;

}
