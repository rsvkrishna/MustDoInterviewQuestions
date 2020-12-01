package MD.arrays;

public class ReverseArrayGroup {
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
        arr=reverseArrayGroup(arr, k);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static int[] reverseArrayGroup(int[] arr,int k){
        int len = arr.length;
        for(int i=0;i<len; i=i+k){
            int start=i;
            int end=Math.min(i+k-1,len-1);

            while(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return arr;
    }

}
