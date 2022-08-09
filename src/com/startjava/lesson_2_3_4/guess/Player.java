package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNums = new int[10];
    int counterNum = 0;
    int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnteredNums() {
        if (counterNum > 0) {
            count = counterNum - 1;
        }
        return enteredNums[count];
    }

    public void setEnteredNums(int enteredNum) {
        for (int i = counterNum; i < counterNum + 1; i = i) {
            enteredNums[i] = enteredNum;
            counterNum++;
            break;
        }
    }
}

