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
        //char symbol;
        int[] nums = new int[10];
        for (int i = 0; i <nums.length; i++){
            nums[i] += i;
        }
        for (int num:nums) {
//            int myltiply;
//            for (int i = 0; i < nums.length; i++) {
//            myltiply *= nums;
//            }
            char symbol = (num < nums.length - 1) ? '*' : '=';
            System.out.printf("%d%c%d", num, symbol, );
//            System.out.print();
        }

//      Удаление элементов массива;
        System.out.println("Удаление элементов массива");



//      Вывод элементов массива лесенкой в обратном порядке;
        System.out.println("Вывод элементов массива лесенкой в обратном порядке");




//      Генерация уникальных чисел;
        System.out.println("Генерация уникальных чисел");




//      Сдвиг элементов массива;
        System.out.println("Сдвиг элементов массива");
    }
}
