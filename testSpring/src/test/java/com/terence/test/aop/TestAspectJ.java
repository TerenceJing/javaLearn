package com.terence.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.aop.aspectj.biz.TerenceBiz;
import com.terence.test.base.UnitTestBase;
//Spring Bean ×°Åä/AOP»ù´¡/AOP API
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectJ extends UnitTestBase {
	public TestAspectJ()
	{
		super("classpath:spring-aop-aspectj.xml");
	}
	
	@Test
	public void test()
	{
		TerenceBiz biz=getBean("terenceBiz");
		biz.save("this is test");
	}
}

