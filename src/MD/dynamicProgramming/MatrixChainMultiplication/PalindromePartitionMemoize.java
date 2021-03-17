package MD.dynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;

public class PalindromePartitionMemoize {
    private static int[][] t=new int[100][100];
    public static void main(String[] args) {
        String str = "abbb";//"ababbbabbababa";
        for (int[] a:t) {
            Arrays.fill(a,-1);
        }
        System.out.println("Min cuts needed for "
                + "Palindrome Partitioning is " + minPalPartition(str,0,str.length()-1));
        System.out.println("Min cuts needed for "
                + "Palindrome Partitioning Optimal is " + minPalPartitionOpti(str,0,str.length()-1));
    }
    private static int minPalPartitionOpti(String s,int i,int j){
        if(i>=j||isPalindrome(s,i,j))
            return 0;
        if(t[i][j]!=-1)
            return t[i][j];

        int minValue=Integer.MAX_VALUE;
        int tempAns,left,right=0;
        for(int k=i;k<=j-1;k++){

            if(t[i][k]!=-1)
                left=t[i][k];
            else {
                left = minPalPartitionOpti(s,i,k);
                t[i][k]=left;
            }
            if(t[k+1][j]!=-1)
                right=t[k+1][j];
            else {
                right = minPalPartitionOpti(s,k+1,j);
                t[i][k]=right;
            }
            tempAns=1+left+right;
            minValue=Math.min(tempAns,minValue);
        }

        return t[i][j]=minValue;
    }
    private static int minPalPartition(String s,int i,int j){
        if(i>=j||isPalindrome(s,i,j))
            return 0;
        if(t[i][j]!=-1)
            return t[i][j];

        int minValue=Integer.MAX_VALUE;
        int tempAns=0;
        for(int k=i;k<=j-1;k++){
            tempAns=minPalPartition(s,i,k)+1+
                    minPalPartition(s,k+1,j);

            minValue=Math.min(tempAns,minValue);
        }

        return t[i][j]=minValue;
    }
    private static boolean isPalindrome(String s,int i,int j){
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
