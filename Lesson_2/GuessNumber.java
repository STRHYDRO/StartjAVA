import java.util.Scanner;

public class GuessNumber {
     
    Scanner scan = new Scanner(System.in); 
    Player player = new Player();
    Player player2 = new Player();
    private int counter;
    private int randomNumber = (int) (Math.random() * (100 + 1));
    private String gamerName;
    private String name;
    
    public GuessNumber() {}

    public GuessNumber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play() {
        do {
            counter++;
            gamerName = (counter % 2 != 0) ? player.getName() : name;
            System.out.printf("Игрок %s введите целое число от 0 до 100\n", gamerName);
            player.setNum(scan.nextInt());
            scan.nextLine();
            if (player.getNum() > 0 && player.getNum() % 1 == 0) {
                if (player.getNum() == randomNumber) {
                    System.out.printf("Победил игрок : ", gamerName);
                    break;     
                }else if (player.getNum() < randomNumber) {
                    System.out.printf("число %s меньше того, что загадал компьютер\n", player.getNum()); 
                } else if (player.getNum() > randomNumber) {
                    System.out.printf("число %s больше того, что загадал компьютер\n", player.getNum());
                }
            } else {        
                System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
            }
        } while(player.getNum()!= randomNumber);        
    }
}

