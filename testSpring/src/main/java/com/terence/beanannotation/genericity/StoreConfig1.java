package com.terence.beanannotation.genericity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig1 {
	@Autowired
	private Store1<String> s1;
	@Autowired
	private Store1<Integer> s2;

	@Bean
	public StringStore1 stringStore1()
	{
		return new StringStore1();
	}
	@Bean
	public IntegerStore1 integerStore1()
	{
		return new IntegerStore1();
	}
	
	@Bean(name="stringStoreTest1")
	public Store1 stringStoreTest1()	
	{
		System.out.println("s1:"+s1.getClass().getName());
		System.out.println("s2:"+s2.getClass().getName());
		return new StringStore1();
	}
	

}
