package MD.dynamicProgramming.unboundedKnapsack;

public class ItemValueUnboundedKnapsackTopDown {
    public static void main(String[] args) {
        int W=100;
        int[] val ={1,30};
        int[] wt={1,50};

        int len=wt.length;
        //t=new int[n+1][W+1];
        System.out.println("Max Profit "+ unboundedKnapsackUsingTopDown(wt,val,W,len));
    }

    private static int unboundedKnapsackUsingTopDown(int[] wt,int[] val,int W,int len){
        int n=len+1;
        int m=W+1;
        int[][] t=new int[n][m];

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(wt[i-1]<=j)
                    t[i][j]=Math.max(val[i-1]+t[i][j-wt[i-1]],t[i-1][j]);
                else
                    t[i][j]=t[i-1][j];

            }
        }
        return t[len][W];
    }
}
