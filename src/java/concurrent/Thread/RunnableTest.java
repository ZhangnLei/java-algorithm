package concurrent.Thread;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description 实现Runable接口，实现run（）方法
 */
public class RunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println("nice");
    }
}
