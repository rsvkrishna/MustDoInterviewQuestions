package MD.dynamicProgramming.knapsack;

import java.util.Arrays;

public class CountNumSubsetGivenDifference {

    public static void main(String[] args) {
        int[] arr={1,1,2,3};
        int diff=1;
        System.out.println("the number of subsets with given difference is "
                +findCountNumSubsetGivenDifference(arr,diff));

    }

    public static int findCountNumSubsetGivenDifference(int[] arr,int diff){
     int sum=0;
     for(int i=0;i<arr.length;i++)
         sum=sum+arr[i];

        //System.out.println(sum);
        int s1=0;int s2=0;
        s1=(diff+sum)/2;
        //System.out.println(s1);

        int s1Count=findCountSubsetSum(arr,4);
        //System.out.println(s1Count);

        return s1Count;
    }

    private static int findCountSubsetSum(int[] arr,int sum){
        int n=arr.length+1;
        int m=sum+1;
        int len=arr.length;
        int[][] t=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0)
                    t[i][j]=0;
                if(j==0)
                    t[i][j]=1;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i-1]<=j)
                    t[i][j]=t[i-1][j-arr[i-1]]+t[i-1][j];
                else
                    t[i][j]=t[i-1][j];
            }
        }
        /*for (int[] b:t) {
            System.out.println(Arrays.toString(b));
        }*/

        return t[len][sum];
    }
}
