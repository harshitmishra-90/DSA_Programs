package com.harshit.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue24pg45 {

    //Interleave 2 Halves of a Queue(Even length)

    public static Queue<Integer> interLeave(Queue<Integer> q)
    {
        int size=q.size();
        Queue<Integer> first=new LinkedList<>();
        for(int i=0;i<size/2;i++) {
            first.add(q.remove());
        }
        while(!first.isEmpty())
        {
            q.add(first.remove());
            q.add(q.remove());
        }
        return q;
    }
    static void main() {

        Queue<Integer> queue= new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        System.out.println(interLeave(queue));

    }
}
