package com.harshit.DyanmicProgramming;

public class CatalanNumber {
    public static int catalanNumber(int n) {
        if (n == 0 || n == 1)
            return 1;
        int ans=0;
        for (int i = 0; i < n; i++) {
           ans+=catalanNumber(i)+catalanNumber(n-i-1);
        }
        return ans;
    }
    //using memoization
    public static int cat(int n,int dp[])
    {
        if (n == 0 || n == 1)
            return 1;
        int ans=0;
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        for (int i = 0; i < n; i++) {
            ans+=cat(i,dp)+cat(n-i-1,dp);
        }
        return dp[n]=ans;
    }
    public static void main(String[] args) {
        int n=4;
        int[] dp=new int[n+1];
        System.out.println(cat(n,dp));
    }
}
