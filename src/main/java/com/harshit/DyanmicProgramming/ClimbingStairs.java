package com.harshit.DyanmicProgramming;

public class ClimbingStairs {
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
        if(f[n]!=0)
        {
            return f[n];
        }
        f[n]=countways(n-1,f)+countways(n-2,f);
        return f[n];
    }
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
    public static void main(String[] args) {

        int n=5;
        int[] f=new int[n+1];
        System.out.println(countways(n,f));
    }
}
