package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        randomNumber = 1 + (int) (Math.random() * 100);
        do {
            changePlayer();
            int num = currentPlayer.getEnteredNum();
            System.out.println("У каждого игрока по 10 попыток");
            System.out.printf("Игрок %s введите целое число от 1 до 100\n",currentPlayer.getName());
            currentPlayer.addNums(scan.nextInt());
            scan.nextLine();
            if (num > 0) {
                if (num == randomNumber) {
                    System.out.printf("Игрок : %s угадал число %d с %d попытки",currentPlayer.getName(), randomNumber, currentPlayer.attempt);
                    System.out.print(Arrays.toString(player1.inpitArr()));
                    System.out.println(Arrays.toString(player2.inpitArr()));
                    break;
                } else if (num < randomNumber) {
                    System.out.printf("число %s меньше того, что загадал компьютер\n", num);
                } else {
                    System.out.printf("число %s больше того, что загадал компьютер\n", num);
                }
            } else {
                System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
            }
        } while(true);
    }

    private void changePlayer() {
       currentPlayer = player1 ==currentPlayer ? player2 : player1;
    }
}

