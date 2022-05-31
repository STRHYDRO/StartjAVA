import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator test\n");
        do {
            System.out.println("Введите первое число");
            calcTest.setNum1(scanner.nextInt());
            System.out.println("Введите знак математической операции");
            calcTest.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число");
            calcTest.setNum2(scanner.nextInt());
            calcTest.calculate();
            calcTest.printOut();
            System.out.println("\nХотите продолжить вычисления ? [yes/no]:");
            calcTest.choice = scanner.nextLine();
            calcTest.choice = scanner.nextLine();
            while (!(calcTest.choice.equals(calcTest.no))) {
                if (!(calcTest.choice.equals(calcTest.yes))) {
                    System.out.println("\nХотите продолжить вычисления ? [yes/no]:");
                    calcTest.choice = scanner.nextLine();   
                } else { 
                    break;  
                }
            }
        } while (!(calcTest.choice.equals(calcTest.no)));
    }
}
