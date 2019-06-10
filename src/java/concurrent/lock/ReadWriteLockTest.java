package concurrent.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author zhangnianlei
 * @create 2019/6/10.
 * @description ReentrantReadWriteLock 读写锁
 * 读操作 可以允许多个线程来读取
 * 写操作 只能有一个线程来写
 */
public class ReadWriteLockTest {
    private Map<String, String> syncHashMap = new HashMap<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock readLock = lock.readLock();
    private Lock writeLock = lock.writeLock();

    /**
     * 写操作
     * @param key
     * @param value
     */
    public void put(String key, String value) {
        try {
            writeLock.lock();
            syncHashMap.put(key, value);
            System.out.println(key + ": " + value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }

    /**
     * 读操作
     * @param key
     */
    public void get(String key){
        try {
            readLock.lock();
            syncHashMap.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }

}
