package com.learn.spring.ioc.dependency.lookup;

import com.learn.spring.ioc.dependency.annotation.Super;
import com.learn.spring.ioc.dependency.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @description: IOC 依赖查找的实现方式
 *
 *               1、通过id实时查找
 *               2、通过id延时查找
 *               3、通过单一类型查找
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
        //通过单一类型查找
        //getBeanByType(beanFactory);
        //通过集合类型查找
        getBeanByCollectionType(beanFactory);
        //通过注解查找
        getBeanByAnnotation(beanFactory);
    }

    private static void getBeanByAnnotation(BeanFactory beanFactory) {
        if(beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory)beanFactory;
            Map<String,User> userMap = (Map) listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("通过注解 @Super 查找:"+userMap);
        }
    }

    private static void getBeanByCollectionType(BeanFactory beanFactory) {
        if(beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory)beanFactory;
            Map<String,User> userMap = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("通过集合类型查找:"+userMap);
        }
    }

    private static void getBeanByType(BeanFactory beanFactory) {
        User user = (User)beanFactory.getBean(User.class);
        System.out.println("通过单一bean的类型进行查找:"+user);
    }

    private static void getLazyBeanById(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>)beanFactory.getBean("objectFactory" );
        User user = objectFactory.getObject();
        System.out.println("通过id延时查找:"+user);
    }

    private static void getRealtimeBeanById(BeanFactory beanFactory) {
        User user = (User)beanFactory.getBean("user");
        System.out.println("通过id实时查找:"+user);
    }


}
