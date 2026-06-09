package com.harshit.arrrys;


import java.sql.SQLOutput;

public class ReverseArrays {
public static int[] Reverse(int arr[]){
    int a=0;
    int b=arr.length-1;
    while(a<b){
        //swap
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        a++;
        b--;
    }
    return arr;
}
    static void main() {
        int arr[]={10,25,30,70};
        System.out.println("BEFORE reverse");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        Reverse(arr);
        System.out.println("after reverse");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

}

