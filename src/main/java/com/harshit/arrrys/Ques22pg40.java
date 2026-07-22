package com.harshit.arrrys;

public class Ques22pg40 {
    //brute force approach for shift grid
    public static int[][] shifgrid(int arr[][],int k)
    {
        int m=arr.length;
        int n=arr[0].length;

        while(k-->0)
        {
            int last=arr[m-1][n-1];
            for(int i=m-1;i>=0;i--)
            {
                for (int j=n-1;j>=0;j--)
                {
                    if (i==0&&j==0)
                        continue;
                    else if (j==0) {
                        arr[i][j]=arr[i-1][n-1];
                    }
                    else
                        arr[i][j]=arr[i][j-1];
                }
            }
            arr[0][0]=last;
        }


        return arr;
    }
    static void main() {

    }
}
