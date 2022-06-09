import java.util.Scanner;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger = new Jaeger();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Striker Eureka\n");
        System.out.println("Введите имя модели робота");
        jaeger.setModelName(scanner.nextLine());
        System.out.println("Введите номер поколения");
        jaeger.setMark(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Введите страну производства");
        jaeger.setOrigin(scanner.nextLine());
        System.out.println("Введите высоту робота");
        jaeger.setHeight(scanner.nextDouble());
        System.out.println("Введите вес робота");
        jaeger.setWeight(scanner.nextDouble());
        System.out.println("Введите скорость робота");
        jaeger.setSpeed(scanner.nextInt());
        System.out.println("Введите силу атаки робота");
        jaeger.setStrength(scanner.nextInt());
        System.out.println("Введите мощность брони");
        jaeger.setArmor(scanner.nextInt());
        System.out.println("Введите количество убитых кайдзю");
        jaeger.setMurder(scanner.nextInt());
        System.out.printf("\nМодель робота = %s \nНомер поколения: Mark-%d%n", jaeger.getModelName(), jaeger.getMark());
        System.out.printf("Страна производства = %s \nВысота робота = %.1f метров%n", jaeger.getOrigin(), jaeger.getHeight());
        System.out.printf("Вес робота = %.0f тонн \nСкорость робота = %d%n", jaeger.getWeight(), jaeger.getSpeed());
        System.out.printf("Сила робота = %d \nЗащита робота = %d", jaeger.getStrength(), jaeger.getArmor());
        jaeger.lauching();
        jaeger.murders();
        jaeger.liveStatus();
    }
}






