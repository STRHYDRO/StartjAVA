import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        System.out.println("Игра: угадай число_2\n");
        Scanner scan = new Scanner(System.in);
        // Player player = new Player();
        // GuessNumber guessNumber = new GuessNumber();
        String choice = "yes";
        System.out.println("Введите имя первого игрока");
        GuessNumber player = new GuessNumber(scan.nextLine());
        System.out.println("Введите имя второго игрока");
        GuessNumber player2 = new GuessNumber(scan.nextLine());
        do {
            if ("yes".equals(choice)) {
                guessNumber.play();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]:");
            choice = scan.nextLine();     
        } while(!"no".equals(choice));
    }
}