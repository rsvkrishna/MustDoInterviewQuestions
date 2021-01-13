package MD.heap;

import java.util.PriorityQueue;

public class ConnectRopesMinimizeCost {
    public static void main(String[] args) {
        int[] arr={5,7,8,2,7};
        int k=2;
        System.out.println(doConnectRopesMinimizeCost(arr,k));
    }

    public static int doConnectRopesMinimizeCost(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int cost=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        while(pq.size()>1){
            int ele1=pq.peek();
            pq.poll();
            int ele2=pq.peek();
            pq.poll();
            cost=cost+ele1+ele2;
            pq.add(ele1+ele2);
        }
        return cost;
    }
}
