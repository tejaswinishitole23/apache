package com.learnapache.services;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
public interface HelloWorld {

	String sayHi(String msg);
}
