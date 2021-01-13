package MD.heap;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ClosestToOrigin {
    public static void main(String[] args) {
        int[][] arr={{1,3},{-2,2},{5,8},{0,1}};
        int k=2;// find two points closest to origin
        findClosestToOrigin(arr,k);
    }

    public static void findClosestToOrigin(int[][] arr,int k){

        PriorityQueue<Pair<Integer,Pair<Integer,Integer>>> pq=new PriorityQueue<>(new Comparator<Pair<Integer, Pair<Integer, Integer>>>() {
            @Override
            public int compare(Pair<Integer, Pair<Integer, Integer>> o1, Pair<Integer, Pair<Integer, Integer>> o2) {
                if(o1.getKey()>o2.getKey())
                    return -1;
                else if(o1.getKey()<o2.getKey())
                    return 1;
                return 0;
            }
        });
        //System.out.println(arr[0].length);

        for(int i=0;i<arr.length;i++){
            pq.add(new Pair(((arr[i][0]*arr[i][0]) + (arr[i][1]*arr[i][1])),new Pair(arr[i][0],arr[i][1])));
            //System.out.println(pq.peek().getValue().getKey() + " " + pq.peek().getValue().getValue());

            if(pq.size()>k)
                pq.poll();
        }
        /*System.out.println("-----");
        System.out.println(pq.peek().getValue().getKey() + " " + pq.peek().getValue().getValue());*/

        while(pq.size()>0) {
            System.out.println(pq.peek().getValue().getKey() + " " + pq.peek().getValue().getValue());
            pq.poll();
        }
    }
}
