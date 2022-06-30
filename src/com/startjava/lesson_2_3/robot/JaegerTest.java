package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaegerTest = new Jaeger();
        jaegerTest.setModelName("Striker Eureka");
        jaegerTest.setMark(5);
        jaegerTest.setHeight(76.2);
        jaegerTest.setWeight(1850);
        jaegerTest.setSpeed(10);
        jaegerTest.setStrength(10);
        jaegerTest.setArmor(9);
        jaegerTest.setMurder(11);
        jaegerTest.setStatus("Desabled");
        jaegerTest.setLaunch("November 2, 2019");
        System.out.printf("\nМодель робота = %s \nНомер поколения: Mark-%d%n", jaegerTest.getModelName(), jaegerTest.getMark());
        System.out.printf("Высота робота = %.1f метров%n", jaegerTest.getHeight());
        System.out.printf("Вес робота = %.0f тонн \nСкорость робота = %d%n", jaegerTest.getWeight(), jaegerTest.getSpeed());
        System.out.printf("Сила робота = %d \nЗащита робота = %d", jaegerTest.getStrength(), jaegerTest.getArmor());
        jaegerTest.launch();
        jaegerTest.murders();
        jaegerTest.liveStatus();

        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", 4, 76.2, 1722, 9, 8, 6, 7, "Desabled", "August 22, 2018");
        System.out.println(crimsonTyphoon);
    }   
}    





