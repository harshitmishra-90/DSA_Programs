package com.harshit.LinkedList2;

import java.util.LinkedList;

public class Collections1 {
    static void main() {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(12);
        ll.addLast(13);
        ll.addFirst(11);
        System.out.println(ll);
        //removing
        ll.removeFirst();
        System.out.println(ll);
    }
}
