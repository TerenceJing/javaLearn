package cn.terence.spring.demo4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * Spring声明式事务管理方式1测试类
 * @author Terence
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {
	
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
