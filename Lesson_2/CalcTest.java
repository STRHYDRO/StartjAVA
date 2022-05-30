import java.util.Scanner;
public class CalcTest {

    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator test\n");
        String choice = "";
        String no = "no";
        String yes = "yes";
        do {
            System.out.println("Введите первое число");
            calcTest.setNum1(scanner.nextInt());
            System.out.println("Введите знак математической операции");
            calcTest.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число");
            calcTest.setNum2(scanner.nextInt());
            if ((calcTest.getNum1() > 0 && calcTest.getNum1() % 1 == 0) && (calcTest.getNum2() > 0 && calcTest.getNum2() % 1 == 0)) {
                calcTest.check();
                if (calcTest.result % 1 == 0) {
                    System.out.printf("%.0f %c %.0f = %.0f", calcTest.getNum1(), calcTest.getSign(), calcTest.getNum2(), calcTest.result);
                } else {
                    System.out.printf("%.0f %c %.0f = %.2f", calcTest.getNum1(), calcTest.getSign(), calcTest.getNum2(), calcTest.result);
                }  
            } else {
                System.out.println("\nЧисла отрицательные или не целые, для расчета введите целые положительные числа");
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no]:");
            choice = scanner.nextLine();
            while (!(choice.equals(yes))) {
                    System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                    choice = scanner.nextLine();
            }
        } while (!(choice.equals(no)));
    }
}
