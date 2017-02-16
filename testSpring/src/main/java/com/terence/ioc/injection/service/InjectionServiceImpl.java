package com.terence.ioc.injection.service;

import com.terence.ioc.injection.dao.InjectionDAO;
import com.terence.ioc.injection.dao.InjectionDAOImpl;

public class InjectionServiceImpl implements InjectionService {
	
	private InjectionDAO injectionDAO;
	
	//构造注入
	public InjectionServiceImpl(InjectionDAOImpl injectionDAO) {
		this.injectionDAO = injectionDAO;
	}
	
	//设值注入
	public void setInjectionDAO(InjectionDAOImpl injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void save(String arg) {
		
		System.out.println("依赖注入InjectionSservice接受的参数是"+arg);
		arg=arg+":"+this.hashCode();
		injectionDAO.save(arg);
	}

}
