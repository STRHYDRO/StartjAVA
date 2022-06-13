import java.util.Scanner;
public class GuessNumber {

    Player player = new Player();
    Scanner scanner = new Scanner(System.in);
    int gameNum;

    public void game() {
        System.out.printf("Игрок %s введите целое число от 0 до 100" + player.getNamePlayer());
        player.setNumPlayer(scanner.nextInt());
        gameNum = player.getNumPlayer();
    }
    
    // int randomNumber = (int) (Math.random() * (100 + 1));
    // if (numPlayer() > 0 && numPlayer2() % 1 == 0) {
    //     if ((numPlayer || numPlayer2) == randomNumber) {
    //         if (numPlayer == randomNumber) {
    //             System.out.println("Победил игрок " + player);
    //             } else {
    //                 System.out.println("Победил игрок " + player);
    //         }
    //         break;      
    //     } else if ((numPlayer || numPlayer2) < targetNumber) {
    //         System.out.println("число " + randomNumber + " меньше того, что загадал компьютер");
    //     } else {
    //         System.out.println("число " + randomNumber + " больше того, что загадал компьютер");
    //     }    
    // } else { 
    //     System.out.println("Вы ввели не подходящее число, вводите только целые положителные числа");
    // }
}

 
