package MD.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static  int[] threeLargest;
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15}; // 3 4 7 10 15 20
        int k=3;
        System.out.println("third largest element is "+findKthLargestEle(arr,3));
    }

    private static int findKthLargestEle(int[] arr, int K) {
        threeLargest=new int[K];
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int res=0;
        for(int i=0;i<arr.length;i++) {
            minHeap.add(arr[i]);
            System.out.println(Arrays.toString(minHeap.toArray()));
            if(minHeap.size()>K)
                minHeap.poll();
        }

        res=minHeap.peek();

        for(int i=0;i<K;i++)
            threeLargest[i]=minHeap.poll();

        System.out.println("Three largest elements are "+Arrays.toString(threeLargest));

        return res;

    }
}
