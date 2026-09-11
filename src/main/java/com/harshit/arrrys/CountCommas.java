package com.harshit.arrrys;

public class CountCommas {
    public static long commas(long n)
    {
        if(n<=999)
        {
            return 0;
        }
        long start =1000;
        long count =0;
        long commas=1;
        while(start<=n)
        {
            long end =start*1000-1;
            if(end>n)
            {
                end=n;
            }
            count=count+(end-start+1)*commas;
            start=start*1000;
            commas++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
