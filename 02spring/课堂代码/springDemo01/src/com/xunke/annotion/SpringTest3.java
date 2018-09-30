package com.xunke.annotion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zwl
 * @date 2018/9/29.
 */
public class SpringTest3 {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        User user = (User) appContext.getBean("user");
        user.toString();

    }
}
