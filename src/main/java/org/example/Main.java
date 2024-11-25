package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание1
        printThreeWords();
        System.out.println();

        //Задание2
        checkSumSign();
        System.out.println();

        //Задание3
        printColor();
        System.out.println();

        //Задание4
        compareNumbers();
        System.out.println();

        //Задание5
        boolean result = isInRange(99,4);
        System.out.println(result);
        System.out.println();

        //Задание6
        positiveOrNegative(25);
        System.out.println();

        //Задание7
        boolean result2 = isNegative(-25);
        System.out.println(result2);
        System.out.println();

        //Задание8
        printNTimes("Hello world", 2);
        System.out.println();

        //Задание9
        boolean result3 = isLeapYear(2028);
        System.out.println(result3);
        System.out.println();

        //Задание10
        invertArray();
        System.out.println();

        //Задание11
        fillArray();
        System.out.println();

        //Задание12
        arrayLessThan6();
        System.out.println();

        //Задание13
        diagonalArray();
        System.out.println();

        //Задание14
        int[] result4 = initArray(4, 3);
        System.out.println(Arrays.toString(result4));




    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 256;
        int b = 526;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 126;
        int b = 300;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

    public static boolean isInRange(int a, int b) {
        boolean result;
        if (a + b >= 10 && a + b <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printNTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 != 0 && year % 4 == 0) {
           return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void invertArray() {
        int[] array = {0, 1, 1, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayLessThan6() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void diagonalArray() {
        int[][] array = new int[3][3];
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (i + j == 2) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static int[] initArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}