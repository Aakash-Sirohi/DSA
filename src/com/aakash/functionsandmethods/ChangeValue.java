package com.aakash.functionsandmethods;

import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {
        // create an array

        int [] arr = {1,2,3,4,5};
        change(arr);

        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] numS) {
        numS[0]=99; // If you make change to the object  via this reference variable, then the original object will also be changed.

    }
}
