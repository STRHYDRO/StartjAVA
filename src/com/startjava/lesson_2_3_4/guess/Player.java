package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNums = new int[10];
    int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnteredNum() {
        return enteredNums[attempt];
    }

    public void addNums(int enteredNum) {
        enteredNums[attempt] = enteredNum;
        attempt++;
    }

    public int[] inpitArr() {
         int [] enteredCopy = Arrays.copyOf(enteredNums, attempt);
         return enteredCopy;
    }

    public void resetArr() {
        Arrays.fill(enteredNums, 0, attempt ,0);
    }
}

