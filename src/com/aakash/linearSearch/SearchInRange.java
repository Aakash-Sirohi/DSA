package com.aakash.linearSearch;

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = {3,4,6,7,2,3,4,5,1,23,4,5};
        int target = 4;
        System.out.println(search(arr,target , 9,12));
    }
    static boolean search(int [] arr, int target, int start , int end) {
        if(arr.length==0){
            return false;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
