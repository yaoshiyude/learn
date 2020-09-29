package com.example.learn.代理.CGLIB;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 15:07
 **/

public class TestCglib {
    public static void main(String[] args) {
        SmsService smsService = (SmsService)ProxyFactory.getProxy(SmsService.class);
        smsService.send("yaoshiyu");
    }
}
