package com.learn.spring.dto.req;

import java.io.Serializable;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-06-03 23:35
 **/

public class SoutReqDTO implements Serializable {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
