package com.xunke.ioc.demo;

/**
 * @author zwl
 * @date 2018/9/29.
 */
public class UserDaoImpl implements UserDao {
    /**
     * 数据库：添加用户
     */
    @Override
    public void addUser() {
        System.out.println("sql:add user");
    }
}
