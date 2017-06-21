package org.offer.dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.offer.bean.AreaBean;
import org.offer.dao.AreaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest{
	
	 @Autowired
	 private AreaDAO dao;
	
	
	/**
	 * <p>Discription:[单元测试根据id查询数据]</p>
	 * Created on 2017年6月21日
	 * @author:[王力]
	 */
	@Test
	public void queryById(){
		AreaBean bean = new AreaBean();
		bean = dao.queryById(1);
		System.out.println(JSONObject.toJSONString(bean));
	}
	
	/**
	 * <p>Discription:[单元测试添加数据]</p>
	 * Created on 2017年6月21日
	 * @author:[王力]
	 */
	@Test
	public void add(){
		AreaBean bean = new AreaBean();
		bean.setId(2l);
		bean.setAreaName("上海");
		dao.add(bean);
		System.out.println(JSONObject.toJSONString(bean));
	}
}
