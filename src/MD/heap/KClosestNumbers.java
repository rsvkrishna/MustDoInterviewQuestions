package MD.heap;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestNumbers {
    public static void main(String[] args) {
        //int[] arr={5,6,7,8,9};
        int[] arr={6,5,7,8,9};
        System.out.println("closest numbers are "+ Arrays.toString(findKClosetNumbers(arr,7,3)));
    }

    public static int[] findKClosetNumbers(int[] arr,int x, int k){
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if(o1.getKey()<o2.getKey())
                    return 1;
                else if(o1.getKey()>o2.getKey())
                    return -1;
                return 0;
            }
        });
        int[] res;

        for(int i=0;i<arr.length;i++){
            pq.add(new Pair<>(Math.abs(arr[i]-x),arr[i]));


            if(pq.size()>k)
                pq.poll();
        }
        /*debugging
        int j=0;
        int[] temp1=new int[pq.size()];
        while(pq.size()>0) {
            temp1[j] = pq.poll().getValue();
            j++;
        }
        System.out.println("Arrays "+Arrays.toString(temp1));*/

        int i=0;
        res=new int[pq.size()];
        while(pq.size()>0){
            //System.out.println("final data "+pq.peek().getKey() +" "+ pq.peek().getValue());
            res[i]=pq.poll().getValue();
            //System.out.println(res[i]);
            i++;
        }
        return res;
    }
}
