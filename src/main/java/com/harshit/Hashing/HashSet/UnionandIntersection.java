package com.harshit.Hashing.HashSet;

import java.util.HashSet;

public class UnionandIntersection {
    static void main() {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> hashset=new HashSet<>();

        //union
        for(int i=0;i<arr1.length;i++)
        {
            hashset.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            hashset.add(arr2[i]);
        }
        System.out.println("union -->"+hashset.size());
        System.out.println("element in union : "+hashset);
        //intersection
        hashset.clear();
        for(int i=0;i<arr1.length;i++)
        {
            hashset.add(arr1[i]);
        }
        int count=0;
        System.out.print("intersection elemnt :");
        for(int i=0;i< arr2.length;i++)
        {
            if(hashset.contains(arr2[i])) {
                count++;
                hashset.remove(arr2[i]);
                System.out.print(" "+arr2[i]);
            }
        }
        System.out.println();
        System.out.println("intersection --> "+count);
    }
}
