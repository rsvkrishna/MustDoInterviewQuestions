package MD.dynamicProgramming.LongestCommonSubsequence;

import java.util.Arrays;

public class LCSMemoization {
    public static int[][] t;
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        t=new int[n+1][m+1];
        for (int[] a:t) {
            Arrays.fill(a,-1);
        }

        System.out.println("Length of LCS - Memoization is "+findLCSMemoization(X,Y,m,n));
    }

    private static int findLCSMemoization(char[] X,char[] Y,int m,int n){
        if(n==0||m==0)
            return 0;

        if(t[n][m]!=-1)
            return t[n][m];

        if(X[m-1]==Y[n-1]){
            t[n][m]=1+findLCSMemoization(X,Y,m-1,n-1);
            return t[n][m];
        }
        else {
            t[n][m]=Math.max(findLCSMemoization(X,Y,m,n-1),findLCSMemoization(X,Y,m-1,n));
            return t[n][m];
        }

    }


}
