package com.harshit.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse {
    public static Queue<Integer> reverse(Queue<Integer> q) {

        Stack<Integer> stack =new Stack<>();
        while(!q.isEmpty())
        {
            stack.push(q.remove());
        }
        while(!stack.isEmpty())
        {
            q.add(stack.pop());
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
        System.out.println("before reversing the queue");
        System.out.println(queue);
        System.out.println("after reversing the queue");
        System.out.println(reverse(queue));
    }
}