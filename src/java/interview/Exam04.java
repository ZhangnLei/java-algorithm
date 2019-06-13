package interview;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangnianlei.
 * @date 2019/6/14.
 * @description 单例模式 五千次获取
 */
public class Exam04 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    SinletonClass04 class04 = SinletonClass04.getInstance();
                    System.out.println(class04);
                }
            });
        }
        executorService.shutdown();
//        SinletonClass04 class04 = SinletonClass04.getInstance();

    }
}
