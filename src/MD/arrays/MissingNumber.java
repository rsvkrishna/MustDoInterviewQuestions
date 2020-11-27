package MD.arrays;

public class MissingNumber {
    public static void main(String args[]){
        int a[] = { 1, 2, 4, 6, 3, 7 ,8 };
        int miss = missingNumber1(a, 7);
        System.out.println(miss);
        int miss2 = missingNumber2(a, 7);
        System.out.println(miss2);
    }
    //basic
    public static int missingNumber1(int a[], int n){
        int i, total;
        total = (n +1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total =total- a[i];
        return total;
    }
    //using xor
    public static int missingNumber2(int a[], int n){

        int x1=a[0]; int x2=1;
        for(int i=1;i<a.length;i++){
            x1 =x1^a[i];
        }
        for(int i=2;i<=n+1;i++){
            x2=x2^i;
        }
        return x1^x2;
    }
}
