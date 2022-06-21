import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        System.out.println("Игра: угадай число_2\n");
        Scanner scan = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        String choice = "yes";
        System.out.println("Введите имя первого игрока");
        Player player = new Player(scan.nextLine());
        GuessNumber guessNumber1 = new GuessNumber(player.getName());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessNumber2 = new GuessNumber(player2.getName());
        do {
            if ("yes".equals(choice)) {
                guessNumber.play();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]:");
            choice = scan.nextLine();     
        } while(!"no".equals(choice));
    }
}