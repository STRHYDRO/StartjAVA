package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        for (int num : intArr) {
            System.out.printf("% d", num);
        }
        for (int i = 0; i < intArr.length / 2; i++) {
            int buffer = intArr[i];
            intArr[i] = intArr[intArr.length - 1 - i];
            intArr[intArr.length - 1 - i] = buffer;
        }

        System.out.println();;
        for (int num : intArr) {
            System.out.printf("% d", num);
        }

        System.out.println("\n\nВывод произведения элементов массива");
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < numArr.length - 1; i++) {
            result *= numArr[i];
            String symbol = (numArr[i] < numArr.length - 2) ? " * " : " = ";
            System.out.printf("%d%s", i, symbol);
        }
        System.out.print(result);
        System.out.printf("\nnumArr[0] = %d, numArr[9] = %d", numArr[0], numArr[9]);

        System.out.println("\n\nУдаление элементов массива");
        double[] doubleArr = new double[15];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив");
        for (double fractional : doubleArr) {
            System.out.printf("%.2f  ", fractional);
        }
        int midpoint = doubleArr.length / 2;
        System.out.println("\nИзмененный массив");
        if (doubleArr[midpoint] )
        for (int i = midpoint; i < doubleArr.length; i++) {
            doubleArr[i] = 0;
        }
        for (int j = 0; j < doubleArr.length; j++) {
            String format = j < midpoint ? "%.2f  " : "%.0f     ";
            System.out.printf(format, doubleArr[j]);
        }
        int difference = doubleArr.length - midpoint;
        System.out.print("\nКоличество обнуленных ячеек = " + difference);

        System.out.println("\n\nВывод элементов массива лесенкой в обратном порядке");
        char[] alphabetArr = new char[26];
        for (int i = alphabetArr.length - 1; i >= 0; i--) {
            alphabetArr[i] = (char) (90 - i);
        }
        for (int i = 0; i <= alphabetArr.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(alphabetArr[j]);
            }
            System.out.println();

        }

        System.out.println("\n\nГенерация уникальных чисел");
        Random random = new Random();
        int[] uniqueArr = new int[30];
        int counter = 0;
        for (int i = 0; i < uniqueArr.length; i++) {
            uniqueArr[i] = random.nextInt(40) + 60;
        }
        for (int i = 0; i < uniqueArr.length; i++) {
            for (int j = i + 1; j < uniqueArr.length; j++) {
                if (uniqueArr[i] == uniqueArr[j]) {
                    uniqueArr[i] = i + 1;
                }
            }
        }
        System.out.println();
        for (int j = 0; j < uniqueArr.length; j++) {
            counter++;
            if (counter == 11) {
                System.out.println();
                counter = 1;
            }
            Arrays.sort(uniqueArr);
            System.out.printf("%4s", uniqueArr[j]);
        }

        System.out.println("\n\nСдвиг элементов массива");
        String[] shiftsArr = {" ", "AA", " ", " ", "BBB", "C", " ", "DDDD"};
        int indexLength = shiftsArr.length;
        int[] indexPosition = new int[9];
        int i = -1;
        for (String shift:shiftsArr) {
            i ++;
            if (shift.isBlank()) {
                indexLength--;
            } else if (!shift.isBlank()) {
                indexPosition[i] = i;
            }
            System.out.print(shift);
        }
//        int[] indexPosition = {1, 4, 5, 7};
        System.out.println();
        for (int num : indexPosition) {
            System.out.printf("% d", num);
        }
//        String[] shiftsArrCopy = new String[indexLength];
//        for(int i = 0; i < indexLength; i++){
//            System.arraycopy(shiftsArr, indexPosition[i], shiftsArrCopy, i, 1);
//        }
//        System.out.println();
//        for (String shiftCopy:shiftsArrCopy) {
//            System.out.print(shiftCopy);
//        }
    }
}
