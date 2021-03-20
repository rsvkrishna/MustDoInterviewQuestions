package MD.dynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;
import java.util.HashMap;

public class EvalExpTrueMemoize {
    private static int t[][][];
    public static void main(String[] args) {
        String s="T|T&F^T";
        int N=s.length();
        t= new int[N + 1][N + 1][2];
        for (int row[][] : t)
            for (int col[] : row)
                Arrays.fill(col, -1);
        int res=countParanthMemoize(s,0,s.length()-1,1);
        System.out.println("ans is "+res);
    }
    private static int countParanthMemoize(String s,int i,int j,int isTrue){
        if(i>j)
            return 0;
        if(i==j){
            if(isTrue==1)
                return s.charAt(i)=='T'?1:0;
            else
                return s.charAt(i)=='F'?1:0;
        }
        if (t[i][j][isTrue] != -1)
            return t[i][j][isTrue];

        int ans=0;int lT,lF,rT,rF;
        for(int k=i+1;k<j;k=k+2){

            if (t[i][k-1][1] != -1)
                return t[i][k-1][1];
            else
                lT=countParanthMemoize(s,i,k-1,1);

            if (t[i][k-1][0] != -1)
                return t[i][k-1][0];
            else
                lF=countParanthMemoize(s,i,k-1,0);

            if (t[k+1][j][1] != -1)
                return t[k+1][j][1];
            else
                rT=countParanthMemoize(s,k+1,j,1);

            if (t[k+1][j][0] != -1)
                return t[k+1][j][0];
            else
                rF=countParanthMemoize(s,k+1,j,0);

            if(s.charAt(k)=='&'){
                if(isTrue==1)
                    ans=ans+lT*rT;
                else
                    ans=ans+lF*rT+lT*rF+lF*rF;
            } else if(s.charAt(k)=='|'){
                if(isTrue==1)
                    ans=ans+lT*rT+lT*rF+lF*rT;
                else
                    ans=ans+lF*rF;
            } else if(s.charAt(k)=='^') {
                if (isTrue==1)
                    ans = ans+lT*rF+lF*rT;
                else
                    ans = ans+lF*rF+lT*rT;
            }
            t[i][j][isTrue] = ans;
        }
        return ans;
    }
}
