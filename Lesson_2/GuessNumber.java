import java.util.Scanner;

public class GuessNumber {
     
    Scanner scan = new Scanner(System.in); 
    private int randomNumber;
    private Player player1;
    private Player player2;
    private Player gamerName;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void randomNum() {
        randomNumber = (int) (Math.random() * (100 + 1));
    }

    public void play() {
        do {
            gamerName = player1.equals(gamerName) ? player1: player2;
            System.out.printf("Игрок %s введите целое число от 0 до 100\n", gamerName);
            player1.setNum(scan.nextInt());
            scan.nextLine();
            if (player1.getNum() > 0 && player1.getNum() % 1 == 0) {
                if (player1.getNum() == randomNumber) {
                    System.out.printf("Победил игрок : %s", gamerName);
                    break;     
                } else if (player1.getNum() < randomNumber) {
                    System.out.printf("число %s меньше того, что загадал компьютер\n", player1.getNum()); 
                } else if (player1.getNum() > randomNumber) {
                    System.out.printf("число %s больше того, что загадал компьютер\n", player1.getNum());
                }
            } else {        
                System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
            }
        } while(true);        
    }
}

