package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private int maxAttempts = 10;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private boolean check;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void play() {
        int randomNumber = 1 + (int) (Math.random() * 100);


        System.out.println("У каждого игрока по 10 попыток");
        while (currentPlayer.getAttempt() != maxAttempts) {
            System.out.printf("Игрок %s введите целое число от 1 до 100\n", currentPlayer.getName());
            int num = currentPlayer.addNum(scan.nextInt());

            check(num);

            if (num == randomNumber && check == true) {
                System. out.printf("Победил игрок %s, угадав число %d с %d попытки\n", currentPlayer.getName(), randomNumber,currentPlayer.getAttempt());
                break;
            } else {
                String moreLess = num < randomNumber ? "меньше" : "больше";
                System.out.printf("Число %d %s того что загадал компьютер", num, moreLess);
                System.out.println();
            }
            changePlayer();
        }
        System.out.print("Игрок " + player1.getName() + " назвал числа: " );
        inpitNums(player1);
        System.out.print("\nИгрок " + player2.getName() + " назвал числа: ");
        inpitNums(player2);
    }

    private void changePlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    private boolean check(int num) {
        if (currentPlayer.getEnteredNum() > 0)  {
             return check = true;
        } else {
            System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
            return check = false;
        }
    }

    private void inpitNums(Player currentPlayer) {
        for (int nums : currentPlayer.getEnteredNums()) {
            System.out.print("  " + nums);
        }
    }
}

