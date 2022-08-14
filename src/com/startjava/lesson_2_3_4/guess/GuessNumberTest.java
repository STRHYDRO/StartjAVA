//package com.startjava.lesson_2_3_4.guess;
//
//import java.util.Scanner;
//
//public class GuessNumberTest {
//
//    public static void main(String[] args) {
//        System.out.println("Игра: угадай число_3\n");
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите имя первого игрока");
//        Player player1 = new Player(scan.nextLine());
//        System.out.println("Введите имя второго игрока");
//        Player player2 = new Player(scan.nextLine());
//        GuessNumber game = new GuessNumber(player1, player2);
//        String choice = "yes";
//        do {
//            if ("yes".equals(choice)) {
//                game.play();
//            }
//            System.out.println("\nХотите продолжить игру? [yes/no]:");
//            choice = scan.nextLine();
//        } while(!"no".equals(choice));
//    }
//}