package com.learn.spring.ioc.dependency.injection;

import com.learn.spring.ioc.dependency.annotation.Super;
import com.learn.spring.ioc.dependency.domain.User;
import com.learn.spring.ioc.dependency.domain.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @description: IOC 依赖注入的实现方式
 *
 *               1、通过id实时注入
 *               2、通过id延时注入
 *               3、通过单一类型注入
 * @author: yaoshiyu
 * @create: 2020-01-05 16:10
 **/

public class DependencyInjectionDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("dependency-injection-context.xml");

        UserRepository userRepository = beanFactory.getBean("userRepository",UserRepository.class);
        System.out.println(userRepository);



    }




}
