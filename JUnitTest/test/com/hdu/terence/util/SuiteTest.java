package com.hdu.terence.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)//修改测试运行期，表示这是测试套件类的入口
@Suite.SuiteClasses(value = { TaskTest1.class,TaskTest2.class,TaskTest3.class })
public class SuiteTest {

	/*
	 * 保证测试套件为空，运行添加的所有测试类。
	 * 测试套件就是组织测试类一起运行的 
	 * 需要写一个测试套件的入口类，这个类里不包含其他的方法
	 * 更改测试运行器的Suite.class
	 * 将要测试的类作为数组传入到Suite.SuiteClasses
	 */	
}
