package com.aakash.conditionalsloops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take input from the user till the user does not press X or x.
        int result=0;


        while(true){
            //take the operator as input
            System.out.println("Enter Your Operator:");
            char op = input.next().trim().charAt(0);
            if(op == '+'||op == '-'||op == '*'||op == '/'||op == '%'){
                // input 2 numbers
                System.out.println("Enter First number:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op=='+'){
                    result = num1+num2;
                }
                if(op=='-'){
                    result = num1-num2;
                }
                if(op=='*'){
                    result = num1*num2;
                }
                if(op=='/'){
                    result = num1/num2;
                }
                if(op=='%'){
                    result = num1%num2;
                }else if(op=='x'||op=='X'){
                    break;
                }
                System.out.println(result);


            }


        }
    }
}
