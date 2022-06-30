package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
     
    Scanner scan = new Scanner(System.in); 
    private int randomNumber;
    private Player player1;
    private Player player2;
    private Player currName;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        randomNumber = (int) (Math.random() * (100 + 1));
        do {
            changePlayer();    
            System.out.printf("Игрок %s введите целое число от 0 до 100\n", currName.getName());
            currName.setNum(scan.nextInt());
            scan.nextLine();
            if (currName.getNum() > 0 && currName.getNum() % 1 == 0) {
                if (currName.getNum() == randomNumber) {
                    System.out.printf("Победил игрок : %s", currName.getName());
                    break;     
                } else if (currName.getNum() < randomNumber) {
                    System.out.printf("число %s меньше того, что загадал компьютер\n", currName.getNum()); 
                } else if (currName.getNum() > randomNumber) {
                    System.out.printf("число %s больше того, что загадал компьютер\n", currName.getNum());
                }
            } else {        
                System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
            }
        } while(true);        
    }

    private void changePlayer() {
        currName = player1 == currName ? player2 : player1; 
    } 
}

