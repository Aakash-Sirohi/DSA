package com.aakash.functionsandmethods;

import java.util.Scanner;

public class Questions  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int num = in.nextInt();
//      System.out.println(isArmStrong(num));
        for (int i = 100; i < 1000; i++) {
            if(isArmStrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
    // Print all 3 digits armstrong numbers
    static boolean isArmStrong(int n){
        int original = n;

        int sum =0;
        while(n>0){
            int rem = n%10;
            int remC = rem*rem*rem;
            sum+=remC;
            n=n/10;
        }
        return (sum==original);
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        int c = 2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }c++;
        }
        return(c*c>n);

       
    }
}
