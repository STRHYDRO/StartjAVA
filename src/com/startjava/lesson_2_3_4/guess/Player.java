package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int[] enteredNums = new int[10];


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums() {
        return enteredNums;
    }

    public void setEnteredNums(int enteredNum) {
        int lenght = enteredNums.length;
        for (int i = 0; i < 1++; i++) {
            enteredNums[i] = enteredNum;
        }
    }
}

