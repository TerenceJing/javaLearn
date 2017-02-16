package com.terence.test.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifecycle extends UnitTestBase{
	public TestBeanLifecycle()
	{
		super("classpath*:spring-lifecycle.xml");
	}
	@Test
	public void say1()
	{
		super.getBean("beanLifeCycle");
	}
}



