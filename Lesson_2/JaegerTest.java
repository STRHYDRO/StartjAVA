import java.util.Scanner;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        Scanner scanner = new Scanner(System.in);
        System.out.println("jaeger Striker Eureka\n");
        System.out.println("Введите имя модели робота");
        strikerEureka.setModelName(scanner.nextLine());
        System.out.println("Введите номер поколения");
        strikerEureka.setMark(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Введите высоту робота");
        strikerEureka.setHeight(scanner.nextDouble());
        System.out.println("Введите вес робота");
        strikerEureka.setWeight(scanner.nextDouble());
        System.out.println("Введите скорость робота");
        strikerEureka.setSpeed(scanner.nextInt());
        System.out.println("Введите силу атаки робота");
        strikerEureka.setStrength(scanner.nextInt());
        System.out.println("Введите мощность брони");
        strikerEureka.setArmor(scanner.nextInt());
        System.out.println("Введите количество убитых кайдзю");
        strikerEureka.setMurder(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Введите статус работоспособности робота [desabled/ enabled]");
        strikerEureka.setStatus(scanner.nextLine());
        System.out.println("Введите дату спуска робота на воду");
        strikerEureka.setLauching(scanner.nextLine());
        System.out.printf("\nМодель робота = %s \nНомер поколения: Mark-%d%n", strikerEureka.getModelName(), strikerEureka.getMark());
        System.out.printf("Высота робота = %.1f метров%n", strikerEureka.getHeight());
        System.out.printf("Вес робота = %.0f тонн \nСкорость робота = %d%n", strikerEureka.getWeight(), strikerEureka.getSpeed());
        System.out.printf("Сила робота = %d \nЗащита робота = %d", strikerEureka.getStrength(), strikerEureka.getArmor());
        strikerEureka.lauching();
        strikerEureka.murders();
        strikerEureka.liveStatus();
    }


    
}    





