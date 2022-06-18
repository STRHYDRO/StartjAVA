import java.util.Scanner;
public class GuessNumber {
     
    Scanner scan = new Scanner(System.in); 
    Player play = new Player();
    Player player = new Player(); 
    Player player2 = new Player();
    GuessNumberTest guess = new GuessNumberTest();
    String nameGamer;
    int counter = 0;
    int gameNum;
    int randomNumber = (int) (Math.random() * (100 + 1));

    public void game() {
        do {
            counter++;
            nameGamer = counter % 2 != 0 ? player : player2;
            System.out.printf("Игрок %s введите целое число от 0 до 100\n", nameGamer);
            play.setNumPlayer(scan.nextInt());
            scan.nextLine();
            if (play.getNumPlayer() > 0 && play.getNumPlayer() % 1 == 0) {
                if (play.getNumPlayer() == randomNumber) {
                    System.out.println("Победил игрок " + nameGamer);
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
