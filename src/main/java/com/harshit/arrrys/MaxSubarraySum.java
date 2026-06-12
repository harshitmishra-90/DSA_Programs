package com.harshit.arrrys;

public class MaxSubarraySum {
    static void main() {
        int arr[]={1,-2,6,-1,3};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j< arr.length;j++){
                int sum =0;
                for(int k=i;k<=j;k++)
                {
                    //System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    if(sum>max)
                        max=sum;
                }
            }
        }
        System.out.println("max :"+max);
    }
}
