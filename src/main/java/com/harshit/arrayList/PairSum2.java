package com.harshit.arrayList;

import java.util.ArrayList;

public class PairSum2 {
//find if any pair ina sorted & rotated arraylist has a target sum



    public static boolean sum(ArrayList<Integer> arr , int target)
    {
        int n=arr.size();
        int lp=0;
        int rp=arr.size()-1;
        //find the pivot element means find lp and rp
        for(int i=0;i<arr.size()-1 ;i++)
        {
            if(arr.get(i)>arr.get(i+1))
            {
                lp=i+1;
                rp=i;
            }
        }
        while(lp!=rp)
        {

            int sum = arr.get(lp) + arr.get(rp);
            if (sum == target)
                return true;

            if (sum > target)
                rp=(n+rp-1)%n;
            else
                lp=(lp+1)%n;
        }

        return false ;

    }
    static void main() {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println( sum(arr,16));
    }

}
