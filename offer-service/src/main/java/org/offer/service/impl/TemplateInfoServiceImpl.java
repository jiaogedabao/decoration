package org.offer.service.impl;

import org.offer.dao.TemplateInfoDAO;
import org.offer.service.TemplateInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p>Description: [模板详情服务实现]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on: 2017年06月23日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 */
@Service("templateInfoService")
public class TemplateInfoServiceImpl implements TemplateInfoService {

   /**
    * <p>Discription:[日志对象]</p>
    */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

   /**
    * <p>[模板详情Dao]</p>
    **/
    @Autowired
    private TemplateInfoDAO  templateInfoDAO ;

}
