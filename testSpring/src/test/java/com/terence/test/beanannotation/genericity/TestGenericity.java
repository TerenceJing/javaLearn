package com.terence.test.beanannotation.genericity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestGenericity extends UnitTestBase{
	public TestGenericity()
	{
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void testG()
	{
		super.getBean("stringStoreTest1");
	}
}
