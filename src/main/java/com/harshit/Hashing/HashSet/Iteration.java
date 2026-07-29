package com.harshit.Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

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

    }

}
