package learnTest.设计模式.策略模式;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-18 22:36
 **/

public class StrategyContext {

    private GameStrategy gameStrategy;

    public StrategyContext(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void gameStrategy1() {
        gameStrategy.gameStrategy1();
    }

    public void gameStrategy2() {
        gameStrategy.gameStrategy2();
    }
}
