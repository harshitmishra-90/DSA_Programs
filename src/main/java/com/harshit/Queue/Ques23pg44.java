package com.harshit.Queue;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//find the first non repeating element from String
public class Ques23pg44 {
    public static void printNonRepeating(String s)
    {
        int[] freq=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-'a']++;
            q.add(ch);
            while(!q.isEmpty()&&freq[q.peek()-'a']>1)
            {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1+ " ");
            }
            else{
                System.out.println(q.peek()+" ");
            }
        }
        System.out.println();

    }

    static void main() {
        printNonRepeating("aabcxymm");
    }
}
