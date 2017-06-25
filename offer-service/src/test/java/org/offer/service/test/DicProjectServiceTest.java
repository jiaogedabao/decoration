package org.offer.service.test;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.offer.bean.DicProjectBean;
import org.offer.service.DicProjectService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.camelot.openplatform.common.bean.DataGrid;
import com.camelot.openplatform.common.bean.ExecuteResult;
import com.camelot.openplatform.common.bean.Pager;


/**
* @ClassName: DicProjectServiceTest
* @Description: 工程项目服务接口单元测试
* @author wangdada 
* @date 2017年6月24日
*
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DicProjectServiceTest {
	
	@Resource
	private DicProjectService service;
	
	@Test
	public void add(){
		DicProjectBean bean = new DicProjectBean();
		bean.setName("刮腻子");
		bean.setPrice(BigDecimal.valueOf(18.00));
		bean.setUnit("平米");
		bean.setDesConstruction("刮三边腻子");
		bean.setDesStuff("飞鸽牌反水腻子");
		ExecuteResult<JSONObject> result = service.addProject(bean);
		System.out.println("------------add:" + JSONObject.toJSONString(result));
	}

	
	/**
	* @Title: update
	* @Description: 工程项目编辑测试
	* @param     参数
	* @return void    返回类型
	* @throws
	*/
	@Test
	public void update(){
		DicProjectBean bean = new DicProjectBean();
		bean.setId(1L);
		bean.setName("刮腻子");
		bean.setPrice(BigDecimal.valueOf(18.00));
		bean.setUnit("平米");
		bean.setDesConstruction("刮两边腻子");
		bean.setDesStuff("飞鸽牌反水腻子");
		ExecuteResult<JSONObject> result = service.updateProject(bean);
		System.out.println("------------update:" + JSONObject.toJSONString(result));
	}
	
	
	/**
	* @Title: queryPage
	* @Description: 工程项目分页查询测试
	* @param     参数
	* @return void    返回类型
	* @throws
	*/
	@Test
	public void queryPage(){
		String name = "刮腻子2";
		Pager<DicProjectBean> page = new Pager<DicProjectBean>();
		DataGrid<DicProjectBean> result = service.queryPage(name, page);
		System.out.println("------------queryPage:" + JSONObject.toJSONString(result));
	}
	
	
	/**
	* @Title: delete
	* @Description: 工程项目删除测试
	* @param     参数
	* @return void    返回类型
	* @throws
	*/
	@Test
	public void delete(){
		ExecuteResult<JSONObject> result = service.deleteProject(1L);
		System.out.println("------------delete:" + JSONObject.toJSONString(result));
	}
	
}
