package learnTest.java底层;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-17 20:07
 **/

public class MainTest {

    public static void main(String[] args) {
        System.out.println("当前代码所在行"+getLine());
    }

    private static int getLine(){
        StackTraceElement []stackTraceElement = Thread.currentThread().getStackTrace();
        StackTraceElement e = stackTraceElement[2];
        int line = e.getLineNumber();
        return line;
    }
}
