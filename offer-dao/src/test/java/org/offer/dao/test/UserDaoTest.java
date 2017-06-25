package org.offer.dao.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.offer.bean.UserinfoBean;
import org.offer.dao.DicProjectDAO;
import org.offer.dao.UserinfoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	@Resource
	private UserinfoDAO dao;
	
	@Autowired
    private DicProjectDAO  dicProjectDAO ;
	
	@Test
	public void add(){
		UserinfoBean user = new UserinfoBean();
		user.setLoginName("王莉萍");
		dao.add(user);
	}
	
	@Test
	public void queryByName(){
		UserinfoBean user = dao.queryByName("童");
		System.out.println(user);
	}
	
}
