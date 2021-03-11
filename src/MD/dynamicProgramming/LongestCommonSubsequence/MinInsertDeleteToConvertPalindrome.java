package MD.dynamicProgramming.LongestCommonSubsequence;
//same as MinInsertDeleteToConvertStringToPalindrome
public class MinInsertDeleteToConvertPalindrome {
    private static int[][] t;
    public static void main(String[] args) {
        String s1 = "AA";

        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        String s2 =sb.toString(); ;

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = m;
        t=new int[m+1][n+1];
        int lcsLength=findLPS(X,Y,m,n);
        int noDeletion=m-lcsLength;
        int noInsertion =n-lcsLength;
        System.out.println("Deletions required : "+noDeletion+" Insertions required : "+noInsertion);

    }

    private static int findLPS(char[] X,char[] Y,int m,int n){
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
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[m][n];
    }
}
