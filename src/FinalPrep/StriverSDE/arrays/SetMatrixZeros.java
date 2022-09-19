package FinalPrep.StriverSDE.arrays;


import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] qp={{1,1,1},{1,0,1},{1,1,1}};
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        printMatrix(qp);
        setMatrixZeros(qp);
        printMatrix(qp);

        System.out.println("------------");

        printMatrix(arr);
        setMatrixZeros(arr);
        printMatrix(arr);

    }

    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
        System.out.println();
    }
    /* Here we take two new temp arrays to store the ith and jth indices of element 0
    and then in second iteration , we check these temp arrays and then update the element to 0
    in our original array
    * */
    public static void setMatrixZeros(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;

        int[] nArr=new int[n];
        int[] mArr=new int[m];

        Arrays.fill(nArr,-1);
        Arrays.fill(mArr,-1);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]==0){
                    nArr[i]=0;
                    mArr[j]=0;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                if(nArr[i]==0||mArr[j]==0)
                    matrix[i][j]=0;
            }
        }

    }

    /* Here instead of creating two new temp arrays, we will use the first row and
    column of the original array to store the data of 0. But as arr[0][0] overlaps the
    first row and column, we take a boolean variable and update it to true if the arr[i][0]
    is 0 and during second iteration, we traverse from ending and check if the arr holds ele 0.
    * */
    public static void setMatrixZerosOptimized(int[][] matrix){
        boolean col0=false;
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            if(matrix[i][0]==0)
                col0=true;
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j++){
                if(matrix[i][0]==0||matrix[0][j]==0)
                    matrix[i][j]=0;
            }
            if(col0==true)
                matrix[i][0]=0;
        }

    }

}
