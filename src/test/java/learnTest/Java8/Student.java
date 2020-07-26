package learnTest.Java8;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-03-08 17:26
 **/

public class Student {
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

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
