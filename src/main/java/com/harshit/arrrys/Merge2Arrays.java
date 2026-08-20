package com.harshit.arrrys;

public class Merge2Arrays {
    public static void merge(int[] A, int m, int[] B, int n) {
        int idx=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0&&j>=0)
        {
            if(A[i]>B[j])
            {
                A[idx]=A[i];
                A[i]=0;
                i--;
                idx--;
            }
            else{
                A[idx]=B[j];
                idx--;
                j--;
            }
        }
        while(j>=0)
        {
            A[idx]=B[j];
            idx--;
            j--;
        }
    }
    public static void main(String[] args) {
        int A[]={1,2,3,0,0,0};
        int B[]={4,7,6};
        merge(A,3,B,3);
    }

}
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//
//
//
//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//        Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
