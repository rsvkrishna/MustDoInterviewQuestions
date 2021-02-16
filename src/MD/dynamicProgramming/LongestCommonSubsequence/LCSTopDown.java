package MD.dynamicProgramming.LongestCommonSubsequence;

import java.util.Arrays;

public class LCSTopDown {
    public static int[][] t;
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        t=new int[m+1][n+1];

        System.out.println("Length of LCS - Memoization is "+findLCSTopDown(X,Y,m,n));
    }

    private static int findLCSTopDown(char[] X,char[] Y,int m,int n){
        for(int i=0;i<m+1;i++){ // this is not required
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0)
                    t[i][j]=0;
            }
        }

        for(int i=1;i<m+1;i++){
            for (int j=1;j<n+1;j++){
                if(X[i-1]==Y[j-1])
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }

        return t[m][n];
    }
}
