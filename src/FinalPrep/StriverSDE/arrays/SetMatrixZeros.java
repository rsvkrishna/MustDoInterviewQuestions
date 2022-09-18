package FinalPrep.StriverSDE.arrays;


import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] qp={{1,1,1},{1,0,1},{1,1,1}};

        for(int i=0;i<qp.length;i++){
            for(int j=0;j<qp[0].length;j++)
                System.out.print(qp[i][j]+" ");
            System.out.println();
        }
        System.out.println();

        setMatrixZeros(qp);

        for(int i=0;i<qp.length;i++){
            for(int j=0;j<qp[0].length;j++)
                System.out.print(qp[i][j]+" ");
            System.out.println();
        }
    }

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
}
