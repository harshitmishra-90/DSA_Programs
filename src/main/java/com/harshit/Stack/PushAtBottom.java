package com.harshit.Stack;

import java.util.ArrayList;

public class PushAtBottom {
    static class stack{
        static ArrayList<Integer> list =new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop()
        {
            if(list.isEmpty())
                return -1;
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static void bottom(int data)
        {
            if(list.isEmpty())
            {
                list.add(data);
                return;
            }
            int top=stack.pop();
            bottom(data);
            push(top);
        }
        public static void display() {
            while (!isEmpty()) {
                System.out.println(pop());
            }
        }
    }
    static void main() {

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.bottom(50);
        stack.display();
    }
}
