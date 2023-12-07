package org.launchcode;

import java.util.ArrayList;
public class SumEven {

    public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.add(5);
       numbers.add(4);
        numbers.add(8);
        numbers.add(4);
        numbers.add(8);
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);
        numbers.add(6);

        int sumEven = SumOfNumbers(numbers);

        System.out.println("the sum is " + sumEven);
    }

    public static int SumOfNumbers(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}

