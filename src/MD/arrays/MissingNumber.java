package MD.arrays;

public class MissingNumber {
    public static void main(String args[]){
        int a[] = { 0, 1, 2, 4, 5, 6 };
        int miss = missingNumber1(a, 6);
        System.out.println(miss);
        int miss2 = missingNumber2(a, 6);
        System.out.println(miss2);
    }

    public static int missingNumber1(int a[], int n){
        int i, total;
        total = (n ) * (n + 1) / 2;
        for (i = 0; i < n; i++)
            total =total- a[i];
        return total;
    }

    public static int missingNumber2(int a[], int n){

        int x1=0; int x2=0;
        for(int i=0;i<a.length;i++){
            x1 =x1^a[i];
        }
        for(int i=0;i<=n;i++){
            x2=x2^i;
        }
        return x1^x2;
    }
}
