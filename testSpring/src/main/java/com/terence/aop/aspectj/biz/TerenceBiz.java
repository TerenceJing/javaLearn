package com.terence.aop.aspectj.biz;

import org.springframework.stereotype.Service;

/*
 * “µŒÒ¿‡
 */
@Service
public class TerenceBiz {
	
	@TerenceMethod("TerenceBiz save with TerenceMethod")
	public String save(String arg)
	{
		System.out.println("TerenceBiz save:"+arg);
	    //throw new RuntimeException(" Save failed!");
		return "Save success!";
	}

}
