package com.terence.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

//@Service
@Named
public class JsrService {
	//@Resource
	@Inject
	private JsrDAO jsrDAO;
	//@Resource
	public void setJsrDAO(JsrDAO jsrDAO)
	{
		this.jsrDAO=jsrDAO;
	}
	public void save()
	{
		jsrDAO.save();
		jsrDAO1.save();
	}
	@PostConstruct
	public void init()
	{
		System.out.println("JsrService init");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("JsrService destroy");
	}
	
	private JsrDAO jsrDAO1;
	@Inject
	public void setJsrDAO1(@Named("jsrDAO")JsrDAO jsrDAO1) {
		this.jsrDAO1 = jsrDAO1;
	}
	

}
