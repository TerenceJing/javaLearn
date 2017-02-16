package com.terence.aop.schema.advisors.service;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

@Service
public class InvokeService {
	
	//正常调用
	public void invoke() {
		System.out.println("InvokeService ......");
	}
	
	//超出最大常识次数的调用
	public void invokeException() {
		throw new PessimisticLockingFailureException("");
	}

}
