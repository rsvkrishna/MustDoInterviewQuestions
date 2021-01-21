package MD.dynamicProgramming.unboundedKnapsack;

import java.util.Arrays;

public class CoinChangeMaxNumberOfWays {
    public static void main(String[] args) {
        int[] S = {1,2,3};
        int N = 4;

        System.out.println("Maximum num of ways are "+findMaxWaysInCoinChange(S,N)); // {1,1,1,1},{1,1,2},{2,2},{1,3}
    }

    private static int findMaxWaysInCoinChange(int[] S,int N){
        int n=S.length+1;
        int m=N+1;
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
                if(S[i-1]<=j){
                    t[i][j]=t[i][j-S[i-1]]+t[i-1][j];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }

        /*for (int[] b:t) {
            System.out.println(Arrays.toString(b));
        }*/
        return t[S.length][N];
    }
}
