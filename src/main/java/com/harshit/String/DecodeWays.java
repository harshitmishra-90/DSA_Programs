package com.harshit.String;


//leetcode question no. 91
public class DecodeWays {
    public static void main(String[] args) {

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