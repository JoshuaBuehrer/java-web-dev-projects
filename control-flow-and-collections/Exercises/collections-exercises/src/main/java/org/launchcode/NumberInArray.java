package org.launchcode;

public class NumberInArray {

    public static void main(String[] args) {


        int[] integerArray = {1, 1, 2, 3, 5, 8};

        System.out.println("All values in the array:");
        for (int value : integerArray) {
            System.out.println(value);
        }

        // Modify the loop to only print the odd numbers
        System.out.println("\nOdd numbers in the array:");
        for (int value : integerArray) {
            if (value % 2 != 0) {
                System.out.println(value);
            }

        }
        ;
    }

}