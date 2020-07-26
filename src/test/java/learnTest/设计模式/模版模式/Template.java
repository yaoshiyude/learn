package learnTest.设计模式.模版模式;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-28 18:31
 **/

public abstract class Template {

    public abstract void specialOut();

    public void commonHandlerMethod(){
        System.out.println("固定逻辑1");

        //特殊的模版实现类实现的特定逻辑
        specialOut();

        System.out.println("固定逻辑2");
        System.out.println("固定逻辑3");

    }
}
