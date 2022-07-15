package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
//      Реверс значений массива;
        System.out.println("Реверс значений массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int num : numbers) {
            System.out.printf("% d", num);
        }
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int reverse = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = reverse;
            start++;
            end--;
        }
        System.out.print("\n");
        for (int num : numbers) {
            System.out.printf("% d", num);
        }

//      Вывод произведения элементов массива;
        System.out.println("\n\nВывод произведения элементов массива");
        int[] numbs = new int[10];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] += i;
        }
        int result = 1;
        for (int i = 1; i < numbs.length - 1; i++) {
            result *= numbs[i];
            char symbol = (numbs[i] < numbs.length - 2) ? '*' : '=';
            System.out.printf("%d%c", i, symbol);
        }
        System.out.print(result);
        System.out.printf("\nnumbs[0] = %d, numbs[9] = %d", numbs[0], numbs[9]);

//      Удаление элементов массива;
        System.out.println("\n\nУдаление элементов массива");
        double[] fractionals = new double[15];
        for (int i = 0; i < fractionals.length; i++) {
            fractionals[i] = Math.random();
        }
        System.out.println("Исходный массив");
        for (double fractional : fractionals) {
            System.out.printf("%.2f  ", fractional);
        }
        int midpoint = fractionals.length / 2;
        System.out.println("\nИзмененный массив");
        for (int i = midpoint; i < fractionals.length; i++) {
            fractionals[i] = 0;
        }
        for (int j = 0; j < fractionals.length; j++) {
            String format = j < midpoint ? "%.2f  " : "%.0f     ";
            System.out.printf(format, fractionals[j]);
        }
        int difference = fractionals.length - midpoint;
        System.out.print("\nКоличество обнуленных ячеек = " + difference);

//      Вывод элементов массива лесенкой в обратном порядке;
        System.out.println("\n\nВывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        for (int i = alphabet.length - 1; i >= 0; i--) {
            alphabet[i] = (char) (90 - i);
        }
        for (int i = 0; i <= alphabet.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(alphabet[j]);
            }
                System.out.print("\n");

        }

//      Генерация уникальных чисел;
        System.out.println("\n\nГенерация уникальных чисел");
        Random random = new Random();
        int[] unique = new int[30];
        int counter = 0;
        for (int i = 0; i < unique.length; i++) {
            unique[i] = random.nextInt(40) + 60;
        }
        for (int i = 0; i < unique.length; i++) {
            for (int j = i + 1; j < unique.length; j++) {
                if (unique[i] == unique[j]) {
                    unique[i] = i + 1;
                }
            }
        }
        System.out.println();
        for (int j = 0; j < unique.length; j++) {
            counter++;
            if (counter == 11) {
                System.out.print("\n");
                counter = 1;
            }
            Arrays.sort(unique);
            System.out.printf("%4s", unique[j]);
        }

//      Сдвиг элементов массива;
        System.out.println("\n\nСдвиг элементов массива");
        String[] shifts = {" ", "AA", " ", " ", "BBB", "C", " ", "DDDD"};
        int indexLength = shifts.length;
        int[] indexPosition = new int[9];
        int i = -1;
        for (String shift:shifts) {
            i ++;
            if (shift.isBlank()) {
                indexLength--;
            } else if (!shift.isBlank() && i > 0) {
                indexPosition[i] += i;
            }
        }
//        int[] indexPosition = {1, 4, 5, 7};

        for (int num : indexPosition) {
            System.out.printf("% d", num);
        }
//        String[] shiftsCopy = new String[indexLength];
//        for(int i = 0; i < indexLength; i++){
//            System.arraycopy(shifts, indexPosition[i], shiftsCopy, i, 1);
//        }
//        System.out.print("\n");
//        for (String shiftCopy:shiftsCopy) {
//            System.out.print(shiftCopy);
//        }
    }
}
