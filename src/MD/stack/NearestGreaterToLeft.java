package MD.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestGreaterToLeft {
    public static void main(String[] args) {
        int arr[]={1,3,2,4}; //o/p -1 -1 3 -1
        int size=arr.length;
        ArrayList<Integer> trr=findNearestGreaterLeft(arr,size);
        System.out.println(trr);

        ArrayList<Integer> crr=findNearestGreaterLeftTwo(arr,size);
        System.out.println(crr);
    }

    private static ArrayList<Integer> findNearestGreaterLeftTwo(int[] arr, int size) {
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<size;i++){
            while(s.size()>0 && s.peek()<arr[i])
                s.pop();
            if(s.isEmpty())
                v.add(-1);
            else
                v.add(s.peek());
        s.push(arr[i]);
        }
        return v;
    }

    public static ArrayList<Integer> findNearestGreaterLeft(int arr[],int size){
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<size;i++){
            if(s.isEmpty())
                v.add(-1);
            else if(s.size()>0 && s.peek()>arr[i])
                v.add(s.peek());
            else if(s.size()>0 && s.peek()<arr[i]){
                while(s.size()>0 && s.peek()<arr[i])
                    s.pop();
                if(s.isEmpty())
                    v.add(-1);
                else
                    v.add(s.peek());
            }
            s.push(arr[i]);
        }
    return v;
    }
}
