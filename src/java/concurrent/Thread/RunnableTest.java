package concurrent.Thread;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description 继承Runable，实现run（）方法
 */
public class RunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println("nice");
    }
}
