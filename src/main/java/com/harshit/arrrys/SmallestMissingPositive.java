package com.harshit.arrrys;

public class SmallestMissingPositive {
    public static int missingPositive(int [] arr)
    {
        int n= arr.length;
        boolean[] nums =new boolean[n+1];
        for(int arrs: arr)
        {
            if(arrs>0&& arrs<=n) {
                nums[arrs] = true;
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(!nums[i])
                return i;
        }
        return n+1;
    }
    public static void main(String[] args) {
        int arr[]={2,-3,4,1,1,7};
        missingPositive(arr);
    }
}


//
//You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.
//
//        Note: Positive number starts from 1. The array can have negative integers too.
//
//        Examples:
//
//Input: arr[] = [2, -3, 4, 1, 1, 7]
//Output: 3
//Explanation: Smallest positive missing number is 3.
//Input: arr[] = [5, 3, 2, 5, 1]
//Output: 4
//Explanation: Smallest positive missing number is 4.
//Input: arr[] = [-8, 0, -1, -4, -3]
//Output: 1
//Explanation: Smallest positive missing number is 1.





//Approach 1: Sort the array
//Logic: Sort the array, then check positive numbers in increasing order. Track the smallest positive number we still expect to find.
//Java code
//
//import java.util.Arrays;
//
//class Solution {
//    public int firstMissingPositive(int[] nums) {
//        Arrays.sort(nums);
//
//        int missing = 1;
//
//        for (int num : nums) {
//            if (num == missing) {
//                missing++;
//            }
//        }
//
//        return missing;
//    }
//}


//
//Approach 3: Index placement (optimal)
//Logic: Put each valid number at its correct index.
//        - Number 1 belongs at index 0.
//        - Number 2 belongs at index 1.
//        - Number 3 belongs at index 2.
//        In general, number x belongs at index x - 1.
//Java code
//
//class Solution {
//    public int firstMissingPositive(int[] nums) {
//        int n = nums.length;
//        int i = 0;
//
//        while (i < n) {
//            int correctIndex = nums[i] - 1;
//
//            if (nums[i] > 0 &&
//                    nums[i] <= n &&
//                    nums[i] != nums[correctIndex]) {
//
//                int temp = nums[i];
//                nums[i] = nums[correctIndex];
//                nums[correctIndex] = temp;
//            } else {
//                i++;
//            }
//        }
//
//        for (int j = 0; j < n; j++) {
//            if (nums[j] != j + 1) {
//                return j + 1;
//            }
//        }
//
//        return n + 1;
//    }
//}
//
//
//
//Dry run: nums = [3, 4, -1, 1]
//
//After index placement, the array becomes:
//
//        [1, -1, 3, 4]
//
//Now compare each index with its expected number:
//        - Index 0: expected 1, found 1 — correct.
//- Index 1: expected 2, found -1 — incorrect.
//        Answer: 2