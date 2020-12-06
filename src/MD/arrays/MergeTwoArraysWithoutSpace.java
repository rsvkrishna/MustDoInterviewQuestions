package MD.arrays;

import java.util.Arrays;

public class MergeTwoArraysWithoutSpace {
    public static void main(String[] args) {
        int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
        int arr2[] = new int[]{2, 3, 8, 13};
        merge(arr1,arr2,arr1.length,arr2.length);
        System.out.print("After Merging nFirst Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
    }

    public static void merge(int[] arr1,int[] arr2,int l1, int l2){

        for(int i=l2-1;i>=0;i--){
            int j;
            int last=arr1[l1-1];

            for(j=l1-2;j>=0 && arr1[j]>arr2[i];j--){
                arr1[j+1]=arr1[j];
            }
            if(last>arr2[i]){
                arr1[j+1]=arr2[i];
                arr2[i]=last;
            }
        }
    }
}
