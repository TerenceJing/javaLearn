package com.terence.test.ioc.interfaces;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.ioc.interfaces.OneInterface;
import com.terence.test.base.UnitTestBase;




@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

	public TestOneInterface() {
		super("classpath*:spring-ioc.xml");
	}
	
	@Test
	public void testHello() {
		OneInterface oneInterface = super.getBean("oneInterface");
		System.out.println(oneInterface.hello("Terece Jing"));
	}
}
