package se.lexicon;

import java.util.Arrays;

public class UtilArrayDemo {

    public static void main(String[] args) {
        ex2();
    }

    public static void ex1() {
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
        System.out.println("Original Array: " + Arrays.toString(names));
        // A 65 < Z 90 < a 97 < z 122
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        //Arrays.sort(names, String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println("Sorted Array: " + Arrays.toString(names));

    }

    public static void ex2() {
        int[] numbers = {700, 900, 200, 4555, 34500, 445000, 600000};
        Arrays.sort(numbers); // Sorted Array:  {200, 700, 900, 4555, 34500, 445000, 600000}
        int index = Arrays.binarySearch(numbers, 100); // Returns the index if found, else returns a negative number
        if (index < 0) {
            System.out.println("Index Not found");
        } else {
            System.out.println("Value found [" + index + "]: " + numbers[index]);
        }
    }

    public static void ex3() {
        int[] numbers = {10, 20, 30, 40};

        int[] newArray = Arrays.copyOf(numbers, numbers.length + 1); // [10, 20, 30, 40, 0]
        newArray[newArray.length - 1] = 100; // [10, 20, 30, 40, 100]


    }


}
