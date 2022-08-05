package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public double calculate(String expression) {
        String[] partsExpression = new String[3];
        partsExpression = expression.split("[\\s]");
        double num1 = Integer.parseInt(partsExpression[0]);
        double num2 = Integer.parseInt(partsExpression[2]);
        char sign = partsExpression[1].charAt(0);
        if ((num1 > 0 && num1 % 1 == 0) && (num2 > 0 && num2 % 1 == 0)) {
            switch (sign) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    return num1 / num2;
                case '^':
                    return Math.pow(num1, num2);
                case '%':
                    return Math.IEEEremainder(num1, num2);
            }
        } else {
            System.out.println("\nЧисла отрицательные или не целые, для расчета введите целые положительные числа");
        }

        return 0;
    }
}

