package com.harshit.arrrys;

// a continous part of array
public class printSubarrays {

    static void main() {
        int arr[]={2,4,6,8,10};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }

        }
    }
}
