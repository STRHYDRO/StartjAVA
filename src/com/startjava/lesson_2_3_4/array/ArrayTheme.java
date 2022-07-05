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
        for (double fractional:fractionals) {
            System.out.printf("%.2f  ", fractional);
        }


//      Вывод элементов массива лесенкой в обратном порядке;
        System.out.println("\nВывод элементов массива лесенкой в обратном порядке");




//      Генерация уникальных чисел;
        System.out.println("\nГенерация уникальных чисел");




//      Сдвиг элементов массива;
        System.out.println("\nСдвиг элементов массива");
    }
}
