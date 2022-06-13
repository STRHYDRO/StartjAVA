import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        //Игра: угадай число_2;
        System.out.println("Игра: угадай число_2\n");
        GuessNumber GuessNumber = new GuessNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player player = new Player(scanner.nextLine());
        System.out.println(player);
        
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scanner.nextLine());
        System.out.println(player2);

        System.out.println(player.getNamePlayer());
        GuessNumber.game();
        System.out.println(player.getNumPlayer());
   }
}