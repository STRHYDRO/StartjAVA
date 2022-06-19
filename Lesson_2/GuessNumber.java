import java.util.Scanner;

public class GuessNumber {
     
    Scanner scan = new Scanner(System.in); 
    Player play = new Player();
    Player player = new Player();
    Player player2 = new Player();
    int counter = 0;
    int randomNumber = (int) (Math.random() * (100 + 1));
    String gamerName;

    public void game() {
        do {
            counter++;
            String choice = (counter % 2 != 0) ? player : player2;
            if (play.getNumPlayer() > 0 && play.getNumPlayer() % 1 == 0) {
                if (play.getNumPlayer() == randomNumber) {
                    System.out.printf("Победил игрок : ", choice)
                    break;     
                }else if (play.getNumPlayer() < randomNumber) {
                    System.out.printf("число %s меньше того, что загадал компьютер\n", play.getNumPlayer()); 
                } else if (play.getNumPlayer() > randomNumber) {
                    System.out.printf("число %s больше того, что загадал компьютер\n", play.getNumPlayer());
                }
            } else {        
                System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
            }
        } while(play.getNumPlayer() != randomNumber);        
    }
}
