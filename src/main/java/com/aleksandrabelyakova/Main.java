package com.aleksandrabelyakova;

public class Main {

    public static void main(String[] args) {
//        printThreeWords();
//        checkSumSign();
//        printColor();
//        compareNumbers();
//        System.out.println(isSumInRage(9, 11));
//        isNumberPositive(-13);
//        System.out.println(isNumberNegative(-13));
//        printStringNTimes("ЗАДАНИЕ8", 8);
//        System.out.println(isLeapYear(1600));
//        revertArray();
//        fillOutArray();
//        task12();
//        createTwoDimensionalArray();
//        for (int i : createArray(5, 1)) {
//            System.out.print(i + " ");
//        }
    }

    //  ЗАДАНИЕ 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //  ЗАДАНИЕ 2
    public static void checkSumSign() {
        int a = 5, b = 9;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //  ЗАДАНИЕ 3
    public static void printColor() {
        int value = 110;

        if (value > 100) {
            System.out.println("Зеленый");
        } else if (value > 0) {
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }
    }

    //  ЗАДАНИЕ 4
    public static void compareNumbers() {
        int a = 5, b = 7;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //    ЗАДАНИЕ 5
    private static boolean isSumInRage(int num1, int num2) {
        int sum = num1 + num2;

        return sum >= 10 && sum <= 20;
    }

    //    ЗАДАНИЕ 6
    private static void isNumberPositive(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //    ЗАДАНИЕ 7
    private static boolean isNumberNegative(int number) {
        return number < 0;
    }

    //    ЗАДАНИЕ 8
    public static void printStringNTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    //    ЗАДАНИЕ 9
    public static boolean isLeapYear (int year) {
        boolean divideOnFour = year % 4 == 0;
        boolean notDivideOnHundred = year % 100 != 0;
        boolean divideOnFourHundred = year % 400 == 0;
        return (divideOnFour && notDivideOnHundred) || divideOnFourHundred;
    }

    //    ЗАДАНИЕ 10
    public static void revertArray() {
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0 };

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
                continue;
            }
            if (array[i] == 0) {
                array[i] = 1;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //   ЗАДАНИЕ 11
    public static void fillOutArray() {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    //   ЗАДАНИЕ 12
    public static void task12() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //    ЗАДАНИЕ 13
    private static void createTwoDimensionalArray() {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (i == j || array.length - 1 - i == j + 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //    ЗАДАНИЕ 14
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;
    }
}