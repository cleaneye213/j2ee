package com.xunke.reflect.test;

public class User {

	private String userName;
	
	private String pwd;
	
	public User(){
		
	}
	public User(String userName,String pwd){
		this.userName=userName;
		this.pwd=pwd;
	}
	public String getUserName() {
		return userName;
	}
	

	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@SuppressWarnings("all")
	private void say(String name){
		System.out.println("say:"+name);
	}
	
	@Deprecated
	private void say2(String name){
		System.out.println("say:"+name);
	}
}
