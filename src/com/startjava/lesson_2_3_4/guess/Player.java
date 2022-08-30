package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNums = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnteredNum() {
        if (attempt == 0) {
            return enteredNums[attempt];
        }
        return enteredNums[attempt - 1];
    }

    public int getAttempt() {
        return attempt;
    }

    public int addNum(int enteredNum) {
        enteredNums[attempt] = enteredNum;
        attempt++;
        return enteredNum;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attempt);
    }

    public void reset() {
        Arrays.fill(enteredNums, 0, attempt ,0);
    }
}

