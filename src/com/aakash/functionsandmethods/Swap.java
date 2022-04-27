package com.aakash.functionsandmethods;

public class Swap {
    public static void main(String[] args) {
        int a= 10;
        int b=20;

        //Swap numbers code
//        int temp=a;
//        a=b;
//        b=temp;
//
        swap(a,b);
        System.out.println(a+" "+ b);

        String name = "aakash";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "aakash sirohi";
    }

    static void swap(int a, int b ){

        int temp =a;
        a=b;
        b=temp;
    }
}
