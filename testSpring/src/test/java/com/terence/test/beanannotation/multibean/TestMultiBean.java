package com.terence.test.beanannotation.multibean;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.beanannotation.multibean.BeanInvoker;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestMultiBean extends UnitTestBase {
	public TestMultiBean()
	{
		super("classpath*:spring-beanannotation.xml");
	}
	@Test //通过配置文件里面的配置项扫描包下的所有类，自动装配数组集合类型的对象
	//结果表明可以将接口所有的实现类自动注入到集合当中去
	public void testMultiBean()
	{
		BeanInvoker invoker=super.getBean("beanInvoker");
		invoker.say();
	}
}

