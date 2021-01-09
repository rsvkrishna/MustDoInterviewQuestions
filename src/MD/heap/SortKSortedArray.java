package MD.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void main(String[] args) {
        int[] arr={6, 5, 3, 2, 8, 10}; // k = 3
        System.out.println(Arrays.toString(sortKSortedArray(arr,3)));

    }

    public static int[] sortKSortedArray(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int[] res=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);

            if(pq.size()>k) {
                res[j]=pq.poll();
                ++j;
            }
        }
        while (pq.size()>0) {
            res[j] = pq.poll();
            ++j;
        }
        return res;

    }
}
