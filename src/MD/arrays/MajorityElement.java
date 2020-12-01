package MD.arrays;

import java.util.HashSet;

public class MajorityElement {
    public static void main(String args[]){
        int arr[] = { 1, 2, 2, 2, 3, 2, 1 };
        int n = arr.length;

        int a=majorityElement1(arr, n);
        System.out.println(a);
    }
    //basic
    public static int majorityElement1(int a[],int n){
        if(a.length==0)
            return -1;

        int maxCount=0;
        int index=-1; int op=0;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j])
                    count++;
            }
            if(count>maxCount){
                maxCount=count;
                index=i;
            }
        }
        if(maxCount>(n/2))
            return a[index];
        return 0;
    }
    //using binary search
    /*public static int majorityElement2(int a[],int n){

    }*/
}
