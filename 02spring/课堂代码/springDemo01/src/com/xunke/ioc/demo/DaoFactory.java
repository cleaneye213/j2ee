package com.xunke.ioc.demo;

/**
 * @author zwl
 * @date 2018/9/29.
 */
public class DaoFactory {

    /**
     * 静态工厂生成对象
     *
     * @return
     */
    public static UserDaoImpl createUserDao() {
        System.out.println("factory create bean");
        return new UserDaoImpl();
    }
}
