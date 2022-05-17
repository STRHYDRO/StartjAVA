public class MyFirstGame {

    public static void main(String[] args) {
    //Игра: угадай число;
    System.out.println("Игра: угадай число\n");
    int game = 68;
    for (int i = 0; i <= 100; i++) {
        if (i == game) {
            i = 101;
            System.out.println("Вы победили !");
        } else if (i < game) {
            System.out.println("число " + i + " меньше того, что загадал компьютер");
        } else {
            System.out.println("число " + i + " больше того, что загадал компьютер");
        }    
        }
    }    
}

 
