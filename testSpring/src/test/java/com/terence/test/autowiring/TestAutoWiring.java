package com.terence.test.autowiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.autowiring.AutoWiringService;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase {
	
	public TestAutoWiring() {
		super("classpath:spring-autowiring.xml");
	}
	
	@Test
	public void testSay() {
		AutoWiringService service = super.getBean("autoWiringService");
		service.say("This is a test");
	}

}
