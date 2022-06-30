package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName;
    private int mark;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;
    private int murder;
    private String status;
    private String launch;

    public Jaeger() {}

    public String getModelName() {
        return modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.mark = mark;
    }

    public int getMurder() {
        return murder;
    }

    public void setMurder(int murder) {
        this.murder = murder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLaunch() {
        return launch;
    }

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public void liveStatus() {
        System.out.println("\nСтатус робота: " + status);
    }

    public void launch() {
        System.out.println("\nДата спуска на воду: " + launch);
    }

    public void murders() {
        System.out.printf("Убил %d кайдзю", getMurder());
    }

    public Jaeger(String modelName, int mark, double height, double weight, int speed, 
            int strength, int armor, int murder, String status, String launch) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.murder = murder;
        this.status = status;
        this.launch = launch;
    }    

    @Override
    public String toString() {
        return String.format("\nМодель робота = %s \nНомер поколения: Mark-%d \nВысота робота = %.1f метров" +
                "\nВес робота = %.0f тонн \nСкорость робота = %d \nСила робота = %d" +
                "\nЗащита робота = %d \nДата спуска на воду: %s \nУбил %d кайдзю \nСтатус робота: %s ", modelName, mark, +
                height, weight, speed, strength, armor, launch, murder, status);    
    }
}