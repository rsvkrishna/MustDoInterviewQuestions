package MD.funcProg;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Basics {

    public static void _1first(){
        System.out.println(isPrime(4));
        System.out.println(isPrime(3));

        System.out.println(isPrime2(4));
        System.out.println(isPrime2(3));
    }

    public static boolean isPrime2(int number){

        IntPredicate isDivisible=divisor -> number % divisor ==0;

        return number>1 &&
                IntStream.range(2,number)
                .noneMatch(isDivisible);
    }

    public static boolean isPrime(int number){
/*        for(int i=2;i<number;i++)
            if(number%i==0)
                return false;

        return number>1;*/
    return number>1 &&
            IntStream.range(2,number)
            .noneMatch(index -> number%index==0);
    }

    public static void _2Second(){

    }

    public static void main(String[] args) {
        // the very first basics of func programming
        // let us find our if a given number is prime
        _1first();
    }
}
