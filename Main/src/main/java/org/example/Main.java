package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result = inputOutputTask();
        System.out.println(result);

        result = integerNumbersTask(12);
        System.out.println(result);

        boolean booleanResult = booleanTask();
        System.out.println(booleanResult);

        int ifResult = ifTask(5, 10);
        System.out.println(ifResult);

        double switchResult = switchUnits(1, 1000.0);
        System.out.println(switchResult);

        int loopWithParamResult = loopWithParameter(5, 10);
        System.out.println(loopWithParamResult);

        int loopWithCondResult = loopWithCondition(25);
        System.out.println(loopWithCondResult);

        int[] sequencesResult = sequences(5);
        for (int value : sequencesResult) {
            System.out.println(value);
        }

        proceduresAndFunctions();

        int[] minMaxResult = minimumsAndMaximums(new int[]{12, 67, 54, 9, 11111});
        for (int value : minMaxResult) {
            System.out.println(value);
        }

        int[] oneDimensionalResult = oneDimensionalArrays(new int[]{1, 2, 3, 4, 5, 6});
        for (int value : oneDimensionalResult) {
            System.out.println(value);
        }

        int[] twoDimensionalResult = twoDimensionalArrays(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }, 2);
        for (int value : twoDimensionalResult) {
            System.out.println(value);
        }

        int[] charsAndLinesResult = charactersAndLines("Hello, World!");
        for (int value : charsAndLinesResult) {
            System.out.println(value);
        }

        int[] binaryFilesResult = binaryFiles("yourfile.txt");
        if (binaryFilesResult != null) {
            for (int value : binaryFilesResult) {
                System.out.println(value);
            }
        }

        boolean textFilesResult = textFiles("yourfile.txt", "Це рядок S, який додаємо на початок файлу.\n");
        System.out.println(textFilesResult);

        compositeDataTypesInProceduresAndFunctions();

        int recursionResult = recursion();
        System.out.println(recursionResult);
    }

    public static double inputOutputTask() {
        System.out.println("////////////////////------1 lesson---------///////////////////////////////");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Від R -");
        double R = scanner.nextDouble();
        double pi = 3.14;
        double L = 2 * pi * R;
        double S = pi * R * R;

        System.out.println("Довжина кола (L): " + L);
        System.out.println("Площа кола (S): " + S);

        return S;
    }

    public static double integerNumbersTask(int k) {
        int number = k;
        System.out.println("////////////////////------2 lesson---------///////////////////////////////");
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int sum = firstDigit + secondDigit;
        int product = firstDigit * secondDigit;

        System.out.println("Сума цифр: " + sum);
        System.out.println("Добуток цифр: " + product);

        return product;
    }

    public static boolean booleanTask() {
        System.out.println("////////////////////------3 lesson---------///////////////////////////////");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Від А -");
        int A = scanner.nextInt();
        System.out.print("Від B -");
        int B = scanner.nextInt();
        System.out.print("Від C -");
        int C = scanner.nextInt();

        boolean isBetween = (A < B) && (B < C);

        if (isBetween) {
            System.out.println(" B знаходиться між числами A і C");
        } else {
            System.out.println(" B не знаходиться між числами A і C");
        }

        return isBetween;
    }

    public static int ifTask(int firstNumber, int secondNumber) {
        int[] numbers = {firstNumber, secondNumber};
        int minIndex = (numbers[0] < numbers[1]) ? 0 : 1;
        return minIndex;
    }

    public static double switchUnits(int unit, double mass) {
        double massInKilograms;

        switch (unit) {
            case 1:
                massInKilograms = mass;
                break;
            case 2:
                massInKilograms = mass / 1000.0;
                break;
            case 3:
                massInKilograms = mass * 1.0;
                break;
            case 4:
                massInKilograms = mass * 1000.0;
                break;
            case 5:
                massInKilograms = mass * 100.0;
                break;
            default:
                System.out.println("Неправильний номер одиниці маси.");
                return -1.0;
        }
        return massInKilograms;
    }

    public static int loopWithParameter(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }
        return sum;
    }

    public static int loopWithCondition(int N) {
        int K = 1;
        while (K * K <= N) {
            K++;
        }
        return K;
    }

    public static int[] sequences(int N) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введіть число #" + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        int sumOfRoundedValues = 0;
        int[] roundedValues = new int[N];
        for (int i = 0; i < N; i++) {
            int roundedValue = (int) Math.round(numbers[i]);
            roundedValues[i] = roundedValue;
            sumOfRoundedValues += roundedValue;
        }

        System.out.println("Сума заокруглених значень: " + sumOfRoundedValues);
        return roundedValues;
    }

    public static void proceduresAndFunctions() {
        System.out.println("////////////////////------10 lesson---------///////////////////////////////");
        int[] numbers = {12, 67, 54, 9, 11111};

        System.out.println("Оригінальні числа:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Числа зі зміненим порядком цифр:");
        for (int i = 0; i < numbers.length; i++) {
            int reversed = InvertDigits(numbers[i]);
            System.out.println(reversed);
        }
    }

    public static int InvertDigits(int D) {
        int reversed = 0;

        while (D != 0) {
            int digit = D % 10;
            reversed = reversed * 10 + digit;
            D /= 10;
        }

        return reversed;
    }

    public static int[] minimumsAndMaximums(int[] numbers) {
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                maxIndex = i;
            }

            if (numbers[i] <= minNumber) {
                minNumber = numbers[i];
                minIndex = i;
            }
        }

        int[] result = {maxIndex + 1, minIndex + 1};
        return result;
    }

    public static int[] oneDimensionalArrays(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        return reversedArray;
    }

    public static int[] twoDimensionalArrays(int[][] matrix, int K) {
        if (K >= 1 && K <= matrix.length) {
            int[] row = matrix[K - 1];
            return row;
        } else {
            return null;
        }
    }

    public static int[] charactersAndLines(String text) {
        if (!text.isEmpty()) {
            char firstChar = text.charAt(0);
            char lastChar = text.charAt(text.length() - 1);

            int firstCharCode = (int) firstChar;
            int lastCharCode = (int) lastChar;

            int[] charCodes = {firstCharCode, lastCharCode};
            return charCodes;
        } else {
            return null;
        }
    }

    public static int[] binaryFiles(String filePath) {
        try {
            File file = new File(filePath);

            Scanner scanner = new Scanner(file);

            int[] numbers = new int[4];

            int count = 0;

            while (scanner.hasNextInt() && count < 4) {
                numbers[count] = scanner.nextInt();
                count++;
            }

            scanner.close();

            if (count >= 4) {
                int[] result = {numbers[0], numbers[1], numbers[2], numbers[3]};
                return result;
            } else {
                return null;
            }
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public static boolean textFiles(String filePath, String textToAdd) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(textToAdd);
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();

            return true;
        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
            return false;
        }
    }

    public static void compositeDataTypesInProceduresAndFunctions() {
        System.out.println("////////////////////------17 lesson---------///////////////////////////////");
        int N = 10;
        double[] A = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0}; // Початковий масив

        System.out.println("Початковий масив:");
        printArray(A);

        for (int i = 0; i < 5; i++) {
            smooth3(A, N);
            System.out.println("Після згладжування #" + (i + 1) + ":");
            printArray(A);
        }
    }

    public static void smooth3(double[] A, int N) {
        double[] temp = new double[N];

        for (int i = 0; i < N; i++) {
            double left = (i > 0) ? A[i - 1] : A[i];
            double right = (i < N - 1) ? A[i + 1] : A[i];
            temp[i] = (left + A[i] + right) / 3.0;
        }

        for (int i = 0; i < N; i++) {
            A[i] = temp[i];
        }
    }

    public static void printArray(@org.jetbrains.annotations.NotNull double[] A) {
        for (double element : A) {
            System.out.print(element + " ");
        }
    }

    public static int recursion() {
        System.out.println("////////////////////------18 lesson---------///////////////////////////////");
        int N = 5;
        int K = 2;

        int result = Combin2(N, K);
        return result;
    }

    public static int Combin2(int N, int K) {
        if (K == 0 || K == N) {
            return 1;
        }

        return Combin2(N - 1, K) + Combin2(N - 1, K - 1);
    }
}

