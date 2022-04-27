package com.aakash.functionsandmethods;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int ans = sum3(23,435);
       System.out.println(ans);
    }
    // pass the value of numbers when you are calling method in main()
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;

    }
    static int  sum2 (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2");
        int num2 = input.nextInt();

        int sum = num1+num2;
        return sum;
    }
    static void sum (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2");
        int num2 = input.nextInt();

        int sum = num1+num2;
        System.out.println("The sum is " + sum);
    }
    /*

            access modifier return type name(arguments){

            //body
            return statement;
            }
     */
}
