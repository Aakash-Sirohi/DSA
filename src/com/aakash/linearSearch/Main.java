package com.aakash.linearSearch;

public class Main {

    public static void main(String[] args) {
        int [] numS = {1,3,4,5,6,7};
        int target = 6;
        int ans = linearSearch2(numS,target);
        System.out.println(ans);
    }
    // search in the array> return index if item found otherwise ,-1.
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        //run for a loop
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        //run for a loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
