package org.offer.service.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.offer.bean.AreaBean;
import org.offer.service.IAreaService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;

/**
 * Unit test for simple App.
 */
/** 
 * <p>Description: [service 单元测试]</p>
 * Created on 2017年6月21日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部 
 */ 
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceTest {

	@Resource
	private IAreaService areaService;

	/**
	 * <p>Discription:[单元测试id查询]</p>
	 * Created on 2017年6月21日
	 * @author:[王力]
	 */
	@Test
	public void queryById() {
		AreaBean bean = areaService.queryById(1);
		System.out.println("----------------queryById:" + JSONObject.toJSONString(bean));
	}
}
