package com.aakash.intro;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float num = input.nextFloat();
//        int num = (int)56.33f;
//        System.out.println(num);

        // Automatic Type Promotion in Expressions

//        int a= 258;
//        byte b = (byte) a;



//        byte b = 50;
//       b = (byte)(b*2);

//        System.out.println(b);

//        int number = '\nनमस्ते';
//        System.out.println("\n" +"नमस्ते");

        byte b = 32;
        char c ='a';
        short s = 1024;
        int i = 4000;
        float f = 5.63f;
        double d = 0.23131;
        double result = (f*b)+(i/c)- (d-s);

        // float + int - double = double
        System.out.println((f*b)+" " +(i/c)+" "+ (d-s));
        System.out.println(result);
    }
}


