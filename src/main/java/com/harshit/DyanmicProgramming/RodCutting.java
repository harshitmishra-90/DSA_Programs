package com.harshit.DyanmicProgramming;

public class RodCutting {
    public static int rodCutting(int len[],int price[],int tolLen)
    {
        int n =len.length;
        int dp[][]=new int[n+1][tolLen+1];
        //intialize
        for(int i=0;i<n;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<tolLen;i++)
        {
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<tolLen+1;j++){
                //valid
                if(len[i-1]<=j)
                {
                    dp[i][j]=Math.max((price[i-1]+dp[i][j-len[i-1]]),dp[i-1][j]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][tolLen];
    }
    public static void main(String[] args) {
        int length[] ={1,2,3,4,5,6,7,8};
        int value[]={1,5,8,9,10,17,17,20};
        int tolRod=8;
        System.out.println(rodCutting(length,value,tolRod));
    }
}
