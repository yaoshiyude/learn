package com.learn.spring.ioc.dependency.lookup;

import com.learn.spring.ioc.dependency.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: IOC 依赖查找的实现方式
 *
 *               1、通过id实时查找
 *               2、通过id延时查找
 *               3、
 * @author: yaoshiyu
 * @create: 2020-01-05 16:10
 **/

public class DependencyLookupDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("dependency-lookup-context.xml");

        //通过id 实时查找
        getRealtimeBeanById(beanFactory);
        //通过id 延时查找
        getLazyBeanById(beanFactory);
    }

    private static void getLazyBeanById(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>)beanFactory.getBean("objectFactory" );
        User user = objectFactory.getObject();
        System.out.println("通过id延时查找"+user);
    }

    private static void getRealtimeBeanById(BeanFactory beanFactory) {
        User user = (User)beanFactory.getBean("user");
        System.out.println("通过id实时查找"+user);
    }


}
