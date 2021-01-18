package MD.dynamicProgramming.knapsack;

import java.util.ArrayList;
import java.util.Arrays;

public class MinSubsetSumDifference {
    public static void main(String[] args) {
        //int[] arr = {1, 6, 11, 5}; //op 1
        int[] arr = {4,2,1,3};//{1, 2,7}; //op 4                    1 2 3 4
        System.out.println("Minimum difference of Subsets is "+findMinSubsetSumDifference(arr));
    }
    public static int findMinSubsetSumDifference(int[] arr){
        int n=arr.length+1;
        int range=0;
        for(int i=0;i<arr.length;i++)
            range=range+arr[i];
        int m=range+1;
        boolean[][] t=new boolean[n][m];

        for (int i = 0; i <n; i++){
            for (int j = 0; j <m ; j++) {
                if(i==0)
                    t[i][j]=false;
                if(j==0)
                    t[i][j]=true;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i-1]<=j)
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                else
                    t[i][j]= t[i-1][j];
            }
        }

        for (boolean[] b:t) {
            System.out.println(Arrays.toString(b));
        }

        ArrayList<Integer> lastRow=new ArrayList();

        for(int i=n-1;i<n;i++){
            for(int j=1;j<=(m/2);j++){
                if(t[i][j]==true)
                    lastRow.add(j);
            }
        }

        System.out.println(lastRow);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<lastRow.size();i++){
            min=Math.min(min,Math.abs(range-2*lastRow.get(i)));
            System.out.println(min);
        }

        return min;

    }
    
}
