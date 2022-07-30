package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int length = intArr.length;
        printArr(intArr);
        for (int i = 0; i < length / 2; i++) {
            int buffer = intArr[i];
            intArr[i] = intArr[length - 1 - i];
            intArr[length - 1 - i] = buffer;
        }
        System.out.println();
        printArr(intArr);

        System.out.println("\n\nВывод произведения элементов массива");
        int[] numArr = new int[10];
        length = numArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= numArr[i];
            System.out.printf("%d%s", i,(numArr[i] < length - 2) ? " * " : " = ");
        }
        System.out.print(result);
        System.out.printf("\nnumArr[0] = %d, numArr[9] = %d", numArr[0], numArr[9]);

        System.out.println("\n\nУдаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        double midpoint = doubleArr[length / 2];
        int counter = 0;
        System.out.println("Исходный массив");
        for (int i = 0; i < length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.2f  ", doubleArr[i]);
        }
        System.out.println("\nИзмененный массив");
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > midpoint) {
                doubleArr[i] = 0;
                counter++;
            }
            System.out.printf(doubleArr[i] == 0 ? "%.0f   " : "%.2f   ", doubleArr[i]);
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
                boolean unique = false;
                int number = random.nextInt(41) + 60;
                for (int j = 0; j < i; j++) {
                    if (number == uniqueArr[j]) {
                        unique = true;
                        break;
                    }
                }
                if (!unique) {
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
        String[] stringsArr = {" ", "AA", " ", " ", "BBB", "C", " ", "DDDD"};
        int len = 0;
        for (String shift : stringsArr) {
            if (!shift.isBlank()) {
                len++;
            }
            System.out.print(shift);
        }
        String[] stringsArrCopy = new String[len];
        length = stringsArr.length;
        len = 1;
        int srcPos = 0;
        int destPos = 0;
        for (int i = 0; i < length; i++) {
            if (!stringsArr[i].isBlank()) {
                srcPos = i;
                if (i < length - 1) {
                    for (int j = i + 1; j < length; j++) {
                        if (stringsArr[j].isBlank()) {
                            break;
                        }
                        len++;
                    }
                }
                System.arraycopy(stringsArr, srcPos, stringsArrCopy, destPos, len);
                destPos += len;
                i += len;
                len = 1;
            }
        }
        System.out.println();
        for (String shiftCopy : stringsArrCopy) {
            System.out.print(shiftCopy);
        }
    }

    private static void printArr(int[] intArr) {
        for (int num : intArr) {
            System.out.printf("% d", num);
        }
    }
}
