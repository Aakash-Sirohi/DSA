package com.aakash.BinarySearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {

    }

    static int orderAgnosticBS (int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;
        // Find whether array is descending or not
        int left = 0, right = nums.length - 1;
        boolean isAsc =nums[left]<nums[right];

        while(left <= right){
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){ return mid; }
            if(isAsc){
                if(nums[mid] < target) { left = mid + 1; }
                else { right = mid - 1; }
            }
            else {
                if(nums[mid] < target) { right = mid - 1; }
                else { left = mid + 1; }
            }
        }
        // End Condition: left > right
        return -1;

    }
}
