package MD.funcProg;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sample {
    public static void main(String[] args) {
        //find the double of the first even number greater than 3
        List<Integer> values= Arrays.asList(1,2,3,5,4,6,7,8,9);

        System.out.println(values.stream()
                            .filter(e->e>3)
                            .filter(e->e%2==0)
                            .map(e->e*2)
                            .findFirst()
                            .get());

        System.out.println(values.stream()
                            .filter(Sample::isGreaterThan3)
                            .filter(Sample::isEven)
                            .map(Sample::doubleIt)
                            .findFirst().get());

        Predicate<Integer> isGreaterThan4 = number -> number > 4;

        Function<Integer,Predicate<Integer>> isGreaterThanX = pivot -> number -> number > pivot;

        System.out.println(values.stream()
                        .filter(isGreaterThanX.apply(5))
                        .filter(isGreaterThanX.apply(6))
                        .map(Sample::doubleIt)
                        .findFirst()
                        .get()
        );


        List<Integer> newValues= Arrays.asList(1,2,3,5,4,6,7,8,9,10);

        System.out.println("sum of all numbers of newValues "+totalSum(newValues,e->true));
        System.out.println("sum of even numbers of newValues "+totalSum(newValues,e->e%2==0));
        System.out.println("sum of odd numbers of newValues "+totalSum(newValues,e->e%2==1));

    }

    public static Integer totalSum(List<Integer> numbers,Predicate<Integer> selector){
        return numbers.stream().filter(selector).reduce(0,Math::addExact);
    }

    public static boolean isGreaterThan3(int number){
        return number>3;
    }

    public static boolean isEven(int number){
        return number%2==0;
    }

    public static int doubleIt(int number){
        return number*2;
    }

}
