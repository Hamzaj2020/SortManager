package com.sparta.hamza.engineering50.javabasics;

import java.util.Arrays;
public class BubbleSort {

    static int two;
    static int one;
    static int startValue = 0;
    public static void sorting(int[] array) {
        while (startValue < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                } else {
                    one = array[i + 1];
                    two = array[i];
                    array[i] = one;
                    array[i + 1] = two;
                }
            }
            startValue++;
        }
        System.out.println(Arrays.toString(array));
    }
}

