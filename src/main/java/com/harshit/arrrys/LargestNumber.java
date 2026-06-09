package com.harshit.arrrys;

public class LargestNumber {
    public static void largestNumber(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("maximum element in array is "+max);
    }
    static void main() {

        int arr[]={10,20,50,40,30};
        largestNumber(arr);
    }
}
