package MD.dynamicProgramming.LongestCommonSubsequence;

public class LongestCommonSubStringLength {
    private static int[][] t;
    public static void main(String[] args) {
        String s1 = "AGGT";
        String s2 = "A";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        t=new int[m+1][n+1];

        System.out.println("Length of LC substring is "+findLCSubstringLength(X,Y,m,n));
    }
    public static int findLCSubstringLength(char[] X,char[] Y,int m,int n){
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(X[i-1]==Y[j-1])
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=0;
            }
        }

        // we have to return max value in 't'
        int maxLen=0;
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(t[i][j]>maxLen)
                    maxLen=t[i][j];
            }
        }
        return maxLen;
    }
}
