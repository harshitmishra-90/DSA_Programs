package com.harshit.Hashing.HashSet;

import java.util.HashSet;

public class CountDistinct {
    static void main() {
        int num[]={4,3,2,5,6,7,4,2,1};
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<num.length;i++)
        {
            hashSet.add(num[i]);
        }
        System.out.println("ans "+ hashSet.size());
    }
}
