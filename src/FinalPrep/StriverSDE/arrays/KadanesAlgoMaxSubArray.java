package FinalPrep.StriverSDE.arrays;

import java.util.ArrayList;

public class KadanesAlgoMaxSubArray {
    public static void main(String args[]) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        ArrayList < Integer > subarray = new ArrayList < > ();
        int lon = maxSubArrayBrute(arr, subarray);
        System.out.println("The longest subarray with maximum sum is " + lon);
        System.out.println("The subarray is ");
        for (int i = subarray.get(0); i <= subarray.get(1); i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int maxSubArrayBrute(int[] arr, ArrayList<Integer> subarray) {
        int max_sum=Integer.MIN_VALUE;

        if(arr.length==1)
            return arr[0];

        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
            for(int j=i;j<arr.length;j++){
                curr_sum=curr_sum+arr[j];

                if(curr_sum > max_sum) {
                    subarray.clear();
                    max_sum = curr_sum;
                    subarray.add(i);subarray.add(j);
                }
            }
        }

        return max_sum;
    }

}
