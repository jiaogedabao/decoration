package org.offer.dao.test;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.offer.bean.DicSuppliesBean;
import org.offer.dao.DicSuppliesDAO;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;

/**
* @ClassName: DicSuppliesDAOTest
* @Description: 耗材持久层单元测试
* @author wangdada
* @date 2017年6月24日
*
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class DicSuppliesDAOTest {
	
	@Resource
	private DicSuppliesDAO dao;
	
	
	/**
	* @Title: add
	* @Description: 单元测试添加接口
	* @param     参数
	* @return void    返回类型
	* @throws
	*/
	@Test
	public void add(){
		DicSuppliesBean bean = new DicSuppliesBean();
		bean.setName("砂纸");
		bean.setPrice(BigDecimal.valueOf(15.00));
		bean.setRemarks("每份100张");
		bean.setUserId(1L);
		dao.add(bean);
	}
	
	
	/**
	* @Title: update
	* @Description: 单元测试修改
	* @param     参数
	* @return void    返回类型
	* @throws
	*/
	@Test
	public void update(){
		DicSuppliesBean bean = new DicSuppliesBean();
		bean.setId(1L);
		bean.setName("砂纸");
		bean.setPrice(BigDecimal.valueOf(15.00));
		bean.setRemarks("每份10张");
		bean.setUserId(1l);
		dao.update(bean);
	}
	
	
	/**
	* @Title: queryList
	* @Description: 单元测试集合查询
	* @param     参数
	* @return void    返回类型
	* @throws
	*/
	@Test
	public void queryList(){
		List<DicSuppliesBean> list = dao.queryList(null, null, null);
		System.out.println("------------------queryList:" + JSONObject.toJSONString(list));
	}

}
