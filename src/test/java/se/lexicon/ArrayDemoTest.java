package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayDemoTest {

    // scenarios to test
    // findMaxNumber
    // 1. An array with positive numbers
    // 2. An array with negative numbers
    // 3. An array with a mix of negative & positive numbers
    // 4. An Empty Array
    // 5. An Array with a duplicate numbers
    // ...


    @Test
    @DisplayName("Find the maximum number in an array of positive numbers")
    public void findMaxNumberWithPositiveNumbers() {

        // Test logic here
        // Scenario: A standard array with positive values
        int[] numbers = {1, 5, 3, 9, 2};

        // Expected maximum value is 9
        int expected = 9;

        // Actual maximum value should generate by the implemented logic
        int actual = ArrayDemo.findMaxNumber(numbers);

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }
    // https://docs.github.com/en/copilot/managing-copilot/configure-personal-settings/installing-the-github-copilot-extension-in-your-environment

    @Test
    @DisplayName("Find the maximum number in an array of negative numbers")
    public void findMaxNumberWithNegativeNumbers() {

        // Test logic here
        // Scenario: An array with negative values
        int[] numbers = {-10, -5, -3, -9, -2};

        // Expected maximum value is -2
        int expected = -2;

        // Actual maximum value should generate by the implemented logic
        int actual = ArrayDemo.findMaxNumber(numbers);

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }

    // add more methods as needed



}
