package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator test\n");
        String choice = "yes";
        do {
            if ("yes".equals(choice)) {
                System.out.println("Введите первое число, операцию и второе число");
                String calculate = calc.calculate(scanner.nextLine());
                System.out.println(calculate);
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no]:");
            choice = scanner.nextLine();     
        } while (!"no".equals(choice));
    } 
}


