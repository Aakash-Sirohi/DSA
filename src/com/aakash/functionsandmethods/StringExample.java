package com.aakash.functionsandmethods;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
//        String message  = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String naaM = in.next();
        String personalisedMessage = myGreet(naaM);
        System.out.println(personalisedMessage);

    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "How are you";
        return greeting;

    }
}
