package MD.sorting;

public class SquareRoot {
    public static void main(String[] args) {
        long x=11l;
        long sr=floorSqrt1(x);
        long sr2=floorSqrt2(x);
        System.out.println("Fist : "+sr+" Second : "+sr2);
    }

    public static long floorSqrt1(long x)
    {
        if(x==0||x==1)
            return x;

        int i=1;
        while (i<=x){
            if(i*i>x)
                return i-1;
            i++;
        }
        return 0;
    }

    public static long floorSqrt2(long x){
        if(x==0||x==1)
            return x;

        long l=1;long u=x;long mid=0;long ans=0;
        while(l<=u){
            mid=(l+u)/2;

            if(mid*mid==x)
                return mid;

            if(mid*mid < x){
                l=mid+1;
                ans=mid;
            }else{
                u=mid-1;
            }
        }
        return ans;
    }
}
