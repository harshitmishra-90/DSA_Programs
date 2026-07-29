package com.harshit.Hashing.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedhashMap {
    static void main() {
        LinkedHashMap<String,Integer> lhm =new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("Bhutan",50);
        lhm.put("Nepal",20);
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Bhutan",50);
        hm.put("Nepal",20);
        System.out.println("Linked HashMap "+lhm); //output order is same as they inserted
        System.out.println("HashMap "+hm);//no order
    }
}
