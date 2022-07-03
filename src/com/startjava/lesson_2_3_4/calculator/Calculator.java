package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    //Калькулятор;
    private double num1;
    private double num2;
    private char sign;
    private double result = 0;

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
       
    public void calculate() {
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
                    result = 1;
                    for (double i = 1; i <= num2; i++) {
                        result *= num1;
                    }
                    break;
                case '%': 
                    result = num1 % num2;
                    break;
            }  
        } else {
            System.out.println("\nЧисла отрицательные или не целые, для расчета введите целые положительные числа");
        }
    }
}                      
