package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private Main YourClassName;

    @Test
    public void testInputOutputTask() {
        double expected = 78.5;
        double result = Main.inputOutputTask();
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void testIntegerNumbersTask() {
        int expected = 10;
        int result = (int) Main.integerNumbersTask(12);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testBooleanTask() {
        boolean expected = true;
        boolean result = Main.booleanTask();
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testIfTask() {
        int expected = 1;
        int result = Main.ifTask(5, 10);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testSwitchUnits() {
        double expected = 1000.0;
        double result = Main.switchUnits(1, 1000.0);
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void testLoopWithParameter() {
        int expected = 45;
        int result = Main.loopWithParameter(5, 10);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testLoopWithCondition() {
        int expected = 6;
        int result = Main.loopWithCondition(25);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testSequences() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = Main.sequences(5);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testInvertDigits() {
        int[] numbers = {12, 67, 54, 9, 11111};
        int[] expectedReversed = {21, 76, 45, 9, 11111};

        for (int i = 0; i < numbers.length; i++) {
            int reversed = YourClassName.InvertDigits(numbers[i]);
            assertEquals(expectedReversed[i], reversed);
        }
    }

    @Test
    public void testMinimumsAndMaximums() {
        int[] expected = {5, 4};
        int[] result = org.example.Main.minimumsAndMaximums(new int[]{12, 67, 54, 9, 11111});
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testOneDimensionalArrays() {
        int[] expected = {6, 5, 4, 3, 2, 1};
        int[] result = org.example.Main.oneDimensionalArrays(new int[]{1, 2, 3, 4, 5, 6});
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testTwoDimensionalArrays() {
        int[] expected = {4, 5, 6};
        int[] result = org.example.Main.twoDimensionalArrays(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }, 2);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testCharactersAndLines() {
        int[] expected = {72, 100};
        int[] result = org.example.Main.charactersAndLines("Hello, World!");
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testBinaryFiles() {
        // Додайте тест для методу binaryFiles, якщо це можливо
    }

    @Test
    public void testTextFiles() {
        // Додайте тест для методу textFiles, якщо це можливо
    }

    @Test
    public void testCompositeDataTypesInProceduresAndFunctions() {
        // Додайте тест для методу compositeDataTypesInProceduresAndFunctions, якщо це можливо
    }

    @Test
    public void testRecursion() {
        int expected = 10;
        int result = org.example.Main.recursion();
        Assert.assertEquals(result, expected);
    }
}
