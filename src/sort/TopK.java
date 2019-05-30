package sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by mrzhang on 2019/5/30.
 *
 * 从n个数里找到n个最大的值
 */
public class TopK {

    public static List<Integer> topK(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue(k + 1);
        for (int i : nums){
            heap.add(i);
            if (heap.size() > k){
                heap.poll();
            }
        }
        List<Integer> list = new LinkedList<>();
        while (!heap.isEmpty()){
            list.add(heap.poll());
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] input = {5,3,7,1,8,2,9,4,7,2,6,6};
        List list = topK(input, 3);
        list.forEach(System.out::println);
    }
}
