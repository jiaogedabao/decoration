package org.offer.utils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.collections.map.HashedMap;
import org.offer.common.entity.EmailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;

/**
 * @ClassName: EmaiUtils
 * @Description: email服务工具
 * @author wangdada
 * @date 2017年6月24日
 *
 */
@Component
public class EmaiUtils {

	/**
	 * @Fields maile发送服务工具
	 */
	@Autowired
	private JavaMailSender mailSender;

	/**
	 * @Fields FreeMarkerConfigurer 配置工具
	 */
	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;

	/**
	 * @Fields 发送邮箱
	 */
	@Value("${spring.mail.username}")
	private String sendUser;

	/**
	 * @throws MessagingException 
	 * @throws IOException 
	 * @throws ParseException 
	 * @throws MalformedTemplateNameException 
	 * @throws TemplateNotFoundException 
	 * @Title: sendTempalte @Description: TODO(这里用一句话描述这个方法的作用) @param
	 * 参数 @return void 返回类型 @throws
	 */
	public void sendTempalte(EmailEntity entity) throws Exception {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(sendUser);
		helper.setTo(entity.getAcceptMail());
		helper.setSubject("主题：Home-Decoratioin 报价单");
		Map<String, Object> model = new HashedMap();
		model.put("userName", entity.getSendName());
		model.put("customer", entity.getAcceptName());
		model.put("userEmail", entity.getSendMail());
		model.put("userPhone", entity.getSendPhone());
		// 读取 html 模板
		Template template = freeMarkerConfigurer.getConfiguration().getTemplate("/mailtemplate.ftl");
		String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
		helper.setText(html, true);
		// 注意项目路径问题，自动补用项目路径
		if(entity.getFiles() != null && entity.getFiles().size() > 0){
			for(Map.Entry<String, File> item : entity.getFiles().entrySet()){
				FileSystemResource file = new FileSystemResource(item.getValue());
				// 加入邮件
				helper.addAttachment(item.getKey(), file);
			}
		}
		mailSender.send(message);
	}

}
