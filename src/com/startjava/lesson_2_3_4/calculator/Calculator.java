package com.startjava.lesson_2_3_4.calculator;

import java.math.*;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    private double num1;
    private double num2;
    private char sign;
    private double result = 0;
    private String data;
    private String[] parentArr = new String[2];
    private String[] expressionArr = new String[3];
    private Scanner scanner = new Scanner(System.in);

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public char getSign() {
        return sign;
    }

    public double getResult() {
        return result;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void calculate() {
        System.out.println("Введите первое число, операцию и второе число");
        inpit();
        expression();
        changeMeaning();
        if ((getNum1() > 0 && getNum1() % 1 == 0) && (getNum2() > 0 && getNum2() % 1 == 0)) {
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
        format();
    }

    private void inpit() {
        setData(scanner.nextLine());
    }

    private void expression() {
        parentArr = getData().split("[\\s\\+\\-\\*\\/\\^\\%]+");
        for (int i = 0; i < parentArr.length; i++) {
            expressionArr[i] = parentArr[i];
        }
        expressionArr[2] = getData().replaceAll("\\d\\s*", "");
    }

    private void changeMeaning() {
        num1 = Integer.parseInt(expressionArr[0]);
        num2 = Integer.parseInt(expressionArr[1]);
        sign = expressionArr[2].charAt(0);
    }

    private void format() {
        String format = getResult() % 1 == 0 ? "%.0f %c %.0f = %.0f" : "%.0f %c %.0f = %.2f";
        System.out.printf(format, getNum1(), getSign(), getNum2(), getResult());
    }
}
