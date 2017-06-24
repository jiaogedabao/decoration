package org.offer.service.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.offer.utils.RedisDB;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;


/**
* @ClassName: RedisDBTest
* @Description: redis 单元测试
* @author wangdada
* @date 2017年6月24日
*
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDBTest {
	
	@Resource
	private RedisDB redisDB;
	
	
	/**
	* @Title: addTest
	* @Description: 添加测试
	* @param     参数
	* @return void    返回类型
	* @throws
	*/
	@Test
	public void addTest(){
		redisDB.addObject("a", "hello");
	}
	
	@Test
	public void queryTest(){
		Object obj = redisDB.get("a");
		System.out.println("-------------------------queryTest:" + obj);
	}

}
