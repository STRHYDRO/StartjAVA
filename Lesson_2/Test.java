import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {
        System.out.println("Это самый внешний цикл");
        do {
        System.out.println("\nХотите продолжить карусельку? [yes/no]:");
        System.out.println("Это основной цикл");
        choice = scanner.nextLine();
        while (!(choice.equals("yes"))) {
        //     if (choice.equals("yes")) {  
        //         break;  
        //     } else {
        // }       
        }
        } while (!((choice.equals("no")) || (choice.equals("yes"))));
        } while (!(choice.equals("no")));
    }
}