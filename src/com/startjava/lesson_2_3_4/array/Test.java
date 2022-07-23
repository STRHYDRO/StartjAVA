package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {

        String[] stringArr = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        int count;
        //Array output printStrings(stringArr);
        //Calculating length for new array
        int newLen = 0;
        for (String string : stringArr) {
            if (!string.isBlank()) {
                newLen++;
            }
        }
        String[] newStringArr = new String[newLen];
        count = 1;
        int destPos = 0;
        int srcPos = 0;
        int len = stringArr.length;
        //Copying only not blank strings from source array to new array
        for (int i = 0; i < len; i++) {
            if (!stringArr[i].isBlank()) {
                srcPos = i;
                if (i < len - 1) {
                    for (int j = i + 1; j < len; j++) {
                        if (stringArr[j].isBlank()) {
                            break;
                        }
                        count++;
                    }
                }
                System.out.println(count);
                System.arraycopy(stringArr, srcPos, newStringArr, destPos, count);
                destPos += count;
                i += count;
                count = 1;
            }
        }
        //New array output
    }
}