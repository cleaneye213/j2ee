package com.xunke.annotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * //@Component(value="user")
 *
 * @author zwl
 * @date 2018/9/29.
 */
@Component("user")
public class User {

    /**
     * 对属性值进行赋值
     * <p>
     * 可以从配置文件获取配置值
     * ${配置的Key}
     */
    @Value("d00000000000000000000000")
    private String userName;

    /**
     * @Autowired 属性注入
     */
    @Autowired
    //@Qualifier("userDao")
    //@Resource("名称")
    private Role role;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        role.addRole();
        System.out.println("ddddddddddddd" + userName);
        return "User{" +
            "userName='" + userName + '\'' +
            '}';
    }
}
