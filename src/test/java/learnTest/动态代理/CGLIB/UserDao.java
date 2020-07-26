package learnTest.动态代理.CGLIB;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-07-07 01:25
 **/

public class UserDao {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void testCGLIB(){
        System.out.println("这是要测试的CGLIB代理类");
    }
}
