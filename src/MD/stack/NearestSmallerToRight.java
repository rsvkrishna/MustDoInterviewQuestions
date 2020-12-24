package MD.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestSmallerToRight {
    public static void main(String[] args) {
        //int arr[]={4,5,2,10,8}; //o/p -1 4 -1 2 2
        int arr[]={6,2,5,4,5,1,6}; //o/p [2, 1, 4, 1, 1, -1, -1]
        int size=arr.length;
        ArrayList<Integer> trr=findNearestSmallerToRight(arr,size);
        Collections.reverse(trr);
        System.out.println(trr);

        ArrayList<Integer> crr=findNearestSmallerToRightTwo(arr,size);
        Collections.reverse(crr);
        System.out.println(crr);
    }

    private static ArrayList<Integer> findNearestSmallerToRightTwo(int[] arr, int size) {
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Integer> s=new Stack<>();

        for(int i=size-1;i>=0;i--){
            while(s.size()>0 && s.peek()>=arr[i])
                s.pop();
            if(s.isEmpty())
                v.add(-1);
            else if(s.size()>0 && s.peek()<arr[i])
                v.add(s.peek());

            s.push(arr[i]);
        }
        return v;
    }

    private static ArrayList<Integer> findNearestSmallerToRight(int[] arr, int size) {
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Integer> s=new Stack<>();

        for(int i=size-1;i>=0;i--){
            if(s.isEmpty())
                v.add(-1);
            else if(s.size()>0 && s.peek()<arr[i])
                v.add(s.peek());
            else if(s.size()>0 && s.peek()>=arr[i]){
                while(s.size()>0 && s.peek()>=arr[i])
                    s.pop();
                if(s.isEmpty())
                    v.add(-1);
                else if(s.size()>0 && s.peek()<arr[i])
                    v.add(s.peek());
            }
            s.push(arr[i]);
        }
        return v;
    }

}
