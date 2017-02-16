package com.terence.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface
{

	public String hello(String word) {
		return "Word form interface\"OneInterface\":"+word;
	}
}
