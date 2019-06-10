package concurrent.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangnianlei
 * @create 2019/6/10.
 * @description
 */
public class TestReadWriteLock {
    private ExecutorService executorService = Executors.newCachedThreadPool();
    public void test() {
        ReadWriteLockTest test = new ReadWriteLockTest();
        for (int i = 0; i < 5; i++) {
            String key = "key" + i;
            String value = "value" + i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    test.put(key, value);
                }
            });
        }

    }

    public static void main(String[] args) {
        TestReadWriteLock testReadWriteLock = new TestReadWriteLock();
        testReadWriteLock.test();
    }

}
