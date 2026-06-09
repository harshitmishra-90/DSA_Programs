package com.harshit.arrrys;

import java.util.Scanner;

public class Linear_Search {
    public static void linearSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key) {
                System.out.println("element found at index : " + i);
                break;
            }
            if(i== arr.length-1)
                System.out.println("element not found");
        }
    }
    public static void StringLinearSearch(String arr[],String key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i].equalsIgnoreCase(key)) {
                System.out.println("element found in index : "+i);
                return;
            }
        }
        System.out.println("element not found");
    }
    static void main() {
        int arr[]={10,20,30,40};
        int key= 50;
        linearSearch(arr,key);
        String fruits[]={"mango","apple","cherry","stawberry"};
        String key1 ="mango";
        StringLinearSearch(fruits,key1);
        StringLinearSearch(fruits,"harshit");
    }
}
//arrays in functions works as pass by reference means if
//we make change in function then original value also changes