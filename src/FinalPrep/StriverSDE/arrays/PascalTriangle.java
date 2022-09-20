package FinalPrep.StriverSDE.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {

        List<List<Integer>> pascalTriangle=generatePascalTriangle(5);
        printArrayList(pascalTriangle);

        System.out.println("Nth row's nth Element is " +printNthElementPascalTriangle(5,3));

        System.out.println("Print Nth row "+pascalTriangle.get(5-1));

    }

    public static List<List<Integer>> generatePascalTriangle(int N){
        if(N==1)
            return Arrays.asList(Arrays.asList(1));

        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> curRow=null;
        List<Integer> prevRow=null;

        for(int i=0;i<N;++i){
            curRow=new ArrayList<Integer>();
            for(int j=0;j<=i;++j){
                if(j==0||j==i)
                    curRow.add(1);
                else
                    curRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            prevRow=curRow;
            result.add(curRow);

        }
        return result;
    }

    public static Integer printNthElementPascalTriangle(int N, int n){
        List<List<Integer>> pascalTriangle=generatePascalTriangle(N);
        List<Integer> nthRow=pascalTriangle.get(N-1);
        Integer nthElementInNthColumn=nthRow.get(n-1);

        return nthElementInNthColumn;
    }

    public static void printArrayList(List<List<Integer>> list){
        if(list!=null){
            for (List<Integer> l: list) {
                for(Integer num:l){
                    System.out.print(num);
                }
                System.out.println();
            }
        }
    }
}
