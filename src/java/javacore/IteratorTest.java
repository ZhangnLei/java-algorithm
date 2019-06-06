package javacore;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description Iterator类中的forEachRemaining（方法）
 * 对每个剩余元素执行给定操作，直到处理完所有元素或操作引发异常。
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("zhang");
        list.add("a");
        list.add("lei");
//        forEachRemainingTest(list);
        whileIterator(list);
    }

    /**
     * 使用while遍历Iterator迭代器
     * @param list
     */
    private static void whileIterator(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();
            System.out.println(string);
        }
    }

    /**
     * 使用forEachRemaining()方法遍历迭代器
     * @param list
     */
    private static void forEachRemainingTest(List<String> list) {
        Iterator<String> iterator = list.iterator();
        iterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if (!"a".equals(s)) {
                    System.out.println(s);
                }
            }
        });
    }

}
