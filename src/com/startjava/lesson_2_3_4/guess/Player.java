package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int[] enteredNums = new int[10];
    private int counterNum = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums(int number) {

    }

    public void setEnteredNums(int enteredNum) {
        for (int i = counterNum; i < counterNum + 1; i++) {
            enteredNums[i] = enteredNum;
            counterNum++;
            return;
        }
    }
}

