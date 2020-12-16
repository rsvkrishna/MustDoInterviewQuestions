package MD.sorting;

import java.util.Arrays;

public class Sort012s {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sort012s(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012s(int arr[],int n){
        int low=0;
        int high=n-1;
        int mid=0;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;mid++;
                continue;

            }else if(arr[mid]==1){
                mid++;
                continue;
            }else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
                continue;
            }

        }
    }
    public static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
