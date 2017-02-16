package com.terence.test.resource;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.resource.TerenceResource;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {
	
	public TestResource() {
		super("classpath:spring-resource.xml");
	}
	
	@Test
	public void testResource() {
		TerenceResource resource = super.getBean("terenceResource");
		try {
			resource.resource();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
