package MD.dynamicProgramming.MatrixChainMultiplication;
//find most efficient way to multiply matrices
public class MCMRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
            System.out.println("Minimum number of multiplications is " + effMultiply(arr, 1, arr.length-1));
    }
    private static int effMultiply(int[] arr,int i,int j){
        if(i>=j)
            return 0;
        int minValue=Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            int tempAns=effMultiply(arr,i,k) +
                        effMultiply(arr,k+1,j)+
                        (arr[i-1]*arr[k]*arr[j]);

            if (tempAns < minValue)
                minValue=tempAns;
        }
        return minValue;
    }
}
