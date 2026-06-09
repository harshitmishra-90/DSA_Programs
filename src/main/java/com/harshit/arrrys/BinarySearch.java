package com.harshit.arrrys;

public class BinarySearch {
    public static int binarySearch(int arr[],int key,int LIndex,int HIndex){
        int start =LIndex;
        int end =HIndex;
        int mid = (LIndex+HIndex)/2;
        if(start>end)
            return -1;
        if(arr[mid]==key)
        {
            return mid;
        } else if(key>arr[mid])
        {
            start=mid+1;
        return binarySearch(arr, key,start,end);
        }
        else{
            end=mid-1;
            return binarySearch(arr, key, LIndex, end);
        }

    }

    static void main() {
        int arr[]={1,2,4,8,10,11};
        int key =10;
        System.out.println("element is present in index "+binarySearch(arr,key,0, arr.length-1));

    }
}
