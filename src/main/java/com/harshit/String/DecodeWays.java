package com.harshit.String;


//leetcode question no. 91
public class DecodeWays {
    public static int decodeWays(String s,int i)
    {
        if(s.length()==i)
        {
            return 1;
        }
        if(s.charAt(0)=='0')
            return 0;
        int ways=decodeWays(s,i+1);
        if(i+1<s.length())
        {
            int nums=(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
            if(nums>=10&&nums<=26)
            {
                ways+=decodeWays(s,i+2);
            }
        }
        return ways;
    }
    public static void main(String[] args) {

        String s="226";
        System.out.println(decodeWays(s,0));
    }
}




//
//For LeetCode 91 — Decode Ways, the best approach is Dynamic Programming (DP). Let's understand the logic first, without code.
//        1. Understand the main idea
//For each digit, you have two possible choices:
//        1. Take one digit: If it is between 1 and 9, it can represent a letter.
//2. Take two digits: If the two-digit number is between 10 and 26, it can represent a letter.
//Your job is to count all valid decoding possibilities.
//2. Example: s = "226"
//Choice 1: Take one digit at a time
//2 | 2 | 6 → B B F
//
//Choice 2: Take the first two digits
//22 | 6 → V F
//
//Choice 3: Take the last two digits
//2 | 26 → B Z
//
//Total valid decodings