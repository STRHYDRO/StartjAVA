package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String expression) {
        inpit();
        if (check(num1, num2)) {
            switch (sign) {
                case '+' -> { return Math.addExact(num1, num2); }
                case '-' -> { return Math.subtractExact(num1, num2); }
                case '*' -> { return Math.multiplyExact(num1, num2); }
                case '/' -> { return (double) num1 / num2; }
                case '^' -> { return Math.pow(num1, num2); }
                case '%' -> { return Math.IEEEremainder(num1, num2); }
            }
        } else {
            System.out.println("\nЧисла отрицательные или не целые, для расчета введите целые положительные числа");
        }
        return 0;
    }

    private static boolean check(int num1, int num2) {
        return (num1 > 0 && num1 % 1 == 0) && (num2 > 0 && num2 % 1 == 0);
    }

    public double inpit(String expression) {
        String[] partsExpression = expression.split("[\\s]");
        int num1 = Integer.parseInt(partsExpression[0]);
        int num2 = Integer.parseInt(partsExpression[2]);
        char sign = partsExpression[1].charAt(0);
        

    }
}

