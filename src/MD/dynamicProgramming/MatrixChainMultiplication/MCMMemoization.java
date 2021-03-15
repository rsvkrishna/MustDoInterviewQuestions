package MD.dynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;

public class MCMMemoization {
    private static int[][] t=new int[100][100];//using constraint we have to initialize
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        for (int[] a:t) {
            Arrays.fill(a,-1);
        }
        System.out.println("Minimum number of multiplications using memoize is " +
                effMultiplyMem(arr, 1, arr.length-1));
    }
    private static int effMultiplyMem(int[] arr,int i,int j){
        if(i>=j)
            return 0;
        if(t[i][j]!=-1)
            return t[i][j];
        int minValue=Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            int tempAns=effMultiplyMem(arr,i,k)+effMultiplyMem(arr,k+1,j)+
                    (arr[i-1]*arr[k]*arr[j]);

            if (tempAns < minValue) {
                minValue = tempAns;
            }
        }

        return t[i][j]=minValue;
    }
}
