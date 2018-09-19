package com.xunke.proxy.demo;

/**
 * 静态代理
 * @author Administrator
 *
 */
public class UserProxyDemo2 implements UserService{
	
	private UserService userService;
	
	public UserProxyDemo2(){
		userService=new UserServiceImpl();
	}
	
	public UserProxyDemo2(UserService userService){
		this.userService=userService;
	}
	
	

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
