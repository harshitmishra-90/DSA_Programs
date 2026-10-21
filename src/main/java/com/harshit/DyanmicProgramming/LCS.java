package com.harshit.DyanmicProgramming;

public class LCS {
    public static int subSequence(String str1,String str2,int m,int n,int[][] dp) {
        if (m == 0 || n == 0)
            return 0;
        if (dp[m][n]!=-1)
            return dp[m][n];
        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return dp[m][n] = subSequence(str1, str2, m - 1, n - 1, dp) + 1;
        else {
            int ans1 = subSequence(str1, str2, m - 1, n, dp);
            int ans2 = subSequence(str1, str2, m, n - 1, dp);
            return dp[m][n] = Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String str1="abcdeg";
        String str2="abedg";
        int[][] dp= new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<str1.length()+1;i++)
        {
            for(int j=0;j<str2.length()+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(subSequence(str1,str2,str1.length(),str2.length(),dp));
    }
}



//Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
//
//A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
//
//For example, "ace" is a subsequence of "abcde".
//A common subsequence of two strings is a subsequence that is common to both strings.
//
//
//
//        Example 1:
//
//Input: text1 = "abcde", text2 = "ace"
//Output: 3
//Explanation: The longest common subsequence is "ace" and its length is 3.
//Example 2:
//
//Input: text1 = "abc", text2 = "abc"
//Output: 3
//Explanation: The longest common subsequence is "abc" and its length is 3.
//Example 3:
//
//Input: text1 = "abc", text2 = "def"
//Output: 0
//Explanation: There is no such common subsequence, so the result is 0.