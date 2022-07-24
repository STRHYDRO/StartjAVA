package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    //Калькулятор;
    private double num1;
    private double num2;
    private char sign;
    private double result = 0;
    private String exp = "";
    String[] expression = new String[3];
//    String[] expression = getExp().split("");

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double getResult() {
        return result;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

//    public void exp() {    Создание метода разделения строки и записи в массив
//        if(!getExp.isBlank()) { // Если в выражении нет пробелов, то определи когда закончится число, добавь пробел, определи когда начнется число и добавь  до этого пробел
    // Разделить введенную строку на элементы с помощью String Split
    //Записать элементы в массив
//    }
    //  Создание метода арифм. операций с помощью массива
    // Вызов массива
    // преобразование 1 и 3 элемента в int, 2 элемента в char
    // 1 элемент присвоен num 1, 3 - num2, 2 элемент в sign

//    }

//    public void exp() {
//            int num1 = Integer.parseInt(expression[1].trim());
//            System.out.println(num1);
//    }


//    public void calculate() {
//        if ((getNum1() > 0 && getNum1() % 1 == 0) && (getNum2() > 0 && getNum2() % 1 == 0)) {
//            switch (sign) {
//                case '+':
//                    result = num1 + num2;
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    break;
//                case '/':
//                    result = num1 / num2;
//                    break;
//                case '^':
//                    result = 1;
//                    for (double i = 1; i <= num2; i++) {
//                        result *= num1;
//                    }
//                    break;
//                case '%':
//                    result = num1 % num2;
//                    break;
//            }
//        } else {
//            System.out.println("\nЧисла отрицательные или не целые, для расчета введите целые положительные числа");
//        }
//    }
}                      
