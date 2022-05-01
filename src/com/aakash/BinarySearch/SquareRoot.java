package com.aakash.BinarySearch;

import java.util.Arrays;

public class SquareRoot {

    public static void main(String[] args) {
            int ans = mySqrt(8);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        int[] arrayUpton = new int[x];
        int start =0;
        int end = arrayUpton.length-1;
        int mid =  start + (end-start )/2;

        for (int index = start; index <= end; index++) {
            arrayUpton[index]=index;
        }
       if(arrayUpton[mid]*arrayUpton[mid]==x) return mid;
        else if(arrayUpton[mid]*arrayUpton[mid]>x){
            end = mid -1;
           for (int index = start; index <= end; index++) {
               if(arrayUpton[index]*arrayUpton[index]==x){
                   return index;
               } else if (arrayUpton[index]*arrayUpton[index]>x) {
                   return index;
               }
           }
        }else{
            start = mid+1;
           for (int index = start; index < end; index++) {
               if(arrayUpton[index]*arrayUpton[index]==x){
                   return arrayUpton[index];
               } else if (arrayUpton[index]*arrayUpton[index]>x) {
                   return arrayUpton[index-1];
               }
           }
        }

        return 0;
    }

}
