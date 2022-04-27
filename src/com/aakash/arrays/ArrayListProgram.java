package com.aakash.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {

    public static void main(String[] args) {
        // Syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>  list = new ArrayList<Integer>(10);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here list[index] will not work here

        }






    }
}
