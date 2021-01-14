package MD.dynamicProgramming.knapsack;

import java.util.Arrays;

public class ItemValue01KnapsackMemoization {
    public static int[][] t;
    public static void main(String[] args) {
        int[] wt={1,3,4,5};
        int[] val={1,4,5,7};
        int W=7;
        int n=wt.length;
        t=new int[n+1][W+1];
        for (int[] a:t) {
            Arrays.fill(a,-1);
        }
        System.out.println("Max Profit with Memoization"+knapsackUsingMemoization(wt,val,W,n));
    }

    public static int knapsackUsingMemoization(int[] wt,int[] val,int W,int n){
        //base condition
        if(n==0||W==0)
            return 0;

        if(t[n][W]!=-1)
            return t[n][W];

        if(wt[n-1]<=W){
            t[n][W]=Math.max(val[n-1]+knapsackUsingMemoization(wt,val,W-wt[n-1],n-1)
            ,knapsackUsingMemoization(wt,val,W,n-1));
            return t[n][W];
        }
        else {
            t[n][W]=knapsackUsingMemoization(wt, val, W, n - 1);
            return t[n][W];
        }
    }
}
