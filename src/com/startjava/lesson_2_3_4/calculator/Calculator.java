package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int num1;
    private static int num2;
    private static char sign;

    public static double calculate(String expression) {
        checkExpression(expression);

        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> (double) num1 / num2;
            case '^' -> Math.pow(num1, num2);
            case '%' -> Math.IEEEremainder(num1, num2);
            default -> {
                throw new IllegalArgumentException("Неверный знак операции");
            }
        };
    }

    private static void checkExpression(String expression) {
        try {
            String[] partsExpression = expression.split("[\\s]");
            num1 = Integer.parseInt(partsExpression[0]);
            num2 = Integer.parseInt(partsExpression[2]);
            if (!(num1 > 0 && num2 > 0)) {
                throw new IllegalArgumentException("Числа отрицательные или не целые");
            }
            sign = partsExpression[1].charAt(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Неверное число элементов массива'", e);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Вы ввели не числа", e);
        }
    }
}
