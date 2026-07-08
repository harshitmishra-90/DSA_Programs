package com.harshit.arrrys;

import java.util.HashMap;
import java.util.HashSet;

public class ques14pg31 {

        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int nums:arr)
            {
                map.put(nums,map.getOrDefault(nums,0)+1);
            }
            HashSet<Integer> sets=new HashSet<>();
            for(int num:map.values())
            {
                if(sets.contains(num))
                    return false;
                else
                {
                    sets.add(num);
                }
            }
            return true;
        }
    }
//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//
//
//
//        Example 1:
//
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//        Example 2:
//
//Input: arr = [1,2]
//Output: false
//Example 3:
//
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true
//