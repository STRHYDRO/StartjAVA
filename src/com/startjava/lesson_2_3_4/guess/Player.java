package com.startjava.lesson_2_3_4.guess;

public class Player {

    private String name;
    private int num;
    private int[] numArr = new int[10];

    public Player(String name) {
        this.name = name;  
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

