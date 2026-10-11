package com.harshit.DyanmicProgramming;

import java.util.Arrays;

public class ClimbingStairs {

    // using Dynamic programming memoization
    public static int countways(int n, int[] f)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(f[n]!=-1)
        {
            return f[n];
        }
        f[n]=countways(n-1,f)+countways(n-2,f);
        return f[n];
    }

    //simple recursion
    public static int countWays(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        return countWays(n-1)+countWays(n-2);
    }

    //tabulation
    public static int countwaystab(int n)
    {
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                dp[i]=dp[i-1]+0;
            }
            else{
                dp[n]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {

        int n=5;
        int[] f=new int[n+1];
        Arrays.fill(f,-1);
        System.out.println(countways(n,f));
    }
}
