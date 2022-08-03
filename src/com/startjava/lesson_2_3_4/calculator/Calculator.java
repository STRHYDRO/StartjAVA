package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    private double num1;
    private double num2;
    private char sign;
    private double result;
    private String[] expressionArr = new String[3];

    public String calculate(String expression) {

        expressionArr =expression.split("[\\s]");
        num1 = Integer.parseInt(expressionArr[0]);
        num2 = Integer.parseInt(expressionArr[2]);
        sign = expressionArr[1].charAt(0);
        if ((num1 > 0 && num1 % 1 == 0) && (num2 > 0 && num2 % 1 == 0)) {
            switch (sign) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    break;
                case '%':
                    result = Math.IEEEremainder(num1, num2);
                    break;
            }
        } else {
            System.out.println("\nЧисла отрицательные или не целые, для расчета введите целые положительные числа");
        }
        String stringResult = " = " + Double.toString(result);
        expression = expression.concat(stringResult);
        return expression;
    }
}

