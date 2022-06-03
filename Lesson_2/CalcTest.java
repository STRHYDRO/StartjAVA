import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator test\n");
        String choice = "yes";
        while (choice.equals("yes")) {
            System.out.println("Введите первое число");
            calcTest.setNum1(scanner.nextInt());
            System.out.println("Введите знак математической операции");
            calcTest.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число");
            calcTest.setNum2(scanner.nextInt());
            calcTest.calculate();
            calcTest.printOut();
            while (!choice.equals("no")) {
                System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                choice = scanner.nextLine();
                choice = scanner.nextLine();
                if (choice.equals("yes")) {
                    break;
                }
            }
        } 
    } 
}


