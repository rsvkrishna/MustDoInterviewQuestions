package MD.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int k=3;
        System.out.println("third smallest element is "+findKthSmallestEle(arr,3));
    }
    public static int findKthSmallestEle(int[] arr,int k){
        PriorityQueue<Integer> maxheap=new PriorityQueue<>();
        int res=0;
        for(int i=0;i<arr.length-1;i++) {
            maxheap.add(arr[i]);
            if(maxheap.size()>3)
                maxheap.poll();
        }
        //System.out.println(Arrays.toString(maxheap.toArray()));
        res=maxheap.poll();

        return res;
    }

}
