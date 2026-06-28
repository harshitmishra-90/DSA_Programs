package com.harshit.GFG.Sorting;

public class sorting {
        public static void swap(int arr[],int a,int b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        public static void sort012(int[] arr) {
            // code here
            int high=arr.length-1;
            int low =0,mid=0;
            while(mid<=high)
            {
                if(arr[mid]==1)
                    mid++;
                else if(arr[mid]==0)
                {
                    swap(arr,mid,low);
                    mid++;
                    low++;
                }
                else
                {
                    swap(arr,mid,high);
                    high--;
                }
            }
        }
    static void main() {
            int arr[]={1,0,2,1,0,2,1};
            sort012(arr);

    }
}




//Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
//Note: You need to solve this problem without utilizing the built-in sort function.
//
//        Examples:
//
//Input: arr[] = [0, 1, 2, 0, 1, 2]
//Output: [0, 0, 1, 1, 2, 2]
//Explanation: 0s, 1s and 2s are segregated into ascending order.