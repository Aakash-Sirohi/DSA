package com.aakash.linearSearch;

public class EvenDigits {

    public static void main(String[] args) {
        int[]  nums ={ 22,33,44 ,5 ,6};
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] numS) {
        int count = 0;
        for (int num : numS
        ) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int digits = digits(num);
        if(digits%2==0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }


}



