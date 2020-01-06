package com.learn.spring.ioc.dependency.domain;

import com.learn.spring.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

import java.util.Collection;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-01-06 14:47
 **/

public class UserRepository {

    private Collection<User> collection;

    private BeanFactory beanFactory;

    private ApplicationContext context;

    public Collection<User> getCollection() {
        return collection;
    }

    public void setCollection(Collection<User> collection) {
        this.collection = collection;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "collection=" + collection +
                ", beanFactory=" + beanFactory +
                ", context=" + context +
                '}';
    }
}
