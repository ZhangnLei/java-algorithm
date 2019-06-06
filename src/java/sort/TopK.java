package sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author zhangnianlei
 * @create 2019/5/30.
 * @description 从n个数里找到k个最大的值
 */
public class TopK {
    /**
     * 从n个数里找到k个最大的值
     * @param nums
     * @param k
     * @return
     */
    public static List<Integer> topK(int[] nums, int k){
        //建堆
        PriorityQueue<Integer> heap = new PriorityQueue(k + 1);
        //向堆中添加元素， 如果元素大于K个则将最小的一个移出堆
        for (int i : nums){
            heap.add(i);
            if (heap.size() > k){
                heap.poll();
            }
        }
        List<Integer> list = new LinkedList<>();
        //将堆中剩余的元素取出来
        while (!heap.isEmpty()){
            list.add(heap.poll());
        }
        //翻转list
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] input = {5,3,7,1,8,2,9,4,7,2,6,6};
        List list = topK(input, 3);
        list.forEach(System.out::println);
    }
}
