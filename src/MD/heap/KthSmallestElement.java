package MD.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15}; // 3 4 7 10 15 20
        System.out.println("third smallest element is "+findKthSmallestEle(arr,3));
    }
    public static int findKthSmallestEle(int[] arr,int K){
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        int res=0;
        /*PriorityQueue<Integer> a=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++) {
            a.add(arr[i]);
            System.out.println(Arrays.toString(a.toArray()));
        }
        System.out.println(Arrays.toString(a.toArray()));*/
        for(int i=0;i<arr.length;i++) {
            maxheap.add(arr[i]);

            if(maxheap.size()>K)
                maxheap.poll();
        }
        //System.out.println(Arrays.toString(maxheap.toArray()));
        res=maxheap.poll();

        return res;
    }

}
