package com.harshit.arrrys;


public class kadene_algorithm {
public static int algo(int arr[]){
    int max=Integer.MIN_VALUE;
    int curr=0;
    for(int i=0;i<arr.length-1;i++)
    {
        curr+=arr[i];
        if(curr<0){
            curr=0;
        }
        if(curr>max)
            max=curr;

    }
    return max;
}



    static void main() {
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(algo(arr));

    }
}
