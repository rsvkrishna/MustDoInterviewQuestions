package MD.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array"+ Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));

        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        System.out.println("Given Array"+ Arrays.toString(arr));
    }

    public static void mergeSort(int arr[], int l, int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    //will be using two sub arrays instead one big single array
    public static void merge(int arr[],int l,int m,int r){
        int t1=m-l+1;
        int t2=r-m;
        int L[]=new int[t1];
        int R[]=new int[t2];

        for (int i=0;i<t1;i++)
            L[i]=arr[l+i];
        for(int j=0;j<t2;j++)
            R[j]=arr[m+j+1];

        int i=0;int j=0;
        int k=l;
        while(i<t1 && j<t2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<t1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<t2){
            arr[k]=R[j];
            j++;
            k++;
        }

    }
}
