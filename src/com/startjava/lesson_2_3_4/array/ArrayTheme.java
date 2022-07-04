package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
//      Реверс значений массива;
        System.out.println("Реверс значений массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int num:numbers) {
            System.out.printf("% d", num);
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("% d", numbers[i]);
        }

//      Вывод произведения элементов массива;
        System.out.println("\nВывод произведения элементов массива");
        char symbol;
        int[] nums = new int[10];
        for (int i = 0; i <nums.length; i++){
            nums[i] += i;
        }
        for (int num:nums) {
            if (num < 9) {
                symbol = '*';
            } else {
                symbol = '=';
            }
//            num <= 8 ? symbol = '*' : symbol = '=';
            System.out.printf("%d%c", num, symbol);
//            System.out.print();
        }
    }
}
