package MD.dynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;

public class EggDroppingMemoizeOptimization {
    private static int[][] t;
    public static void main(String[] args) {
        //findMinAttemptsInWhichWeCanFigureOutOnWhichFloorTheEggWillBreak
        System.out.println(minNoOfAttemptEggDrop(1, 3));
        System.out.println(minNoOfAttemptEggDrop(1, 2));
        System.out.println(minNoOfAttemptEggDrop(2, 10));
        System.out.println(minNoOfAttemptEggDrop(3, 26));
        System.out.println(minNoOfAttemptEggDrop(8, 50));
    }
    private static int minNoOfAttemptEggDrop(int eggs,int floors){
        t=new int[eggs+1][floors+1];
        for(int[] rows:t)
            Arrays.fill(rows,-1);
        return solve(eggs,floors);
    }
    private static int solve(int eggs,int floors){
        if(floors==0||floors==1)
            return floors;
        if(eggs==1)
            return floors;
        if(t[eggs][floors]!=-1)
            return t[eggs][floors];
        int minValue=Integer.MAX_VALUE;
        for(int k=1;k<=floors;k++){
            int low,high=0;

            if(t[eggs-1][k-1]!=-1)
                low=t[eggs-1][k-1];
            else
                low=solve(eggs-1,k-1);

            if(t[eggs][floors-k]!=-1)
                high=t[eggs][floors-k];
            else
                high=solve(eggs,floors-k);

            int tempValue=1+Math.max(low,high);
            minValue=Math.min(minValue,tempValue);
        }
        t[eggs][floors]=minValue;
        return t[eggs][floors];
    }
}
