package concurrent.Thread;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description 继承Thread，重写run方法
 */
public class ThreadTest extends Thread{

    public ThreadTest(String threadName) {
        this.setName(threadName);
    }

    @Override
    public void run(){
        System.out.println(this.getName());
    }
}
