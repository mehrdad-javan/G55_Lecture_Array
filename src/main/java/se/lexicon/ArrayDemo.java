package se.lexicon;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        // datatype[] arrayNane;
        int[] numbers = new int[3]; // [ 0 , 0 , 0 ]
        String[] names = new String[3]; // [ null , null , null ]
        char[] letters = {1, 2, 3, 4, 5}; // [5] // [1, 2, 3, 4, 5]

        ex3();


    }

    public static void ex1() {
        String[] names = new String[3]; // [ "Fredrik" , "Markus" , null ]
        System.out.println(names.length); // 3
        System.out.println("------------------");
        names[0] = "Fredrik";
        names[1] = "Markus";
        names[names.length - 1] = "Jonas";

        System.out.println(names[1]);
        System.out.println(names[0]);
        //System.out.println(names[10]); // Output : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
    }

    public static void ex2() {
        int[] numbers = {5, 2, 3, 4, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                numbers[i] = 200;
            }
            System.out.println("index [" + i + "] = " + numbers[i]);
        } // {5, 2, 200, 4, 7}

        System.out.println("-------------------");
        for (int number : numbers) { // {5, 2, 200, 4, 7}
            if (number == 200) {
                number = 5000; // {5, 2, 5000, 4, 7}
            }
            System.out.println(number); // {5, 2, 5000, 4, 7}
        }

        System.out.println("----------------");
        System.out.println(Arrays.toString(numbers));
    }

    public static void ex3() {
        int[] originalArray = {2, 5, 8, 1, 9}; // [2, 5, 8, 1, 9]
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(originalArray));

        //  [2, 5, 8, 1, 9, 100]
        int[] newArray = new int[originalArray.length + 1]; // [0 , 0 , 0 , 0 , 0 , 0]

        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        } // [2 , 5 , 8 , 1 , 9 , 0]
        newArray[newArray.length - 1] = 100; // [2 , 5 , 8 , 1 , 9 , 100]

        System.out.println("Expanded Array:");
        System.out.println(Arrays.toString(newArray));

    }

    // Write a program that find the maximum number in a given array of integers?
    public static int findMaxNumber(int[] numbers) { // [2 , 5 , 8000 , 1 , 9 , 100]
        int maxNumber = numbers[0]; // maxNumber = 8000;

        for (int i = 1; i < numbers.length; i++) { // [5 , 8000 , 1 , 9 , 100]
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        return maxNumber;

    }
    // scenarios to test
    // 1. An array with positive numbers
    // 2. An array with negative numbers
    // 3. An array with a mix of negative & positive numbers
    // 4. An Empty Array
    // 5. An Array with a duplicate numbers
    // ...



}
