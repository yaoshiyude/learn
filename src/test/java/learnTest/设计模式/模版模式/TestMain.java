package learnTest.设计模式.模版模式;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-28 18:44
 **/

public class TestMain {

    public static void main(String[] args) {

        Template template = new SpecialOutTemplateExtends();

        template.commonHandlerMethod();
    }
}
