package com.xunke.annotion;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author zwl
 * @date 2018/9/29.
 */
@Component
@Scope("prototype")
public class Role {

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void addRole() {
        System.out.println("点六六零零");
    }
}
