package learnTest.java数据结构;

import java.util.*;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-16 18:06
 **/

public class ListTest {
    public static void main(String[] args) {
//        List<String> linkedList = new LinkedList<>();
//        linkedList.add("yaoshiyu0");
//        linkedList.add("yaoshiyu1");
//        //System.out.println(linkedList.get(0));
//
//        for (String str:linkedList) {
//            System.out.println(str);
//
//        }

//        List<String> arrayList = new ArrayList<>();
//        arrayList.add("yaoshiyuArrayList0");
//        System.out.println(arrayList.get(0));
//        System.out.println(4>>1);

        List<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setAge(1);
        s1.setName("a");

        Student s2 = new Student();
        s2.setAge(2);
        s2.setName("b");

        Student s3 = new Student();
        s3.setAge(3);
        s3.setName("b");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.forEach(s ->{
            System.out.println(s.getAge());
        });

        System.out.println("------------------------------");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()>o2.getAge()){
                    return -1;
                }else if(o1.getAge() == o2.getAge()){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        students.forEach(s ->{
            System.out.println(s.getAge());
        });
    }
}
