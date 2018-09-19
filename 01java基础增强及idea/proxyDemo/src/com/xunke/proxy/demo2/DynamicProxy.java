package com.xunke.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object invoke = method.invoke(proxy, args);
		after();
		return invoke;
	}
	
	public void before(){
		System.out.println("收取定金");
	}
	
	public void after(){
		System.out.println("收取尾款");
	}
}
