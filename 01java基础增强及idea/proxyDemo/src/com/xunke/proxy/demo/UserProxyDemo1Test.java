package com.xunke.proxy.demo;

public class UserProxyDemo1Test {

	public static void main(String[] args) {
		UserProxyDemo1 demo1=new UserProxyDemo1();
		demo1.addUser();
		
		UserProxyDemo2 demo2=new UserProxyDemo2(new UserServiceImpl2());
		demo2.addUser();
		
		UserProxyDemo2 demo3=new UserProxyDemo2(new UserServiceImpl());
		demo3.addUser();
	}

}
