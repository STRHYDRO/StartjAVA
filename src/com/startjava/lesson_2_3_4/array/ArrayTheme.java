package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int length = intArr.length;
        for (int num : intArr) {
            System.out.printf("% d", num);
        }
        for (int i = 0; i < length / 2; i++) {
            int buffer = intArr[i];
            intArr[i] = intArr[length - 1 - i];
            intArr[length - 1 - i] = buffer;
        }
        System.out.println();
        for (int num : intArr) {
            System.out.printf("% d", num);
        }

        System.out.println("\n\nВывод произведения элементов массива");
        int[] numArr = new int[10];
        length = numArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= numArr[i];
            String symbol = (numArr[i] < length - 2) ? " * " : " = ";
            System.out.printf("%d%s", i, symbol);
        }
        System.out.print(result);
        System.out.printf("\nnumArr[0] = %d, numArr[9] = %d", numArr[0], numArr[9]);

        System.out.println("\n\nУдаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив");
        for (double fractional : doubleArr) {
            System.out.printf("%.2f  ", fractional);
        }
        int midpoint = length / 2;
        System.out.println("\nИзмененный массив");
        int counter = 0;
        for (int j = 0; j < length; j++) {
            if (doubleArr[j] > doubleArr[midpoint]) {
                doubleArr[j] = 0;
                counter++;
            }
            String format = doubleArr[j] == 0 ? "%.0f   " : "%.2f   ";
            System.out.printf(format, doubleArr[j]);
        }
        System.out.print("\nКоличество обнуленных ячеек = " + counter);

        System.out.println("\n\nВывод элементов массива лесенкой в обратном порядке");
        char[] alphabetArr = new char[26];
        length = alphabetArr.length;
        for (int i = 0; i < length; i++) {
            alphabetArr[i] = (char) (i + 65);
        }
        for (int i = 0; i <= length; i++) {
            int k = length;
            for (int j = 0; j < i; j++) {
                k--;
                System.out.print(alphabetArr[k]);
            }
            System.out.println();
        }

        System.out.println("\n\nГенерация уникальных чисел");
        Random random = new Random();
        int[] uniqueArr = new int[30];
        length = uniqueArr.length;
        for (int i = 0; i < length; i++) {
            while (true) {
                boolean label = false;
                int number = random.nextInt(41) + 60;
                for (int j = 0; j < i; j++) {
                    if (number == uniqueArr[j]) {
                        label = true;
                        break;
                    }
                }
                if (!label) {
                    uniqueArr[i] = number;
                    break;
                }
            }
        }
        counter = 0;
        for (int j = 0; j < length; j++) {
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
        int len = 0;
        for (String shift:shiftsArr) {
            if (!shift.isBlank()) {
                len++;
            }
            System.out.print(shift);
        }
        String[] shiftsArrCopy = new String[len];
        length = shiftsArr.length;
        len = 1;
        int srcPos = 0;
        int destPos = 0;
        for (int i = 0; i < length; i++) {
            if (!shiftsArr[i].isBlank()) {
                srcPos = i;
                if (i < length - 1) {
                    for (int j = i + 1; j < length; j++) {
                        if (shiftsArr[j].isBlank()) {
                            break;
                        }
                        len++;
                    }
                }
                System.arraycopy(shiftsArr, srcPos, shiftsArrCopy, destPos, len);
                destPos += len;
                i += len;
                len = 1;
            }
        }
        System.out.println();
        for (String shiftCopy:shiftsArrCopy) {
            System.out.print(shiftCopy);
        }
    }
}
