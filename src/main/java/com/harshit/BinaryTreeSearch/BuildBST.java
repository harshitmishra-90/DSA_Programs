package com.harshit.BinaryTreeSearch;

public class BuildBST {
    static class node {
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
        }

    }
    public static node insert(node root,int val){
        if(root==null)
        {
            root=new node(val);
            return root;
        }
        if(root.data>val)
        {
          root.left =  insert(root.left,val);
        }
        if(root.data<val)
        {
           root.right= insert(root.right,val);
        }
        return root;
    }
    public static void Inorder(node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }
        Inorder(root);


    }
}
