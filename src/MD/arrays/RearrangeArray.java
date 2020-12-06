package MD.arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int arr[] = {3, 2, 0, 1};
        System.out.println(Arrays.toString(arr));
        rearrangeArray(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrangeArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            arr[i]=arr[i]+(arr[arr[i]]%n)*n;
        }

        for(int i=0;i<n;i++){
            arr[i]=arr[i]/n;
        }
    }
}
