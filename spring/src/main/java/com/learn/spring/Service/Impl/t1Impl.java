package com.learn.spring.Service.Impl;

import com.learn.spring.Service.Test;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-01 15:06
 **/
@Service("t1Impl")
public class t1Impl implements Test {
    @Override
    public void sout() {
        System.out.println("这是test1");
    }
}
