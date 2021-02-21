package MD.dynamicProgramming.LongestCommonSubsequence;
//find length of ShortestCommonSuperSequence of two strings
public class ShortestCommonSuperSequence {
    private static int[][] t;
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        t=new int[m+1][n+1];

        String s3=s1.concat(s2);
        System.out.print("the length of ShortestCommonSuperSequence is ");
        System.out.print(s3.length()-findLCLength(X,Y,m,n));

    }

    private static int findLCLength(char[] X,char[] Y,int m,int n){
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(X[i-1]==Y[j-1])
                    t[i][j]=t[i-1][j-1]+1;
                else
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }

        return t[m][n];
    }
}
