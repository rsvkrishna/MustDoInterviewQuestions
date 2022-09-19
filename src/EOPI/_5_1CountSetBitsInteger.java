package EOPI;

public class _5_1CountSetBitsInteger {
    public static void main(String[] args) {
        int x=7;
        System.out.println("the number of set bits in interger "+x+" is "+findSetBitsInt(x));
        System.out.println(2&1);
    }

    protected static int findSetBitsInt(int n){
        int count=0;
        while (n>0){
            count=count+(n&1);
            n>>=1;
        }
        return count;
    }
}

/*
*   0010
*   0001
*
*
* */