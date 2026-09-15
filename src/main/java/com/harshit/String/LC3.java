package com.harshit.String;

import java.util.HashMap;

// Leetcode question no 3
public class LC3 {
    public static int longestSubtring(String s)
    {
        int left=0;
        int max=0;
        int right=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        while(right<s.length()&&left<s.length())
        {
            if(!hashMap.containsKey(s.charAt(right)))
            {
                hashMap.put(s.charAt(right),1);
                right++;
                max=Math.max(max,right-left);
            }
            else{
                hashMap.remove(s.charAt(left));
                left++;

            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s="abcabcde";
        System.out.println(longestSubtring(s));
    }
}
