package keerthana.test;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        series();
    }

    public static void series(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of terms");
        int n=sc.nextInt();
        int S=0;
        int x=0;// you can take this input from command prompt just like 'n'
        int denominator =0;

        for(int i=1;i<=n;i++){
            denominator=denominator+5;
            S=S+((x+i)/factorial(denominator));
        }
    }

    public static int factorial(int fact)
    {
        int num = 1;
        while(fact > 0)
        {
            num = num * fact;
            fact--;
        }
        return num;
    }
}
