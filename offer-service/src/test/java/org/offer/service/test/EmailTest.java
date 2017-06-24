package org.offer.service.test;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.offer.utils.EmaiUtils;
import org.offer.utils.EmailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailTest {

	@Autowired
	private EmaiUtils emaiUtils;
	
	@Test
	public void sendTempalte(){
		try {
			EmailEntity entity = new EmailEntity();
			entity.setSendMail("wangdada@sina.com");
			entity.setSendName("wangdada");
			entity.setSendPhone("110");
			entity.setAcceptMail("673132594@qq.com");
			entity.setAcceptName("小A");
			File file = new File("src/main/resources/baojiadan.xls");
			entity.addFile("报价单", file);
			emaiUtils.sendTempalte(entity);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
