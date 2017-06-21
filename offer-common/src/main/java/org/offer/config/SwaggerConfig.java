package org.offer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.context.request.async.DeferredResult;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
 * <p>Description: [访问路径http://localhost:8080/swagger-ui.html]</p>
 * Created on 2017年5月16日
 * @author  <a href="mailto: hanshixiong@camelotchina.com">韩士雄</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Autowired
	private Environment env;
	/**
	 * 
	 * <p>Discription:[swagger 基础配置]</p>
	 * Created on 2017年5月27日
	 * @return
	 * @author[hanshixiong]
	 */
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName(env.getProperty("swagger.group"))
        		.genericModelSubstitutes(DeferredResult.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage(env.getProperty("swagger.basePackage")))//要扫描的API(Controller)基础包
                .paths(PathSelectors.any())
                .build()
                .apiInfo(didiApiInfo());
    }

    /**
     * 
     * <p>Discription:[swagger文档说明]</p>
     * Created on 2017年5月27日
     * @return
     * @author[hanshixiong]
     */
    private ApiInfo didiApiInfo() {
    	String title = env.getProperty("swagger.title")==null?"Swagger API":env.getProperty("swagger.title");
    	String description = env.getProperty("swagger.description")==null?"Show your API description":env.getProperty("swagger.description");
    	String version = env.getProperty("swagger.version")==null?"version":env.getProperty("swagger.version");
    	String name = env.getProperty("swagger.contact.name")==null?"author":env.getProperty("swagger.contact.name");
    	String url = env.getProperty("swagger.contact.url")==null?"url":env.getProperty("swagger.contact.url");
    	String email = env.getProperty("swagger.contact.email")==null?"email":env.getProperty("swagger.contact.email");
        return new ApiInfoBuilder()
            .title(title)//大标题
            .description(description)//详细描述
            .version(version)//版本
            .contact(new Contact(name, url, email))//作者
            .build();
    }
}
