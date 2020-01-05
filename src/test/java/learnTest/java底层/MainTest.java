package learnTest.java底层;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-17 20:07
 **/

public class MainTest {

    public static void main(String[] args) {
        NodeTest end = new NodeTest();
        NodeTest node = new NodeTest();

        System.out.println(end);
        System.out.println(node);

        NodeTest tail = end;

        System.out.println(tail);

        NodeTest prde = tail;
        System.out.println(prde);
        tail = node;
        System.out.println(tail);

        System.out.println("---------------------");
        System.out.println(end);
        System.out.println(tail);
        System.out.println(prde);
    }
}
