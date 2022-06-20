import java.util.Scanner;

public class GuessNumber {
     
    Scanner scan = new Scanner(System.in); 
    Player player = new Player();
    private int counter = 0;
    private int randomNumber = (int) (Math.random() * (100 + 1));
    private String gamerName = "";
    private String name;


    public GuessNumber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGamerName() {
        return gamerName;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }

    public int getCounter() { 
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getRandomNumber() { 
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void play() {
        do {
            setCounter()++;
            setGamerName() = (getCounter() % 2 != 0) ? getName() : getName();
            System.out.printf("Игрок %s введите целое число от 0 до 100", getGamerName());
            setNum(scan.nextInt());
            scan.nextLine();
            if (player.getNum() > 0 && player.getNum() % 1 == 0) {
                if (player.getNum() == getRandomNumber()) {
                    System.out.printf("Победил игрок : ", choice);
                    break;     
                }else if (player.getNum() < getRandomNumber()) {
                    System.out.printf("число %s меньше того, что загадал компьютер\n", player.getNum()); 
                } else if (player.getNum() > getRandomNumber()) {
                    System.out.printf("число %s больше того, что загадал компьютер\n", player.getNum());
                }
            } else {        
                System.out.println("Вы ввели не подходящее число, вводите только целые положительные числа");
            }
        } while(player.getNum()!= getRandomNumber());        
    }
}
