package com.harshit.BinaryTreeSearch;

public class LargestSize {
    static class node {
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST, int size,int max,int min )
        {
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxbST=0;
    public static Info largestbST(node root){
        if(root==null)
            return new Info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
       Info leftInfo= largestbST(root.left);
        Info rightInfo= largestbST(root.right);
        int size = leftInfo.size+rightInfo.size+1;
        int min= Math.min(root.data,Math.min(leftInfo.min,rightInfo.max));
        int max=Math.max(root.data,Math.max(leftInfo.max, rightInfo.max));
        if(root.data<= leftInfo.min||root.data>= rightInfo.min)
            return new Info(false,size,max,min);
        if(leftInfo.isBST&& rightInfo.isBST)
        {
            maxbST=Math.max(maxbST,size);
            new Info(true,size,min,max);
        }
        return new Info(false,size ,max,min);
    }
    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(30);
        root.left.left=new node(5);
        root.left.right=new node(20);

        root.right=new node(60);
        root.right.left=new node(45);
        root.right.right=new node(70);
        root.right.right.left=new node(65);
        root.right.right.right=new node(80);
        Info info=largestbST(root);
        System.out.println("largest bST size = "+maxbST);
    }
}
