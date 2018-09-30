package com.xunke.ioc.demo;

/**
 * @author zwl
 * @date 2018/9/29.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 添加用户
     */
    @Override
    public void addUser() {
        System.out.println("添加用户");
        userDao.addUser();
    }

}
