package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] partsExpression = expression.split("[\\s]");
        int num1 = Integer.parseInt(partsExpression[0]);
        int num2 = Integer.parseInt(partsExpression[2]);
        char sign = partsExpression[1].charAt(0);
        boolean check = false;

        if (check == true) {
            return switch (sign) {
                case '+' -> Math.addExact(num1, num2);
                case '-' -> Math.subtractExact(num1, num2);
                case '*' -> Math.multiplyExact(num1, num2);
                case '/' -> (double) num1 / num2;
                case '^' -> Math.pow(num1, num2);
                case '%' -> Math.IEEEremainder(num1, num2);
                default -> 0;
            };
        }
        return 0;
    }

    private static boolean check(int num1, int num2, boolean check) {
        if ((num1 > 0 && num1 % 1 == 0) && (num2 > 0 && num2 % 1 == 0)) {
            return check = true;
        } else {
            System.out.println("\nЧисла отрицательные или не целые, для расчета введите целые положительные числа");
            return check = false;
        }
    }
}

