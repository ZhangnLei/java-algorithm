package concurrent.lock;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description synchronize的常用写法
 */
public class SynchronizedTest {

//    写法一、修饰在方法上
    public synchronized void add1() {

    }

//    写法二、修饰在代码块上
    public void add2() {
        synchronized (this) {

        }
    }

//    写法三、指定一个小的对象值进行加锁
    private byte[] lock = new byte[1];
    public void add3() {
        synchronized (lock) {

        }
    }

    /**
     * Vector、Hashtable等类是线程安全的，
     * 查看源码可以知道，几个旧的容器类在涉及
     * 到元素更新等操作的方法上都加了synchronized关键词，保证同步
     */

}
