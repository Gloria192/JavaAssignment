package Filtering;

import java.util.Arrays;
import java.util.List;

import static Filtering.EvenNumberFilter.filterEvenNumbers;

public class main1 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(2, 45, 67, 878, 89, 866, 90, 76, 4);
            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .toList();
            filterEvenNumbers(numbers);
            System.out.println("the numbers are: " + numbers);
            System.out.println("the numbers are: " + evenNumbers);
        }

}
