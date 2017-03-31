package com.hdu.terence.util;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {
	/*
	 * @Test 将一个方法修饰成测试方法 
	 *   @Test(excepted=XX.class)
	 *   @Test(timeout=毫秒)
	 * @BeforeClass 他会在所有的方法运行前被执行，static修饰
	 * @AfterClass  他会在所有的方法结束后背自行，static修饰
	 * @Before 会在每一个测试方法被运行前执行一次
	 * @After  会在每一个测试方法运行后背执行一次。
	 * @Ignore 所修饰的方法会被测试运行器忽略 后面可以加上 ("忽略说明内容")
	 * @RunWith:可以更改测试运行器 org.junit.runner.Runner
	 * 
	 */
	
	/*
	 * expected=ArithmeticException.class表示预期抛出异常，运行达到运行结果，表示运行成功。
	 */
	@Test(expected=ArithmeticException.class)
	public void testAdd()
	{
		assertEquals(3,new Calculate().divide(6, 0));
	}
	
	
	/*
	 * @Test(timeout=2000)	表示测试执行在2s内循环执行，超出该时间段则循环停止，表示测试可能出现的错误执行得到终止。
	 */
	@Ignore("这个方法不能被执行")
	@Test(timeout=2000)	
	public void testWhile()
	{
		while(true)
		{
			System.out.println("run forever……");
		}		
	}
	
	/*
	 * 测试只执行两秒。
	 */
	@Test(timeout=3000)
	public void testReadFile()
	{
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
