package leetcode;

import java.util.*;

/**
 * Created by mrzhang on 2019/5/30.
 *
 * 找出k各出现次数最多的数值
 */
public class TopKFrequency {
    public static List<Integer> topK(int[] nums, int k){
        /**
         * 构建一个hashmap key为值，value为该值出现的频率
         */
        Map<Integer, Integer> count = new HashMap();
        for (int i: nums){
            count.put(i, count.getOrDefault(i, 0)+1);
        }
        /**
         * 构建一个最小堆，堆中只存放前k个出现次数最多的值
         */
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));
        for (int i : count.keySet()){
            heap.add(i);
            if (heap.size() > k){
                heap.poll();
            }
        }
        /**
         * 将堆中的数值输出
         */
        List<Integer> list = new LinkedList<>();
        while (!heap.isEmpty()){
            list.add(heap.poll());
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] input = {1,1,1,2,2,3,6,6,6,6,6,7};
        List list = topK(input, 2);
        list.forEach(n -> System.out.println(n));
    }
}
