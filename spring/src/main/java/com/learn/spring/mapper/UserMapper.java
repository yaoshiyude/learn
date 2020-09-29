package com.learn.spring.mapper;

import com.learn.spring.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-08 11:06
 **/
@Mapper
public interface UserMapper {
    UserEntity getById();
}