package com.aakash.functionsandmethods;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(1,2,3,45,6,7,8,9,9);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
