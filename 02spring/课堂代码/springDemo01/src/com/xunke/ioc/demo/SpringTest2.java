package com.xunke.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zwl
 * @date 2018/9/29.
 */
public class SpringTest2 {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDaoImpl) appContext.getBean("userDaoId2");
        userDao.addUser();
    }
}
