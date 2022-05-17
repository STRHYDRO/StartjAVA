public class MyFirstGame {

    public static void main(String[] args) {
    //Игра: угадай число;
    System.out.println("Игра: угадай число\n");
    int game = 6;
    for (int i = 0; i <= 100; i++) {
        if (i < game) {
            System.out.println("Число " + i + " меньше того, что загадал компьютер");
            } if (i != game) {
                System.out.println("число " + i + " больше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили !");
                
        }
    }
}
 
