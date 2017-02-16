package com.terence.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.aop.schema.advice.Fit;
import com.terence.aop.schema.advice.biz.AspectBiz;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase {
	public TestAOPSchemaAdvice()
	{
		super("classpath:spring-aop-schema-advice.xml");
	}
	
	/*@Test
	public void testBiz()
	{
		AspectBiz biz=super.getBean("aspectBiz");
		biz.biz();
	}*/
	
	@Test
	public void testInit()
	{
		AspectBiz biz=super.getBean("aspectBiz");
		biz.init("Terence Jing", 600);
	}
	
	@Test
	public void testFit()
	{
		Fit fit=(Fit)super.getBean("aspectBiz");
		fit.filter();
		
	}
	
}
