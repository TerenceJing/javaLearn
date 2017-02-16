package com.terence.beanannotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ImportResource("classpath:config.xml")
public class StorConfig {
/*	@Value("${url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${password}")
	private String password;
	
	@Bean
	public MyDriverManager myDriverManager()
	{
		return new MyDriverManager(url,username,password);
	}*/
	
	
	
	@Bean(name="store" ,initMethod="init",destroyMethod="destroy")
	//自定义name,初始化方法和销毁方法创建对象之前执行init，创建玩对象之后执行销毁方法。
	public Store stringStore1()
	{
		return new StringStore();
	}
	
	@Bean(name="stringStore" ,initMethod="init",destroyMethod="destroy")
	           //自定义name,初始化方法和销毁方法创建对象之前执行init，创建玩对象之后执行销毁方法。
	@Scope(value="prototype",proxyMode=ScopedProxyMode.TARGET_CLASS) 
	           //value="prototype"表示每次请求都创建一个新的对象,加上proxyMode=ScopedProxyMode.TARGET_CLASS则同一个代理类
	public Store stringStore2()
	{
		return new StringStore();
	}

}
