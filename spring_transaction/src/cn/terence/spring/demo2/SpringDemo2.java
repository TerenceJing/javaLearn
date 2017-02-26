package cn.terence.spring.demo2;

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
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {
	
	/*
	 * 需要注入增强后的代理类
	 */
	//@Resource(name="accountService")
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	/*
	 * 转账案例测试
	 */
	@Test 
	public void demo2()
	{
		accountService.transfer("aaa", "bbb", 300d);
	}
}
