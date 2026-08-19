package com.harshit.arrrys;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] sum(int arr[],int target)
    {
        HashMap<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int needed=target-arr[i];
            if(maps.containsKey(needed))
                return new int[]{maps.get(needed),i};
            maps.put(arr[i],i );
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[]={2,3,5};
        System.out.println(Arrays.toString(sum(arr,5)));

    }
}
