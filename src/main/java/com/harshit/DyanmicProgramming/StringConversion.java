package com.harshit.DyanmicProgramming;

public class StringConversion {
    public static void stringConversion(String str1,String str2)
    {
        int m=str1.length();
        int n=str2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else {
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        int del=m-dp[m][n];
        int insertion =n-dp[m][n];
        System.out.println("no. of deletion operation :"+ del);
        System.out.println("no. of insertion operation" +insertion);
    }
    public static void main(String[] args) {
        String str1="abcdef";
        String str2="aceg";

        stringConversion(str1,str2);
    }
}
