package concurrent.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangnianlei.
 * @date 2019/6/10.
 * @description
 */
public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        threadPoolTest();
    }

    private static void threadPoolTest() throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            final int j = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println("aaa" + j);
                }
            });

        }
        executorService.shutdown();
    }
}
