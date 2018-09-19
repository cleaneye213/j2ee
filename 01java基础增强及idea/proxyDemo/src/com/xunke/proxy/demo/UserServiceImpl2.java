package com.xunke.proxy.demo;

public class UserServiceImpl2 implements UserService {

	@Override
	public void addUser() {
		//before();
		System.out.println("添加用户2");
		//after();
	}

	@Override
	public void deleteUser() {
		System.out.println("删除用户2");
	}

}
