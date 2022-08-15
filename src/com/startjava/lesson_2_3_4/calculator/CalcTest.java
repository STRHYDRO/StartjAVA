package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator test\n");
        String choice = "yes";
        do {
            if ("yes".equals(choice)) {
                System.out.println("Введите первое число, операцию и второе число");
                Double result = calculate(scanner.nextLine());
                System.out.print(result);
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no]:");
            choice = scanner.nextLine();     
        } while (!"no".equals(choice));
    }

    static double calculate(String expression) {
        String[] partsExpression = expression.split("[\\s]");
        int num1 = Integer.parseInt(partsExpression[0]);
        int num2 = Integer.parseInt(partsExpression[2]);
        char sign = partsExpression[1].charAt(0);
        boolean check = false;
        double result = 0;
        
        check(num1, num2, check);
        if (check == true) {
            switch (sign) {
                case '+' -> result = Math.addExact(num1, num2);
                case '-' -> result = Math.subtractExact(num1, num2);
                case '*' -> result = Math.multiplyExact(num1, num2);
                case '/' -> result = (double) num1 / num2;
                case '^' -> result = Math.pow(num1, num2);
                case '%' -> result = Math.IEEEremainder(num1, num2);
            };
        } return result;
    }

    private static boolean check(int num1, int num2, boolean check) {
        if ((num1 > 0 && num1 % 1 == 0) && (num2 > 0 && num2 % 1 == 0)) {
            return true;
        } else {
            System.out.println("\nЧисла отрицательные или не целые, для расчета введите целые положительные числа");
            return false;
        }
    }
}



