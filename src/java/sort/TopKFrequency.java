package sort;

import java.util.*;

/**
 * @author zhangnianlei
 * @create 2019/6/5.
 * @description 找出k各出现次数最多的数值
 */
public class TopKFrequency {

    /**
     * topk 问题
     * @param nums 数组
     * @param k k
     * @return
     */
    public static List<Integer> topK(Integer[] nums, int k){

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
        //构建方法1：使用Comparator的comparingInt()方法
//        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));

        //构建方法2：使用Comparator的comparing()方法
//        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparing(count::get));

        //构建方法3：重写compara()方法构建比较器 （o1.compara(o2)是升序排序，o2.compara(o1)是降序排序）
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int value = count.get(o1).compareTo(count.get(o2));
                if (value == 0){
                    return o1.compareTo(o2);
                }else {
                    return value;
                }
            }
        });

        //构建方法4：重写compara()方法构建比较器 （o1 - o2是升序排序，o2 - o1是降序排序）
//        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int value = count.get(o2) - count.get(o1);
//                if (value == 0){
//                    return o2 - o1;
//                }else {
//                    return value;
//                }
//            }
//        });

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
//        arraysSort();
//        collectionsSort();
//        mapForEach();
        topk();
    }

    private static void mapForEach() {
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");
        namesMap.forEach((key, value) -> System.out.println(key + ": "+value));
    }

    private static void arraysSort() {
        Integer[] input = {1,1,2,8,2,3,6,6,7};
        List list = topK(input, 4);
        list.forEach(n -> System.out.println(n));
//        System.out.println();
        Arrays.sort(input);
//        input
        System.out.println(Arrays.toString(input));
    }
    private static void topk() {
        Integer[] input = {1,1,2,8,2,3,6,6,7};
        List list = topK(input, 4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i == 1){
                iterator.remove();
            }
        }
        for (int i : input){
            System.out.println(i);
        }
        list.forEach(n -> System.out.println(n));
    }

    public static void collectionsSort()
    {
        String domains[] = {"Practice", "Geeks", "Code", "Quiz"};
        List colList = new ArrayList(Arrays.asList(domains));
        Collections.sort(colList, new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                return b.compareTo(a);
            }
        });
        System.out.println("List after the use of Collection.sort()  :\n" + colList);
    }
}
