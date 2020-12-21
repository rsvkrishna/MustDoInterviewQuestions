package MD.stack;

import java.util.*;

public class NearestGreaterToRight {
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        int size=arr.length;
        ArrayList<Integer> trr=findNearestGreaterRight(arr,size);
        Collections.reverse(trr);
        System.out.println(trr);

        ArrayList<Integer> crr=findNearestGreaterRightTwo(arr,size);
        Collections.reverse(crr);
        System.out.println(crr);
    }

    public static ArrayList<Integer> findNearestGreaterRight(int arr[], int size){
        ArrayList<Integer>v=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=size-1;i>=0;i--){
            if(s.isEmpty())
                v.add(-1);
            else if(s.size()>0 && s.peek()>arr[i])
                v.add(s.peek());
            else if(s.size()>0 && s.peek()<=arr[i])
            {
                while(s.size()>0 && s.peek()<arr[i]){
                    s.pop();
                }
                if(s.isEmpty())
                    v.add(-1);
                else
                    v.add(s.peek());
            }
            s.push(arr[i]);
        }
        return v;
    }
    public static ArrayList<Integer> findNearestGreaterRightTwo(int arr[], int size){
        ArrayList<Integer>v=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=size-1;i>=0;i--){
                while(s.size()>0 && s.peek()<arr[i]){
                    s.pop();
                }
                if(s.isEmpty())
                    v.add(-1);
                else
                    v.add(s.peek());

            s.push(arr[i]);
        }
        return v;
    }
}
