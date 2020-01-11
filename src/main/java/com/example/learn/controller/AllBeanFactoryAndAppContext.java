package com.example.learn.controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Collection;
import java.util.List;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-01-10 16:33
 **/
@Component
public class AllBeanFactoryAndAppContext {

    @Autowired
    private BeanFactory beanFactories;

    /*@Autowired
    private ApplicationContext applicationContexts;

    @Override
    public String toString() {
        return "AllBeanFactoryAndAppContext{" +
                "beanFactories=" + beanFactories +
                ", applicationContexts=" + applicationContexts +
                '}';
    }*/

    @Override
    public String toString() {
        return "AllBeanFactoryAndAppContext{" +
                "beanFactories=" + beanFactories +
                '}';
    }
}
