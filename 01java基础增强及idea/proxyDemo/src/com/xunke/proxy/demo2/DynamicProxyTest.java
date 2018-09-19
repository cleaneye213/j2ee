package com.xunke.proxy.demo2;

import java.lang.reflect.Proxy;

import com.xunke.proxy.demo.UserService;
import com.xunke.proxy.demo.UserServiceImpl;
import com.xunke.proxy.demo.UserServiceImpl2;

public class DynamicProxyTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, Throwable {
		DynamicProxy dProxy=new DynamicProxy();
		UserService userService=new UserServiceImpl();
		dProxy.invoke(userService, UserService.class.getMethod("addUser"), null);
		
		System.out.println("=========================");
		
		/**
		 * 优化调用
		 */
		/**
		 * 创建代理对象
		 */
		DynamicProxy2 dProxy1=new DynamicProxy2(new UserServiceImpl());
		UserService proxyObj = (UserService)Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(),
				UserServiceImpl.class.getInterfaces(), dProxy1);
		proxyObj.addUser();
		proxyObj.deleteUser();
		System.out.println("=========================");
		
		DynamicProxy3 d3=new DynamicProxy3(new UserServiceImpl());
		UserService newInt = (UserService)d3.createInstance();
		newInt.addUser();
		
		System.out.println("==========DynamicProxy4===============");
		DynamicProxy4 d4=new DynamicProxy4(new UserServiceImpl());
		UserService uService = d4.createInstance();
		uService.addUser();
		
		
	}

}
