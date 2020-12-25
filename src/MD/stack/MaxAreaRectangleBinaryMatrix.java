package MD.stack;

import java.util.Arrays;

public class MaxAreaRectangleBinaryMatrix {
    public static void main(String[] args) {
        int arr[][]={{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        int size=arr[0].length;
        //System.out.println(Arrays.toString(arr[0])); // to print 1st row of this matrix
        System.out.println(arr[0][1]);
        System.out.println("Max area is "+findMaxAreaRectBinaryMatrix(arr,size));

    }
    public static int findMaxAreaRectBinaryMatrix(int[][] arr,int size){
        int[] temp=new int[size];
        for(int j=0;j<size;j++)
            temp[j]=arr[0][j];
        //System.out.println(Arrays.toString(temp));
        int max=MaximumAreaHistogram.findMAH(temp,temp.length);

        for(int i=1;i<arr.length;i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] == 0)
                    temp[j] = 0;
                else
                    temp[j] = temp[j] + arr[i][j];
            }
            max=Math.max(max,MaximumAreaHistogram.findMAH(temp,temp.length));
        }

        return max;
    }
}
