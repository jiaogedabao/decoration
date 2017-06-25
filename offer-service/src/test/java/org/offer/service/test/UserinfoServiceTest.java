package org.offer.service.test;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.offer.http.APIStatus;
import org.offer.service.UserinfoService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.camelot.openplatform.common.bean.ExecuteResult;

/** 
 * <p>Description: [service 单元测试]</p>
 * Created on 2017年6月25日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部 
 */ 
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserinfoServiceTest {
	@Resource
	private UserinfoService userinfoService;
	
	@Test
	public void loginSys(){
		ExecuteResult<APIStatus> result = userinfoService.loginSys("童1", "123");
		System.out.println("------------");
		System.out.println("result="+JSONObject.toJSON(result));
	}
	
	
	
}





