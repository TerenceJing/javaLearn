package cn.terence.spring.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 转账案例测试类
 * @author Terence
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {
	
	@Resource(name="accountService")
	private AccountService accountService;
	@Test //junit jar包
	public void demo1()
	{
		accountService.transfer("aaa", "bbb", 200d);
	}
}
