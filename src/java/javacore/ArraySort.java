package javacore;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description Arrays.sort()方法使用及解析
 * 该方法可以用于数组的排序，不适用于List的排序
 */
public class ArraySort {
    public static void main(String[] args) {
//        testIntArray();
        testStringArray();
    }

    /**
     * int[] 排序
     */
    private static void testIntArray() {
        Integer[] nums = {1,5,6,9,7,5};
//        Arrays.sort(nums);
        Arrays.sort(nums, Collections.reverseOrder());
        for (int i : nums) {
            System.out.println(i);
        }
    }

    /**
     * string[] 排序
     */
    private static void testStringArray() {
        String[] strings = {"zhang", "alisi", "nian", "lei"};
        //升序排序
        Arrays.sort(strings);

        //降序排序
        //Arrays.sort(strings, Collections.reverseOrder());
        for (String string : strings) {
            System.out.println(string);
        }
    }


}
