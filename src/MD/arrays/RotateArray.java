package MD.arrays;

import java.util.Arrays;

//one logic left rotate, one logic right rotate
public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.rotateArray(arr, 5,arr.length);
        rotate.printArray(arr);
        System.out.println("");
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.rotateArray2(arr2,2);
        printArray(arr2);
    }

    //basic
    public static void rotateArray(int[] arr,int k,int len){
        for(int i=0;i<k;i++){
            rotateArrayByOne(arr,len);
        }
    }
    public static void rotateArrayByOne(int[] arr,int len){
        int i;int temp;
        temp=arr[0];
        for(i=0;i<len-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }
    public static  void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
    }

    //juggling algorithm
    public static void rotateArray2(int[] arr, int k){
        //step 1 divide array into two
        int start=0;
        int middle=arr.length-k;
        int end=arr.length-1;

        //step 2 reverse the two parts
        reverse(arr,start,middle-1);
        //System.out.println(Arrays.toString(arr));
        reverse(arr,middle,end);
        //System.out.println(Arrays.toString(arr));
        reverse(arr,0,end);

    }
    public static void reverse(int[] arr,int start,int end){
        int len=arr.length;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
