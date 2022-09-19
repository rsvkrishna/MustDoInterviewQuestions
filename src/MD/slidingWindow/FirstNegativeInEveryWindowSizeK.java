package MD.slidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;

public class FirstNegativeInEveryWindowSizeK {
    public static void main(String[] args) {
        //System.out.println(getFirstNeg(new int[]{-4, 2, -1, 7, 8, -1, -2, 8, 1, 0}, 3));
        getFirstNeg(new int[]{-2, 1,-5, 1, -3, 7}, 3);
        //getFirstNeg(new int[]{-2, -1,-5, -1, -3, -7}, 3);
        //System.out.println(getFirstNeg(new int[]{2, -1, -5, 2, -3, 2}, 2));
    }
    private static void getFirstNeg(int[] arr,int k){
        LinkedList<Integer> a=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
                a.add(arr[i]);
            if(a.isEmpty())
                System.out.print("0 ");
            else if(i-k+1>=0){
                System.out.print(a.removeFirst()+" ");
            }
        }
        //return 0;
    }
}
