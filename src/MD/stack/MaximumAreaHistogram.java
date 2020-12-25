package MD.stack;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
        int arr[]={6,2,5,4,5,1,6}; //o/p 12
        int size=arr.length;
        System.out.println("arr array"+Arrays.toString(arr));
        System.out.println("Max area of histogram is "+findMAH(arr,size));

    }

    public static int findMAH(int[] arr,int size){
        ArrayList<Integer> nsr=findNSRIndex(arr,size);
        System.out.println("nsr "+ nsr);
        ArrayList<Integer> nsl=findNSLIndex(arr,size);
        System.out.println("nsl "+ nsl);
        int width[]= new int[size];
        int area[]=new int[size]; // max value of this is our ans

        for(int i=0;i<size;i++)
            width[i]= (nsr.get(i) - nsl.get(i)-1);

        System.out.println("Width array"+Arrays.toString(width));

        for(int i=0;i<size;i++)
            area[i]= arr[i]*width[i];

        System.out.println("Area array"+Arrays.toString(area));

        int maxArea=arr[0];
        for(int i=1;i<area.length;i++){
            if(area[i]>=maxArea)
                maxArea=area[i];
        }
        return maxArea;
    }

    public static ArrayList<Integer> findNSRIndex(int[] arr, int size) {
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Pair<Integer,Integer>> s=new Stack<>();
        int psedoIndex=arr.length;

        for(int i=size-1;i>=0;i--){
            while(s.size()>0 && s.peek().getKey()>=arr[i])
                s.pop();
            if(s.isEmpty())
                v.add(psedoIndex);
            else if(s.size()>0 && s.peek().getKey()<arr[i])
                v.add(s.peek().getValue());

            s.push(new Pair(arr[i],i));
        }
        Collections.reverse(v);
        return v;
    }

    public static ArrayList<Integer> findNSLIndex(int[] arr, int size) {
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Pair<Integer,Integer>> s=new Stack<>();
        int psedoIndex=-1;

        for(int i=0;i<size;i++){
            while(s.size()>0 && s.peek().getKey()>=arr[i])
                s.pop();
            if(s.isEmpty())
                v.add(psedoIndex);
            else if(s.size()>0 && s.peek().getKey()<arr[i])
                v.add(s.peek().getValue());

            s.push(new Pair(arr[i],i));
        }
        return v;
    }
}
