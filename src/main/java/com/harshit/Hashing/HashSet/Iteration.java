package com.harshit.Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Iteration {
    static void main() {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("INDIA");
        hashSet.add("USA");
        hashSet.add("NEPAL");
        hashSet.add("BHUTAN");
        //unordered output
        //means jaisa input kiya hai jaruri nhi ki vaisa output mile
        System.out.println(hashSet);
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("INDIA");
        linkedHashSet.add("USA");
        linkedHashSet.add("NEPAL");
        linkedHashSet.add("BHUTAN");
        //ordered output
        //output will be same as it inserted
        System.out.println(linkedHashSet);

        //Treeset
        //sorted in ascending order
        //having the tc of O(logn) due to sorting

        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("INDIA");
        treeSet.add("USA");
        treeSet.add("NEPAL");
        treeSet.add("BHUTAN");
        System.out.println(treeSet);
    }

}
//Why use an Iterator if println(hashSet) already prints everything?
//
//Using an iterator gives you more control. For example, you can:
//
//Process each element individually.
//Skip certain elements.
//Remove elements safely while iterating.
//
//        Example:
//
//Iterator<String> itr = hashSet.iterator();
//
//while (itr.hasNext()) {
//String s = itr.next();
//    if (s.startsWith("A")) {
//        System.out.println(s);
//    }
//            }