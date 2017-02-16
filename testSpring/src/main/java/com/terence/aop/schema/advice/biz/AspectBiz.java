package com.terence.aop.schema.advice.biz;

//业务类
public class AspectBiz {
	
	public void biz() {
		System.out.println("AspectBiz biz.");
		//throw new RuntimeException(); //在业务逻辑中是否抛出异常
	}
	
	public void init(String bizName, int times) {
		System.out.println("AspectBiz init : " + bizName + "   " + times);
	}
	
}
