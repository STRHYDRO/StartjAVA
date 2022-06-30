package com.startjava.lesson1.finish;

public class Calculator {

    public static void main(String[] args) {
        //Калькулятор;
        System.out.println("\nКалькулятор");
        double num1 = 10;
        double num2 = 8;
        char sign = '%';
        double result = 0;
        if ((num1 > 0 && num1 % 1 == 0) && (num2 > 0 && num2 % 1 == 0)) {
            if (sign == '+') {
                result = num1 + num2;
            } else if (sign == '-') {
                result = num1 - num2;
            } else if (sign == '*') {
                result = num1 * num2;
            } else if (sign == '/') {
                result = num1 / num2;
            } else if (sign == '^') {
                result = 1;
                for (double i = 1; i <= num2; i++) {
                    result *= num1;
            }
            } else if (sign == '%') {
                result = num1 % num2;
            }
            if (result % 1 == 0) {
                System.out.printf("\n %.0f %c %.0f = %.0f", num1, sign, num2, result);
            } else {
                System.out.printf("\n %.0f %c %.0f = %.2f", num1, sign, num2, result);
            }  
        } else {
            System.out.println("\nЧисла отрицательные или не целые, для расчета введите целые положительные числа");
        }
    }
}