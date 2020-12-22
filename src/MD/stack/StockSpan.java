package MD.stack;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85}; //o/p 1 1 1 2 1 4 6
        int size=arr.length;

        ArrayList<Integer> trr=doStockSpan(arr,size);
        System.out.println(trr);

        ArrayList<Integer> crr=doStockSpanTwo(arr,size);
        System.out.println(crr);

    }

    private static ArrayList<Integer> doStockSpanTwo(int[] arr, int size) {
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Pair<Integer,Integer>> s=new Stack<>();

        for(int i=0;i<size;i++){
            while(s.size()>0 && s.peek().getKey()<arr[i]){
                s.pop();
            }
            if(s.isEmpty())
                v.add(-1);
            else
                v.add(s.peek().getValue());

            s.push(new Pair<>(arr[i],i));
        }
        for(int i=0;i<v.size();i++)
            v.set(i,(i-v.get(i)));

        return v;
    }

    private static ArrayList<Integer> doStockSpan(int[] arr, int size) {
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Pair<Integer,Integer>> s=new Stack<>();

        for(int i=0;i<size;i++){
            if(s.isEmpty())
                v.add(-1);
            else if(s.size()>0 && s.peek().getKey()>arr[i])
                v.add(s.peek().getValue());
            else if(s.size()>0 && s.peek().getKey()<=arr[i])
            {
                while(s.size()>0 && s.peek().getKey()<arr[i]){
                    s.pop();
                }
                if(s.isEmpty())
                    v.add(-1);
                else
                    v.add(s.peek().getValue());
            }
            s.push(new Pair<>(arr[i],i));
        }
        System.out.println("printing before final logic , this will be NGL "+v);
        for(int i=0;i<v.size();i++)
            v.set(i,(i-v.get(i)));

        return v;
    }
}