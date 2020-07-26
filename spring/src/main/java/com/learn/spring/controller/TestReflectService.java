package com.learn.spring.controller;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-13 21:31
 **/
@Service("test")
public class TestReflectService {

    public String test1(String res){
        System.out.println("进入test#test1方法");
        return res;
    }
}
