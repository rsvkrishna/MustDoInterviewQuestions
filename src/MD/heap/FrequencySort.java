package MD.heap;

import javafx.util.Pair;

import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,3,2,2,2,4,4};
        //int[] arr={1,3,3,3,2,2,4};
        System.out.println(doFrequencySort(arr));
    }

    public static ArrayList<Integer> doFrequencySort(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }

        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if(o1.getKey()>o2.getKey())
                    return -1;
                else if(o1.getKey()<o2.getKey())
                    return 1;
                return 0;
            }
        });



        Iterator itr=hm.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            pq.add(new Pair(entry.getValue(),entry.getKey()));
        }

        while (pq.size()>0){
            int freq=pq.peek().getKey();
            int ele=pq.peek().getValue();
            //System.out.println(freq+" "+ele);

            for(int i=0;i<freq;i++){
                res.add(ele);
            }

            pq.poll();
        }
        System.out.println(res);
        return res;
    }

   public static void mergeArrays(int[] res, int start,int feq,int ele){


    }
}
