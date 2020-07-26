package learnTest.设计模式.模版模式;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-28 18:42
 **/

public class SpecialOutTemplateExtends extends Template{
    @Override
    public void specialOut() {
        System.out.println("SpecialOutTemplateExtends 中特定的逻辑");
    }
}
