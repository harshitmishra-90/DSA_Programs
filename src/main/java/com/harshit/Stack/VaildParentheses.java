package com.harshit.Stack;

import java.util.Stack;

public class VaildParentheses {
    public static boolean validParentheses(Stack<Character> stack , String s){

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{'||ch=='('||ch=='[')
                stack.push(s.charAt(i));
            else
            {
                if(stack.empty())
                    return false;
                if((stack.peek()=='('&&ch==')')||   //if pair forms like () or [] or {} so pop
                        (stack.peek()=='{'&&ch=='}')||
                        (stack.peek()=='['&&ch==']'))
                {
                    stack.pop();
                }
                else return false;
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;
    }
    static void main() {

        Stack<Character> stack=new Stack<>();
        System.out.println( validParentheses(stack,"(){}[]{"));
    }
}
