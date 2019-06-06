package concurrent.Thread;

import java.util.concurrent.Callable;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description 有返回值的线程
 */
public class CallableTest implements Callable<String> {
    @Override
    public String call() throws Exception {
//        Thread.sleep(500);
        return "hello ";
    }
}
