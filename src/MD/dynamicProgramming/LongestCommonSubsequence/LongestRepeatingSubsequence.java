package MD.dynamicProgramming.LongestCommonSubsequence;

public class LongestRepeatingSubsequence {
    private static int[][] t;
    public static void main(String[] args) {
        String s1 = "aabb";
        String s2 = "aabb";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        t=new int[m+1][n+1];

        System.out.println("Length of LongestRepeatingSubsequence is "+findLongestRepeatingSubsequence(X,Y,m,n));
        System.out.println("The sequence is "+printSequence(t,X,Y,m,n));
    }
    private static int findLongestRepeatingSubsequence(char[] X,char[] Y,int m, int n){
        for(int i=0;i<m+1;i++)
            for(int j=0;j<n+1;j++)
                if(i==0||j==0)
                    t[i][j]=0;

        for(int i=1;i<m+1;i++)
            for(int j=1;j<n+1;j++)
                if(X[i-1]==Y[j-1]&&i!=j)
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);

        return t[m][n];
    }

    private static StringBuilder printSequence(int[][] t,char[] X,char[] Y,int m,int n){
        int i=m;int j=n;StringBuilder s=new StringBuilder();
        while(i>0 && j>0){
            if(X[i-1]==Y[j-1]&&i!=j){
                s.append(X[i-1]);
                i--;j--;
            }
            else{
                if(t[i][j-1]>t[i-1][j])
                    j--;
                else
                    i--;
            }
        }
        return s.reverse();
    }
}
