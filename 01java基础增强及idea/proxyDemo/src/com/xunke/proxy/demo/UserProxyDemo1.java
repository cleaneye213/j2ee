package com.xunke.proxy.demo;

public class UserProxyDemo1 implements UserService{
	
	private UserServiceImpl userService=new UserServiceImpl();

	@Override
	public void addUser() {
		haveMoney();
		userService.addUser();
		haveMoneyEnd();
	}

	@Override
	public void deleteUser() {
		userService.deleteUser();
	}

	public void haveMoney(){
		System.out.println("收取定金");
	}
	
	public void haveMoneyEnd(){
		System.out.println("收取尾款");
	}
}
