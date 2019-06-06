package concurrent.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description 多编程线程
 */
public class Run {
    public static void main(String[] args) {
//        threadTest();
//        runnableTest();
        callableTest();
    }

    /**
     * 有返回值的线程
     */
    private static void callableTest() {
        FutureTask<String> futureTask = new FutureTask<>(new CallableTest());
        new Thread(futureTask).start();
        //在获取线程返回值时需要try-catch
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    /**
     * 调用Runnable方法实现
     */
    private static void runnableTest() {
        //将new RunnableTest()实例作为参数实例化Thread之后启动线程
        new Thread(new RunnableTest()).start();
    }

    /**
     * 调用使用继承Thread类实现的方法
     */
    private static void threadTest() {
        new ThreadTest("zhang").start();
    }
}
