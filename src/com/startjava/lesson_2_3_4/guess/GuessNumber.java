package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = currentPlayer;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void play() {
        randomNumber = 1 + (int) (Math.random() * 100);
        boolean check = false;

        System.out.println("У каждого игрока по 10 попыток");
        System.out.printf("Игрок %s введите целое число от 1 до 100\n", currentPlayer.getName());
        int num = currentPlayer.addNum(scan.nextInt());
        scan.nextLine();

        check(num, check);
        while (check == true) {
            String moreLess = num < randomNumber ? "меньше" : "больше";
            System.out.printf("Число %d %s того что загадал компьютер", num, moreLess);

            if (num == randomNumber) {
                System.out.printf("Игрок : %s угадал число %d с %d попытки\n", currentPlayer.getName(), randomNumber, currentPlayer.getAttempt());
                inpitNums(currentPlayer);
                break;
            }
            changePlayer();
            currentPlayer.reset();
        }
    }

    private void changePlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    private boolean check(int num, boolean check) {
        if (num > 0)  {
            check = true;
        } else {
            check = false;
            System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
        }
        return check;
    }

    private void inpitNums(Player currentPlayer) {
        System.out.print("Игрок " + currentPlayer + " ввел числа: ");
        for (int nums : currentPlayer.getEnteredNums()) {
            System.out.print("  " + nums);
        }
    }
}

