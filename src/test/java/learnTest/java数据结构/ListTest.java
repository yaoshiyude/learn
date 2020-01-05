package learnTest.java数据结构;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-16 18:06
 **/

public class ListTest {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("yaoshiyu0");
        linkedList.add("yaoshiyu1");
        System.out.println(linkedList.get(0));

        List<String> arrayList = new ArrayList<>();
        arrayList.add("yaoshiyuArrayList0");
        System.out.println(arrayList.get(0));
        System.out.println(4>>1);
    }
}
