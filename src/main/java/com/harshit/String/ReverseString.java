package com.harshit.String;

import java.util.Stack;

public class ReverseString {
    static void main() {
        Stack<Character> stack=new Stack<>();
        String str="harshit";
        int indx=0;
        while(indx<str.length())
        {
            stack.push(str.charAt(indx));
            indx++;
        }
        StringBuilder stringBuilder =new StringBuilder("");
        while(!stack.isEmpty())
        {
            char curr=stack.pop();
            stringBuilder.append(curr);
        }
        String result=stringBuilder.toString();
        System.out.println(result);
    }

}
