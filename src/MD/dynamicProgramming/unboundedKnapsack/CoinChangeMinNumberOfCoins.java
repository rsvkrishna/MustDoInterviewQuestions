package MD.dynamicProgramming.unboundedKnapsack;

import java.util.Arrays;

public class CoinChangeMinNumberOfCoins {
    public static void main(String[] args) {
        int[] S =  {1,2,3};
        int N = 7;
        /*int[] S =  {25, 10, 5};
        int N = 30; // o/p : 2 */
        System.out.println("Maximum num of ways are "+findMinNumOfCoins(S,N)); // {1,1,1,1},{1,1,2},{2,2},{1,3}
    }

    private static int findMinNumOfCoins(int[] s, int N) {
        int n=s.length+1;
        int m=N+1;
        int[][] t=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0)
                    t[i][j]=Integer.MAX_VALUE-1;
                if(j==0)
                    t[i][j]=0;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(s[i-1]<=j){
                    t[i][j]=Math.min(t[i][j-s[i-1]]+1,t[i-1][j]);
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }

        for (int[] b:t) {
            System.out.println(Arrays.toString(b));
        }
        return t[s.length][N];
    }
}
