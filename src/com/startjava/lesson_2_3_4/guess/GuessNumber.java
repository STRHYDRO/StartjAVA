package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private int maxAttempts = 10;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void play() {
        int randomNumber = 1 + (int) (Math.random() * 100);
        boolean playerWin = false;

        System.out.println("У каждого игрока по 10 попыток");
        while (currentPlayer.getAttempt() != maxAttempts && !playerWin) {
            System.out.printf("Игрок %s введите целое число от 1 до 100\n", currentPlayer.getName());
            int num = currentPlayer.addNum(scan.nextInt());

            if(checkIsPositive(num)) {
                if (num == randomNumber) {
                    System.out.printf("Победил игрок %s, угадав число %d с %d попытки\n",
                            currentPlayer.getName(), randomNumber, currentPlayer.getAttempt());
                    playerWin = true;
                } else {
                    String moreLess = num < randomNumber ? "меньше" : "больше";
                    System.out.printf("Число %d %s того что загадал компьютер\n", num, moreLess);
                    changePlayer();
                }
            }
        }
        showEnteredNums(player1);
        showEnteredNums(player2);
        currentPlayer.reset();
    }

    private void changePlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    private boolean checkIsPositive(int num) {
        changePlayer();
        if (currentPlayer.getEnteredNum() < 1) {
            System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
            return false;
        }
        return true;
    }

    private void showEnteredNums(Player currentPlayer) {
        System.out.print("Игрок " + currentPlayer.getName() + " назвал числа:" );
        for (int num : currentPlayer.getEnteredNums()) {
            System.out.print("  " + num);
        }
        System.out.println();
    }
}

