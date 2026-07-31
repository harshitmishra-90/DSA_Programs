package com.harshit.Hashing.HashMap;

import java.util.HashMap;

public class SubarraySum {
    static void main() {
        int arr[]={15,-2,2,-8,1,7,10};
        HashMap<Integer ,Integer>maps=new HashMap<>();
        int len=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(maps.containsKey(sum))
            {
                len=i-maps.get(sum);
            }
            else
                maps.put(sum,i);
        }
        System.out.println(len);
    }
}
