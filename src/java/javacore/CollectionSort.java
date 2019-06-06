package javacore;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description Collections.sort()方法使用及解析
 */
public class CollectionSort {
    public static void main(String[] args) {
        collectionsSort();
    }

    private static void collectionsSort() {
        List<String> list = new LinkedList<>();
        list.add("zhang");
        list.add("a");
        list.add("lei");
        //升序排序
        Collections.sort(list);
        //降序排序
//        Collections.sort(list, Collections.reverseOrder());
        list.forEach(System.out::println);
    }


}
