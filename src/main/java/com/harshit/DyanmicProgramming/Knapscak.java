package com.harshit.DyanmicProgramming;

// 0-1 knapsack using the memorization
public class Knapscak {

        // code here

        public int solver(int[] val,int[] wt,int W,int n,int dp[][])
        {
            if(W==0||n==0)
            {
                return 0;
            }
            if(dp[n][W]!=-1)
            {
                return dp[n][W];
            }
            if(W>=wt[n-1])
            {
                int ans1=val[n-1]+solver(val,wt,W-wt[n-1],n-1,dp);
                int ans2=solver(val,wt,W,n-1,dp);
                dp[n][W]=Math.max(ans1,ans2);
                return dp[n][W];
            }
            else{
                dp[n][W]=solver(val,wt,W,n-1,dp);
                return dp[n][W];
            }

        }
        public int knapsack(int W, int val[], int wt[]) {
            int[][] dp =new int[val.length+1][W+1];
            for(int i=0;i<dp.length;i++)
            {
                for(int j=0;j<dp[0].length;j++)
                {
                    dp[i][j]=-1;
                }
            }
            return solver(val,wt,W,val.length,dp);
        }
    }


