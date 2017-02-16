package com.terence.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;


public class TerenceResource implements ApplicationContextAware  {
	
	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void resource() throws IOException {
//		Resource resource = applicationContext.getResource("config.txt");//依赖于applicationContext也是classpath类型
//		Resource resource = applicationContext.getResource("classpath:config.txt");
//		Resource resource = applicationContext.getResource("file:config.txt");
		Resource resource = applicationContext.getResource("url:https://www.baidu.com/?tn=98012088_5_dg");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
