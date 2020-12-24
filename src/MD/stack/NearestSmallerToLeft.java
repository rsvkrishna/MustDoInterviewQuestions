package MD.stack;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerToLeft {
    public static void main(String[] args) {
        //int arr[]={4,5,2,10,8}; //o/p -1 4 -1 2 2
        int arr[]={6,2,5,4,5,1,6};
        int size=arr.length;
        ArrayList<Integer> trr=findNearestSmallestLeft(arr,size);
        System.out.println(trr);

       ArrayList<Integer> crr=findNearestSmallestLeftTwo(arr,size);
        System.out.println(crr);
    }

    public static ArrayList<Integer> findNearestSmallestLeft(int arr[],int size){
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<size;i++){
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

    public static ArrayList<Integer> findNearestSmallestLeftTwo(int arr[],int size){
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<size;i++){

                while(s.size()>0 && s.peek()>arr[i])
                    s.pop();
                if(s.isEmpty())
                    v.add(-1);
                else if(s.size()>0 && s.peek()<=arr[i])
                    v.add(s.peek());

            s.push(arr[i]);
        }
        return v;
    }


}
