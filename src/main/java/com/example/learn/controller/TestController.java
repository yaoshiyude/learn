package com.example.learn.controller;

import com.example.learn.api.TestAopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-29 10:59
 **/

@Controller
public class TestController {

    @Autowired
    TestAopService testAopService;

    @Autowired
    AllBeanFactoryAndAppContext allBeanFactoryAndAppContext;

    @RequestMapping("/")
    public String test(){
        System.out.println("全部上下文"+allBeanFactoryAndAppContext.toString());
        return "hello";
    }
}
