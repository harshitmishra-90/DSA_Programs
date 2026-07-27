package com.harshit.HashMap;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    static void main() {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            maps.put(arr[i],maps.getOrDefault(arr[i],0)+1);
        }
        //Set<Integer> set=new maps.keySet();
        for(int key:maps.keySet())
        {
            if(maps.get(key)>=arr.length/3)
            {
                System.out.println(key);
            }
        }
    }

}
