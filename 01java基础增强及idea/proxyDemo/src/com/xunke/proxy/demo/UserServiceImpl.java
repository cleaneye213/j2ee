package com.xunke.proxy.demo;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		//before();
		System.out.println("添加用户");
		//after();
	}

	@Override
	public void deleteUser() {
		System.out.println("删除用户");
	}

	public void before(){
		System.out.println("获取connection");
	}
	
	public void after(){
		System.out.println("关闭connection");
	}
}
