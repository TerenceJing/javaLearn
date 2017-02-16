
package com.terence.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.aop.framework.ProxyFactory;

import com.terence.aop.api.BizLogic;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAPI extends UnitTestBase {
	public TestAOPAPI()
	{
		super("classpath:spring-aop-api.xml");
	}
	
	@Test
	public void testSave()
	{
		BizLogic logic=(BizLogic)super.getBean("bizLogicImpl");
		logic.save();
	}
	
}
