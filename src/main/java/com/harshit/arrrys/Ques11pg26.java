//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.


package com.harshit.arrrys;

public class Ques11pg26 {
    public static int[] arr(int arr[])
    {
        int[] ans=new int[arr.length];
        for(int i=1;i<ans.length;i++)
        {
            ans[i]=ans[i-1]*arr[i-1];
        }
        int suffix=1;
        for(int i=arr.length-2;i>=0;i--)
        {
            suffix=suffix*arr[i+1];
            ans[i]=ans[i]*suffix;
        }
        return ans;
    }
    static void main() {

       int nums[]={1,2,3,4};
        System.out.println(arr(nums));

    }
}
