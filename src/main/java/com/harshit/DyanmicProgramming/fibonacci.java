package com.harshit.DyanmicProgramming;



public class fibonacci {
    public static int fibowithDP(int n,int[] f)
    {
        if(n==0||n==1)
        {
            return n;
        }
        if(f[n]!=0)
        {
            return f[n];
        }
        f[n]=fibowithDP(n-1,f)+fibowithDP(n-2,f);
        return f[n];
    }


//    //simple fibonacci without DP
//    public static int fibo(int n)
//    {
//        if(n==0||n==1)
//            return n;
//        return fibo(n-1)+fibo(n-2);
//    }
    public static void main(String[] args) {
        //System.out.println(fibo(10));
        int n=6;
        int[] arr=new int[n+1];
        System.out.println(fibowithDP(n,arr));
    }
}
