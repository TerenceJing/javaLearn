package com.terence.beanannotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terence.beanannotation.injection.dao.InjectionDAO;

@Service
public class InjectionServiceImpl implements InjectionService {

	//@Autowired //三种自动注入方式，成员变量注入，set注入，构造器注入
	private InjectionDAO injectionDAO;
	

	@Autowired
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		super();
		this.injectionDAO = injectionDAO;
	}

	//@Autowired
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void save(String arg) {
		//模拟业务操作
		System.out.println("Service接受参数："+arg);
		arg=arg+":"+this.hashCode();
		injectionDAO.save(arg);
	}
}
