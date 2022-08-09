package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private Player player1;
    private Player player2;
    private Player currName;
    private int counter = 0;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {

        randomNumber = (int) (Math.random() * (100 + 1));
        do {
            changePlayer();
//            int num = currName.getEnteredNums();
            System.out.println("У каждого игрока по 10 попыток");
            System.out.printf("Игрок %s введите целое число от 0 до 100\n", currName.getName());
            currName.setEnteredNums(scan.nextInt());
            scan.nextLine();
            System.out.println(currName.getEnteredNums());
//            if (num > 0 && num % 1 == 0) {
//                if (num == randomNumber) {
//                    System.out.printf("Игрок : %s угадал число %d с %d попытки", currName.getName(), randomNumber, counter);
//                    break;
//                } else if (num < randomNumber) {
//                    System.out.printf("число %s меньше того, что загадал компьютер\n", num);
//                    counter++;
//                } else if (num > randomNumber) {
//                    System.out.printf("число %s больше того, что загадал компьютер\n", num);
//                    counter++;
//                }
//            } else {
//                System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
//            }
        } while(true);
    }

    private void changePlayer() {
        currName = player1 == currName ? player2 : player1;
    }
}

