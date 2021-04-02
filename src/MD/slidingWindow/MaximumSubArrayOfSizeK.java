package MD.slidingWindow;

public class MaximumSubArrayOfSizeK {
    public static void main(String[] args) {
        System.out.println(getMaxSum(new int[]{4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 3));
        System.out.println(getMaxSum(new int[]{2, 1, 5, 1, 3, 7}, 3));
        System.out.println(getMaxSum(new int[]{2, 1, 5, 2, 3, 2}, 2));
    }
    private static int getMaxSum(int[] arr,int k){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(i-k+1>=0) {
                maxSum = Math.max(currentSum, maxSum);
                currentSum=currentSum-arr[i-k+1];
            }
        }
        return maxSum;
    }
}
