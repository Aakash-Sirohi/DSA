package com.aakash.functionsandmethods;

public class Scope {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        String name = "aakash";
        {   // already initialised outside the block in the same method.
            a =334;//reassigning  the original reference variable to some other value.
            System.out.println(a);
            int c =232;
            name = "Sirohi";
            System.out.println(name);

            //values initialised in this block will remain in this block.
        }
        System.out.println(a);
        System.out.println(name);


    }





    static void random(int marks){
        int num =59;
        System.out.println(marks);
        System.out.println(num);
    }
}
