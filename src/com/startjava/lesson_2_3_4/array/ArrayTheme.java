package com.startjava.lesson_2_3_4.array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
//      Реверс значений массива;
        System.out.println("Реверс значений массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int num:numbers) {
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
        for (int num:numbers) {
            System.out.printf("% d", num);
        }

//      Вывод произведения элементов массива;
        System.out.println("\nВывод произведения элементов массива");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++){
            nums[i] += i;
        }
        int result = 1;
        for (int num:nums) {
            if (!(num == 0 | num == 9)) { result *= num; }
            char symbol = (num < nums.length - 1) ? '*' : '=';
                System.out.printf("%d%c", num, symbol);
        }
        System.out.print(result);
        System.out.printf("\nnums[0] = %d, nums[9] = %d", nums[0], nums[9]);

//      Удаление элементов массива;
        System.out.println("\nУдаление элементов массива");
        double[] fractionals = new double[15];
        for (int i = 0; i < fractionals.length; i++) {
            fractionals[i] = Math.random();
        }
        System.out.println("Исходный массив");
        for (double fractional:fractionals) {
            System.out.printf("%.2f  ", fractional);
        }
        int midpoint = fractionals.length / 2;
        System.out.println("\nИзмененный массив");
        for (int i = midpoint; i < fractionals.length; i++) {
            fractionals[i] = 0;
        }
        for (double fractional:fractionals) {
            System.out.printf("%.2f  ", fractional);
        }
        int difference = fractionals.length - midpoint;
        System.out.print("\nКоличество обнуленных ячеек = " + difference);
        
//      Вывод элементов массива лесенкой в обратном порядке;
        System.out.println("\nВывод элементов массива лесенкой в обратном порядке");
        char[] alphabets = new char [26];
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = (char) (i + 65);
        }
        String stringAlphabet = new String(alphabets);
        System.out.print(stringAlphabet);







//      Генерация уникальных чисел;
        System.out.println("\nГенерация уникальных чисел");
        int[] unique = new int [30];
        for (int i = 0; i < unique.length; i++) {
            unique[i] = 60 + (int) (Math.random() * 100 ) ;

        }
        boolean uniqueSorted = false;
        int buffer;
        while(!uniqueSorted) {
            uniqueSorted = true;
            for (int i = unique.length; i >= 0; i--) {
                if(unique[i] > unique[i+ 1]){
                    uniqueSorted = false;
                    buffer = unique[i];
                    unique[i] = unique[i+1];
                    unique[i+1] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(unique));

//      Сдвиг элементов массива;
        System.out.println("\nСдвиг элементов массива");
        String[] shift =  {"", "AA", "", "", "BBB", "C", "", "DDDD"};
    }
}
