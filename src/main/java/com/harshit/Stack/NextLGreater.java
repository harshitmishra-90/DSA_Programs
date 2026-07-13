package com.harshit.Stack;

import java.util.Stack;

public class NextLGreater {
    public static void nextGreater(int arr[]){
        int nextGreater[]=new int[arr.length+1];
        Stack<Integer> stack =new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.empty()&& stack.peek()<=arr[i])
            {
                stack.pop();
            }
            if(stack.empty())
                nextGreater[i]=-1;
            else
                nextGreater[i]=stack.peek();
            stack.push(arr[i]);
        }
        for(int i=0;i<nextGreater.length;i++)
        {
            System.out.print(nextGreater[i] +" ");
        }

    }

    static void main() {
        int arr[]={6,8,0,1,3};
        nextGreater(arr);
    }
}
