package com.xunke.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.xunke.proxy.demo.UserService;
import com.xunke.proxy.demo.UserServiceImpl;

public class DynamicProxy2 implements InvocationHandler{
	/**
	 * DynamicProxy dProxy=new DynamicProxy();
		UserService userService=new UserServiceImpl();
		优化这两行代码
	 */
	private Object target;
	public DynamicProxy2(Object target){
		this.target=target;
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object invoke = method.invoke(target, args);
		after();
		return invoke;
	}
	
	private void before(){
		System.out.println("收取定金");
	}
	
	private void after(){
		System.out.println("收取尾款");
	}
}
