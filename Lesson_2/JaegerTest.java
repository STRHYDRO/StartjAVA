import java.util.Scanner;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        Jaeger crimsonTyphoon = new Jaeger(robot);
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
        crimsonTyphoon.modelName = "CrimsonTyphoon";
        crimsonTyphoon.mark = 4;
        crimsonTyphoon.height = 76.2;
        crimsonTyphoon.weight = 1722;
        crimsonTyphoon.speed = 9;
        crimsonTyphoon.strenght = 8;
        crimsonTyphoon.armor = 6;
        // crimsonTyphoon.murder = 7;
        // crimsonTyphoon.status = "desabled";
        // crimsonTyphoon.lauching = "22 августа 2018 года";
        System.out.printf("\nМодель робота = %s \nНомер поколения: Mark-%d%n", crimsonTyphoon.modelName, crimsonTyphoon.mark);
        System.out.printf("Высота робота = %.1f метров%n", crimsonTyphoon.height);
        System.out.printf("Вес робота = %.0f тонн \nСкорость робота = %d%n", crimsonTyphoon.weight, crimsonTyphoon.speed);
        System.out.printf("Сила робота = %d \nЗащита робота = %d", crimsonTyphoon.strenght, crimsonTyphoon.armor);
    }


    
}    





