package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
//      Риверс значений массива;
        System.out.println("Риверс значений массива");
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
        char myltiply = '*';
        int[] nums = new int[9];
        for (int i = 0; i <nums.length; i++){
            nums[i] = i + 1;
        }
        for (int num:nums) {
            System.out.printf("% d", num);
        }
    }
}
