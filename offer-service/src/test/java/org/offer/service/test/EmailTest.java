package org.offer.service.test;

import java.io.File;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Template;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailTest {

	@Autowired
    private JavaMailSender mailSender; //自动注入的Bean
	
	@Value("${spring.mail.username}")
    private String Sender; //读取配置文件中的参数
	
	@Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;
	
	@Test
    public void sendSimpleMail() throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("wlsnnew@sina.com");
        message.setTo("673132594@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }
	
	@Test
	public void sendTempalte(){
		MimeMessage message = null;
        try {
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("wlsnnew@sina.com");
            helper.setTo("673132594@qq.com");
            helper.setSubject("主题：Home-Decoratioin 报价单");
            Map<String, Object> model = new HashedMap();
            model.put("userName", "wangdada");
            model.put("customer", "小帅");
            model.put("userEmail", "wangdada.qq.com");
            model.put("userPhone", "110119120112");
            //读取 html 模板
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate("/mailtemplate.ftl");
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
            helper.setText(html, true);
          //注意项目路径问题，自动补用项目路径
            FileSystemResource file = new FileSystemResource(new File("src/main/resources/baojiadan.xls"));
            //加入邮件
            helper.addAttachment("报价单", file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mailSender.send(message);
		
	}
}
