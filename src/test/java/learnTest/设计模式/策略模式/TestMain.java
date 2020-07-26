package learnTest.设计模式.策略模式;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-28 09:56
 **/

public class TestMain {

    public static void main(String[] args) {

        StrategyContext strategyContext = new StrategyContext(new LolGameStrategy());

        strategyContext.gameStrategy2();

    }
}
