package com.harshit.GFG.Arrays;


//using the moore voting algorithm
public class MajorityElement2 {
    public static void moore(int arr[])
    {
        int count =0;
        int candidate=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(count ==0) {
                candidate = arr[i];

            }if(candidate == arr[i]) {
                count++;
            }
            else
                count--;

        }
        int freq=0;
        for(int nums : arr)
        {
            if(nums==candidate)
                freq++;
        }
        if(freq>arr.length/2)
            System.out.println(candidate);
        else
            System.out.println("no majority element");

    }

    static void main() {
        int arr[]={2,1,1,1,3,4,2,1,1,1};
        moore(arr);

    }
}
