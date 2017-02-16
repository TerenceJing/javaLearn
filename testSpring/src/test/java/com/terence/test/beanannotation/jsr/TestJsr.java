package com.terence.test.beanannotation.jsr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.beanannotation.jsr.JsrService;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase{
	public TestJsr()
	{
		super("classpath*:spring-beanannotation.xml");
	}
	@Test
	public void testSave()
	{
		JsrService service=super.getBean("jsrService");
		service.save();
		
	}

}
