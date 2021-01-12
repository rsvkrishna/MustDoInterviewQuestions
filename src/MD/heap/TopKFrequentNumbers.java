package MD.heap;

import javafx.util.Pair;

import java.util.*;

public class TopKFrequentNumbers {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,2,2,4};
        //int[] arr={1,3,3,3,2,2,4};
        System.out.println(Arrays.toString(findTopKFrequentNumbers(arr,2)));

    }

    public static int[] findTopKFrequentNumbers(int[] arr,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else
                hm.put(arr[i],1);
        }
        /*Iterator itr= hm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/

        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if(o1.getKey()>o2.getKey())
                    return 1;
                else if(o1.getKey()<o2.getKey())
                    return -1;
                return 0;
            }
        });
        Iterator itr= hm.entrySet().iterator();
        while ((itr.hasNext())){
            Map.Entry entry = (Map.Entry) itr.next();
            pq.add(new Pair(entry.getValue(),entry.getKey()));

            if(pq.size()>k)
                pq.poll();
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll().getValue();
        }

        return res;
    }
}
