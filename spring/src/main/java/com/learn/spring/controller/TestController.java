package com.learn.spring.controller;

import com.learn.spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-13 21:29
 **/

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserMapper userMapper;


    @ResponseBody
    @RequestMapping("/t")
    public String test() {
        userMapper.getById();
        return "hello word";
    }


}
