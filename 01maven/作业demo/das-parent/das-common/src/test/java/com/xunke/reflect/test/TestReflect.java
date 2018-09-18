package com.xunke.reflect.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflect {

	public static void main(String[] args) throws Exception, SecurityException {
		Class<User> userClass=User.class;
		try {
			User user = userClass.newInstance();
			
			//通过有参构造器
			Constructor<User> ctor = userClass.getConstructor(String.class,String.class);
			User user2 = ctor.newInstance("admin","123456");
			
			System.out.println(user2.getUserName());
			
			//获取字段，属性、方法
			//公有的怎么取(直接获取)
			//私有的怎么获取(通常情况我们都是获取私有的)
			//1、获取字段
			/*
			 *  getField()方法只能获取public修饰的属性
				②getDeclaredField()方法能获取任意修饰符修饰的属性对象(Field对象)
			 */
			Field[] fields = userClass.getDeclaredFields();
			//设置访问私有字段权限
			fields[0].setAccessible(true);
			//fields[0].set(obj, value);
			//获取user2对象的第一个字段值
			Object object = fields[0].get(user2);
			System.out.println(String.valueOf(object));
			fields[0].set(user2, "admin2");
			System.out.println(user2.getUserName());
			
			//获取方法，调用方法
			Method[] method = userClass.getDeclaredMethods();
			for(Method temp:method){
				if(temp.getName().equals("say")){
					temp.setAccessible(true);
					temp.invoke(user2, "好好学习");
				}
			}
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
