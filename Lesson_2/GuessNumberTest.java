import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        //Игра: угадай число_2;
        System.out.println("Игра: угадай число_2\n");
        Scanner scan = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        Player play = new Player();
        System.out.println("Введите имя первого игрока");
        Player player = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.nextLine());
        guessNumber.game();
        // System.out.printf("Игрок %s введите целое число от 0 до 100\n", player);
        // play.setNumPlayer1(scan.nextInt());
        System.out.printf("Игрок %s введите целое число от 0 до 100\n", player);
        play.setNumPlayer2(scan.nextInt());
   }
}