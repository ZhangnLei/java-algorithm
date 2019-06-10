package concurrent.Thread;

import java.util.concurrent.*;

/**
 * @author zhangnianlei
 * @create 2019/6/10.
 * @description
 */
public class MyThreadPoolTest {
    static int corePoolSize = 10;
    static int maximumPoolSize = 100;
    static long keepAliveTime = 1;
    static ArrayBlockingQueue workQueue = new ArrayBlockingQueue(10);
    static ThreadFactory threadFactory = new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            return null;
        }
    };
    static RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();

    public static void main(String[] args) {
        threadPooltest();
    }

    /**
     * 使用自定义的方式创建线程池
     */
    private static void threadPooltest() {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                TimeUnit.SECONDS,
                workQueue,
                handler);
        for (int i = 0; i < 5; i++) {
            String value = "thread" + i;
            poolExecutor.execute(() -> System.out.println(value));
        }
        poolExecutor.shutdown();
    }
}
