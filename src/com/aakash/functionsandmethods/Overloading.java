package com.aakash.functionsandmethods;

import java.util.Arrays;

public class Overloading {

    public static void main(String[] args) {

        // This is known as Function/Method Overloading.
        // At Compile TIME.
        //fun(32);
//        int ans = sum(3,4);
//        int ans2 = sum(2,3,5);
//        System.out.println(ans + " "+ ans2);

        demo(1,2,4,5,6);
        demo("aakash","sirohi");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static int sum(int a, int b ){
        return a + b;
    }
    static int sum(int a, int b , int c){
        return a + b + c;
    }
    static void fun(int a){
        System.out.println("firstOne");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("secondOne");
        System.out.println(name);
    }
}
