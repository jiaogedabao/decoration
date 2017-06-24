package org.offer.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.clients.jedis.JedisPoolConfig;

/** 
 * <p>Description: [redis配置类]</p>
 * Created on 2017年6月22日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部 
 */ 
@Configuration  
@EnableAutoConfiguration 
public class RedisConfig {
    
	/**
	 * 
	 * <p>Description:[获取配置文件]</p>
	 * Created on 2017年6月22日
	 * @return JedisPoolConfig
	 * @author:[王力]
	 */
    @Bean  
    @ConfigurationProperties(prefix="spring.redis")  
    public JedisPoolConfig getRedisConfig(){  
        JedisPoolConfig config = new JedisPoolConfig();  
        return config;  
    }  
    
	/**
	 * 
	 * <p>Description:[获取连接工厂]</p>
	 * Created on 2017年6月22日
	 * @return JedisConnectionFactory
	 * @author:[王力]
	 */
    @Bean  
    @ConfigurationProperties(prefix="spring.redis")  
    public JedisConnectionFactory getConnectionFactory(){  
        JedisConnectionFactory factory = new JedisConnectionFactory();  
        JedisPoolConfig config = getRedisConfig();  
        factory.setPoolConfig(config);  
        return factory;  
    }  
      
	/**
	 * 
	 * <p>Description:[获取RedisTemplate]</p>
	 * Created on 2017年6月22日
	 * @return RedisTemplate
	 * @author:[王力]
	 */
    @Bean  
    public RedisTemplate<?, ?> getRedisTemplate(){  
        RedisTemplate<?,?> template = new StringRedisTemplate(getConnectionFactory());  
        return template;  
    } 
}
