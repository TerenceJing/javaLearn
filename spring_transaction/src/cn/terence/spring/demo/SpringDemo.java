package cn.terence.spring.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Terence
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo {
	
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
