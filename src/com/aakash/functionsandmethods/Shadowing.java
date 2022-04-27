package com.aakash.functionsandmethods;

public class Shadowing {

    static int a = 10;//this will get shadowed at line 9.
    public static void main(String[] args) {
        System.out.println(a);
        int a = 3;// class variable at line 5 will get shadowed by this.
        System.out.println(a);
        fun();
    }

    static void fun(){
        System.out.println(a);
    }
}
