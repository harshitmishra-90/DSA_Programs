package com.harshit.arrayList;

import java.util.ArrayList;

public class PairSum1 {
    //find if any pair in a sorted arraylist has a target sum.

    public static boolean pairsum(ArrayList<Integer> arr,int target) {
        //brute force apporach
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target)
                    return true;
            }
        }
        return false;
    }
    static void main() {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        System.out.println( pairsum(arr,3));
    }
}
