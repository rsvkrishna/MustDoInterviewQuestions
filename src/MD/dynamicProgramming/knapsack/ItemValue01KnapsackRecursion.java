package MD.dynamicProgramming.knapsack;

public class ItemValue01KnapsackRecursion {
    public static void main(String[] args) {
        int[] wt={1,3,4,5};
        int[] val={1,4,5,7};
        int W=7;
        int n=wt.length;
        System.out.println("Max Profit "+findMaxWeight01Knapsack(wt,val,W,n));

    }

    public static int findMaxWeight01Knapsack(int[] wt,int[] val,int W,int n){
        //base condition
        if(n==0||W==0)
            return 0;

        //recursion
        if(wt[n-1]<=W)
            return Math.max(val[n-1]+findMaxWeight01Knapsack(wt,val,W-wt[n-1],n-1)
                    ,findMaxWeight01Knapsack(wt,val,W,n-1));
        else
            return findMaxWeight01Knapsack(wt,val,W,n-1);
    }
}
