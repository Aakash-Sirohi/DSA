package com.aakash.linearSearch;

public class FindMin {

    public static void main(String[] args) {
        int [] arr ={3,4,6,17,-22,3};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]< ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
