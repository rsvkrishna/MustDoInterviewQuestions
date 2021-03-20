package MD.dynamicProgramming.MatrixChainMultiplication;

public class EvalExpTrueRecursive {
    public static void main(String[] args) {
        String s="T|T&F^T";
        int res=countParanth(s,0,s.length()-1,true);
        System.out.println("ans is "+res);
    }
    private static int countParanth(String s,int i,int j,boolean isTrue){
        if(i>j)
            return 0;
        if(i==j){
            if(isTrue)
                return s.charAt(i)=='T'?1:0;
            else
                return s.charAt(i)=='F'?1:0;
        }
        int ans=0;
        for(int k=i+1;k<j;k=k+2){
            int lT=countParanth(s,i,k-1,true);
            int lF=countParanth(s,i,k-1,false);
            int rT=countParanth(s,k+1,j,true);
            int rF=countParanth(s,k+1,j,false); //all these are temp ans

            if(s.charAt(k)=='&'){
                if(isTrue)
                    ans=ans+lT*rT;
                else
                    ans=ans+lF*rT+lT*rF+lF*rF;
            } else if(s.charAt(k)=='|'){
                if(isTrue)
                    ans=ans+lT*rT+lT*rF+lF*rT;
                else
                    ans=ans+lF*rF;
            } else if(s.charAt(k)=='^') {
                if (isTrue)
                    ans = ans+lT*rF+lF*rT;
                else
                    ans = ans+lF*rF+lT*rT;
            }
        }
        return ans;
    }
}
