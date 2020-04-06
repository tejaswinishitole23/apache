package com.learnapache.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.learnapache.services.HelloWorld;

@WebService(endpointInterface = "com.learnapache.services.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	@WebMethod
	public String sayHi(String msg) {
		// TODO Auto-generated method stub
		return msg+" test";
	}

}
