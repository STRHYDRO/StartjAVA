import java.util.Scanner;
public class Test{

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int no = 1;
        int yes = 5;
        do {
        System.out.println("\nХотите продолжить карусельку? [yes = 5/no =1]:");
        choice = scanner.nextInt();
        do {
            if (choice != yes) {
                System.out.println("\nХотите продолжить карусельку? [yes = 5/no =1]:");
                choice = scanner.nextInt();   
            } else {
            }
            } while (choice == no);
        } while (choice == no);
    }
}
