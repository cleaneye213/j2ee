package com.xunke.ioc2.demo;

import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zwl
 * @date 2018/9/29.
 */
public class SpringTest2 {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        MenuService menuService = (MenuService) appContext.getBean("menuService");
        menuService.addMenu();
        //要求：1.容器必须close，销毁方法执行; 2.必须是单例的
        try {
            appContext.getClass().getMethod("close").invoke(appContext);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
