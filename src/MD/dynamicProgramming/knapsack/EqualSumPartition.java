package MD.dynamicProgramming.knapsack;

public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr={1,5,11,5};
        System.out.println("Equal Sum Partition? "+isEqualSumPartition(arr));
    }

    public static boolean isEqualSumPartition(int[] arr){
        int sum=0;int len=arr.length;

        for(int i=0;i<len;i++)
            sum=sum+arr[i];

        if(sum%2!=0)
            return false;
        else
            return localSubsetSum(arr,sum/2);
    }

    private static boolean localSubsetSum(int[] arr,int sum){
        int len=arr.length;
        int n=arr.length+1;
        int m=sum+1;
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
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        return t[len][sum];
    }
}
