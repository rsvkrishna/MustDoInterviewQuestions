package MD.dynamicProgramming.knapsack;

import java.util.Arrays;

public class CountSubsetSum {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,10};
        int sum=10;
        System.out.println("no of subsets for sum is "+findCountSubsetSum(arr,sum));
    }

    public static int findCountSubsetSum(int[] arr,int sum){
        int n=arr.length+1;
        int m=sum+1;
        int len=arr.length;
        int[][] t=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0)
                    t[i][j]=0;
                if(j==0)
                    t[i][j]=1;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i-1]<=j)
                    t[i][j]=t[i-1][j-arr[i-1]]+t[i-1][j];
                else
                    t[i][j]=t[i-1][j];
            }
        }
        for (int[] b:t) {
            System.out.println(Arrays.toString(b));
        }

        return t[len][sum];
    }
}
