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

    public void choice() {
        gamerName = player1 == gamerName ? player2 : player1; 
    } 

    public void play() {
        randomNumber = (int) (Math.random() * (100 + 1));
        do {
            choice();    
            System.out.printf("Игрок %s введите целое число от 0 до 100\n", gamerName.getName());
            gamerName.setNum(scan.nextInt());
            scan.nextLine();
            if (gamerName.getNum() > 0 && gamerName.getNum() % 1 == 0) {
                if (gamerName.getNum() == randomNumber) {
                    System.out.printf("Победил игрок : %s", gamerName.getName());
                    break;     
                } else if (gamerName.getNum() < randomNumber) {
                    System.out.printf("число %s меньше того, что загадал компьютер\n", gamerName.getNum()); 
                } else if (gamerName.getNum() > randomNumber) {
                    System.out.printf("число %s больше того, что загадал компьютер\n", gamerName.getNum());
                }
            } else {        
                System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
            }
        } while(true);        
    }
}

