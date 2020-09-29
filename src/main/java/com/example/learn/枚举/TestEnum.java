package com.example.learn.枚举;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 18:07
 **/
public enum TestEnum {

    TEST_ENUM(1,"yaoshiyu");
    private Integer code;
    private String name;
    TestEnum(Integer code,String name){
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
