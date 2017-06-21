package org.offer.service;

import org.offer.bean.AreaBean;

/** 
 * <p>Description: [service  测试]</p>
 * Created on 2017年6月21日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部 
 */ 
public interface IAreaService{
	
	/**
	 * <p>Discription:[根据id查询bin]</p>
	 * Created on 2017年6月21日
	 * @param id
	 * @return
	 * @author:[王力]
	 */
	public AreaBean queryById(Integer id);
	
}
