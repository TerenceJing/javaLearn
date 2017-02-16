package com.terence.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*public class BeanLifeCycle {
	public void start()
	{
		System.out.println("Bean start()");
	}
	
	public void stop()
	{
		System.out.println("Bean stop()");
	}
}
*/
public class BeanLifeCycle implements InitializingBean,DisposableBean{

	
	public void start()
	{
		System.out.println("Bean start()");
	}
	
	public void stop()
	{
		System.out.println("Bean stop()");
	}
	
	public void destroy() throws Exception {
		System.out.println("Bean destory");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean afterPropertiesSet");
		
	}
	
	public void defaultInit()
	{
		System.out.println("Bean defaultInit()");
	}
	
	public void defaultDestroy()
	{
		System.out.println("Bean defaultDestroy()");
	}
}