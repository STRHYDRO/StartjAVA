import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        //Игра: угадай число_2;
        System.out.println("Игра: угадай число_2\n");
        Scanner scan = new Scanner(System.in);
        //GuessNumber guessNumber = new GuessNumber();
        Player play = new Player();
        int randomNumber = (int) (Math.random() * (100 + 1));
        System.out.println("Введите имя первого игрока");
        Player player = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.nextLine());
        //guessNumber.game();
        do {
            System.out.printf("Игрок %s введите целое число от 0 до 100\n", player);
            play.setNumPlayer1(scan.nextInt());
            System.out.printf("Игрок %s введите целое число от 0 до 100\n", player);
            play.setNumPlayer2(scan.nextInt());
                if ((play.getNumPlayer1() > 0 && play.getNumPlayer1() % 1 == 0) && (play.getNumPlayer2() > 0 && play.getNumPlayer2() % 1 == 0)) {
                    if (play.getNumPlayer1() == randomNumber) {
                         System.out.println("Победил игрок " + player1);
                    } else {
                        System.out.println("Победил игрок " + player2);
                    }
                     break;      
                    } else if (play.getNumPlayer1() < randomNumber) {
                        System.out.printf("число %s меньше того, что загадал компьютер", play.getNumPlayer1());
                    } else {
                        System.out.printf("число %s больше того, что загадал компьютер", play.getNumPlayer1()); 
                    } 
                // } else {        
                // System.out.println("Вы ввели не подходящее число, вводите только целые положителные числа");
                // }
        } while(randomNumber < 120);
    }
}