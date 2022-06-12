import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите имя первого игрока");
        //guessNumberTest.setPlayer1(scanner.nextLine());
        System.out.println("Введите имя второго игрока");
        //guessNumberTest.setPlayer2(scanner.nextLine());
        GuessNumberTest player2 = new Player(scanner.nextLine());
            System.out.println(player2);
    }
}