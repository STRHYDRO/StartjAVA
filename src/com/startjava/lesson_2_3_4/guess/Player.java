package com.startjava.lesson_2_3_4.guess;

public class Player {

    private String name;
    private int[] numArr = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumArr() {
        return numArr;
    }

    public void setNumArr(int[] numArr) {
        this.numArr = numArr;
    }
}


