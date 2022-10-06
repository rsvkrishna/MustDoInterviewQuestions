package FinalPrep.StriverSDE.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr= {1,3,2};
        nextPermutation(arr);
        printArray(arr);

    }

    public static void nextPermutation(int[] arr){

        if(arr==null||arr.length<=1)
            return;

        int i=arr.length-2; // first take the index from left
        while(i>=0 && arr[i] >= arr[i+1])
            i--;

        if(i>=0){
            int j=arr.length-1;
            while(arr[j]<=arr[i])
                j--;

            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);

    }

    public static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public static void reverse(int[] A, int i, int j) {
        while(i < j) swap(A, i++, j--);
    }

    public static void printArray(int[] arr){
        if(arr==null)
            return;

        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]);
    }
}
