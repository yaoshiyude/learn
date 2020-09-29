package com.example.learn.代理.JDK动态代理;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-16 17:59
 **/

public class TargetObject implements TargetObjectI {

    private String txt;
    public TargetObject(String txt){
        this.txt = txt;
    }
    @Override
    public void sout() {
        System.out.println("这是目标对象"+txt);
    }

    @Override
    public void sout2() {
        System.out.println("这是目标对象2"+txt);
    }
}
