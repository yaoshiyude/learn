package learnTest.设计模式.策略模式;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-18 22:31
 **/
public interface GameStrategy {

    default void gameStrategy1() {
        System.out.println("默认游戏策略1");
    }


    default void gameStrategy2() {
        System.out.println("默认游戏策略2");
    }
}
