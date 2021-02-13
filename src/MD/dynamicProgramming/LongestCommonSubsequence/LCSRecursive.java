package MD.dynamicProgramming.LongestCommonSubsequence;

/*Longest common subsequence*/
public class LCSRecursive {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is "+findLCSRecursive(X,Y,m,n));
    }

    private static int findLCSRecursive(char[] X,char[] Y,int m,int n){
        if(m==0||n==0)
            return 0;
        if(X[m-1]==Y[n-1])
            return 1+findLCSRecursive(X,Y,m-1,n-1);
        else
            return Math.max(findLCSRecursive(X,Y,m,n-1),findLCSRecursive(X,Y,m-1,n));
    }
}