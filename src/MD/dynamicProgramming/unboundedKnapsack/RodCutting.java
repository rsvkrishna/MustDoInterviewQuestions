package MD.dynamicProgramming.unboundedKnapsack;

import java.util.Arrays;

public class RodCutting {
    public static void main(String[] args) {
        int[] len= {1,2,3,4};
        int[] cost={1,5,8,9};
        int N=8;

        System.out.println("Max Profit would be "+findMaxProfitRodCutting(len,cost,N));
    }

    private static int findMaxProfitRodCutting(int[] len,int[] cost,int N){
        int n=len.length+1;
        int m=N+1;
        int[][] t=new int[n][m];

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(len[i-1]<=j)
                    t[i][j]=Math.max(cost[i-1]+t[i][N-len[i-1]],t[i-1][j]);
                else
                    t[i][j]=t[i-1][j];
            }
        }
       /* for (int[] b:t) {
            System.out.println(Arrays.toString(b));
        }*/
        return t[len.length][N];
    }
}
