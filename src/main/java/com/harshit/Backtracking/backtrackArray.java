package com.harshit.Backtracking;


public class backtrackArray {
    public static void changearray(int arr[],int i,int val){

        //base case
        if(i==arr.length) {
            printarr(arr);
            return;
        }
        arr[i]=val;
        changearray(arr,i+1,val+10);
        arr[i]=arr[i]-5;
    }
public static void printarr(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    static void main() {
        int arr[]=new int[5];

        changearray(arr,0,10);
        printarr(arr);
    }

}
