package com.learn.spring.ioc.dependency.domain;

import java.util.Collection;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-01-06 14:47
 **/

public class UserRepository {

    private Collection<User> collection;

    public Collection<User> getCollection() {
        return collection;
    }

    public void setCollection(Collection<User> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "collection=" + collection +
                '}';
    }
}
