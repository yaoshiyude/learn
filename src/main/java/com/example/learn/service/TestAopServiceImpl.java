package com.example.learn.service;

import com.example.learn.api.TestAopService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-29 11:01
 **/

@Service
public class TestAopServiceImpl implements TestAopService {

    @Override
    public void test() {
        System.out.println("这是被切的service方法");
    }
}
