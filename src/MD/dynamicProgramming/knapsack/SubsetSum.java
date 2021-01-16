package MD.dynamicProgramming.knapsack;

import java.util.Arrays;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr={2,3,7,8,10};
        int sum=11;
        System.out.println("can we form a subset? "+isThereASubset(arr,sum));

    }
    public static boolean isThereASubset(int[] arr,int sum){
        int len=arr.length;
        int n=arr.length+1;
        int m=sum+1;
        boolean[][] t=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0)
                    t[i][j]=false;
                if(j==0)
                    t[i][j]=true;
            }
        }

        /*for (boolean[] b:t) {
            System.out.println(Arrays.toString(b));
        }*/

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i-1]<=j)
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                else
                    t[i][j]= t[i-1][j];
            }
        }

        return t[len][sum];
    }
}
