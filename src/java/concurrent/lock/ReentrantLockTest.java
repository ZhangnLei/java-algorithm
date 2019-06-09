package concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangnianlei.
 * @date 2019/6/10.
 * @description 重入锁
 */
public class ReentrantLockTest {
//    使用方法

    private final ReentrantLock lock = new ReentrantLock();
    public void v(String[] args) {
        lock.lock();
        try {

        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
}
