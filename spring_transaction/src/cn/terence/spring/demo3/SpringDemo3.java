package cn.terence.spring.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * Spring声明式事务管理方式2测试类：基于AspectJ的XML配置方式
 * @author Terence
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo3 {
	
	@Resource(name="accountService")
	private AccountService accountService;
	
	/*
	 * 转账案例测试
	 */
	@Test 
	public void demo()
	{
		accountService.transfer("aaa", "bbb", 300d);
	}
}
