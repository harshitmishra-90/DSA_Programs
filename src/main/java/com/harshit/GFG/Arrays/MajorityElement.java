package com.harshit.GFG.Arrays;

import java.util.ArrayList;
import java.util.HashMap;

//Given an array arr[] consisting of n integers, find all the array elements which occurs more than floor(n/3) times. Return the resulting array in strictly increasing order. If no such elements exist, return an empty array.
//
//        Examples:
//
//Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]
//Output: [1, 2]
//Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).
public class MajorityElement {

    public static ArrayList<Integer> majorityElement(int []arr)
    {
        int n=arr.length;
        HashMap<Integer,Integer> maps=new HashMap<>();
        ArrayList<Integer> result =new ArrayList<>();

        for(int nums:arr){
            if(maps.containsKey(nums))
            {
                maps.put(nums,maps.get(nums)+1);
            }
            else{
                maps.put(nums,1);
            }
        }
//        maps.keySet() means:
//    "Give me all the keys present in the HashMap."
        for(int key : maps.keySet()) {
            if (maps.get(key) > n / 3) {
                result.add(key);
            }
        }
        return result;
    }
    static void main() {
      int arr[] = {2, 2, 3, 1, 3, 2, 1, 1};
        System.out.println(majorityElement(arr));
    }

}
