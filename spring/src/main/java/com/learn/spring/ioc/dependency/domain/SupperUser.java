package com.learn.spring.ioc.dependency.domain;

import com.learn.spring.ioc.dependency.annotation.Super;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-01-05 17:18
 **/
@Super
public class SupperUser extends User  {

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SupperUser{" +
                "role='" + role + '\'' +
                "} " + super.toString();
    }
}
