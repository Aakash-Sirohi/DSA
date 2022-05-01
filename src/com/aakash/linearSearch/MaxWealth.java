package com.aakash.linearSearch;

public class MaxWealth {

    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowSum =0;
            for (int bankAccount = 0; bankAccount <accounts[person].length; bankAccount++) {
                rowSum+=accounts[person][bankAccount];
            }
            if(rowSum>ans){
                ans = rowSum;
            }
        }
        return ans;
    }
}
