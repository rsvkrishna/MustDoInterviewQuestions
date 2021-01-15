package MD.dynamicProgramming.knapsack;

import java.util.Arrays;

public class ItemValue01KnapsackTopDown {
    public static int[][] t;
    public static void main(String[] args) {
        int[] wt={1,3,4,5};
        int[] val={1,4,5,7};
        int W=7;
        int n=wt.length;
        t=new int[n+1][W+1]; //
        System.out.println("Max Profit "+ knapsackUsingTopDown(wt,val,W,n));
    }

    public static int knapsackUsingTopDown(int[] wt,int[] val,int W,int n){

        for(int i=0;i<n;i++){ // this is not required
            for(int j=0;j<W;j++){
                if(i==0 || j==0)
                    t[i][j]=0;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j)
                    t[i][j]=Math.max((val[i-1]+t[i-1][j-wt[i-1]]),t[i-1][j]);
                 else
                    t[i][j]=t[i-1][j];
            }
        }

    return t[n][W];
    }

}

