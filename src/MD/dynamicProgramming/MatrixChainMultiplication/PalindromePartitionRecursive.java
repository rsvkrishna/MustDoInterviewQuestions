package MD.dynamicProgramming.MatrixChainMultiplication;

public class PalindromePartitionRecursive {
    public static void main(String[] args) {
        String str = "abbb";//"ababbbabbababa";
        System.out.println("Min cuts needed for "
                + "Palindrome Partitioning is " + minPalPartition(str,0,str.length()-1));
    }
    private static int minPalPartition(String s, int i, int j){
        if(i>=j || isPalindrome(s,i,j))
            return 0;
        int minValue=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int tempAns= minPalPartition(s,i,k)+1+
                    minPalPartition(s,k+1,j);

            minValue=Math.min(minValue,tempAns);
        }
        return minValue;
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
