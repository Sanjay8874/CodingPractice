package Java8_Practice;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Problemss_Solution {

    //Write a lambda expression that takes two integers and returns the greater of the two.
    public static Integer greaterValue(int a, int b) {

        BinaryOperator<Integer> max = (n, m) -> n > m ? n : m;

        Integer max1 = max.apply(a, b);

        return max1;
    }

    // Given List of Integer find Max Value from it.
    public static Optional<Integer> findMaxFromList(List<Integer> list) {

        Optional<Integer> max = list.stream().max(Integer::compareTo);

        return max;
    }


    //Given a list of integers, use the Stream API to find the sum of all even numbers.
    public static int findSumEven(List<Integer> list) {
        int sum = list.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);

        return sum;
    }


}
