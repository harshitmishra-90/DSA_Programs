package com.harshit.BinaryTreeSearch;

public class DeleteNode {
    static class node{
        int data ;
        node left;
        node right ;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static node insert(node root,int val)
    {
        if(root==null) {
            root = new node(val);
            return root;
        }
        if(root.data>val)
            root.left=insert(root.left,val);
        else
            root.right=insert(root.right,val);
        return root;
    }
    public static node deleteNode(node root,int val)
    {
        if(root.data<val)
        {
            root.right=deleteNode(root.right,val);
        } else if (root.data>val)
        {
            root.left=deleteNode(root.left,val);
        }
        else {
            //having 0zero child
            if (root.left == null && root.right == null)
                return null;
            //having one child
            if(root.left==null)
                return root.right;
            else if(root.right==null)
            {
                return root.left;
            }
            //having two choldren
                node IS =findInroderSuccessor(root.right);
                root.data=IS.data;
              root.right =  deleteNode(root.right,IS.data);
        }
        return root;
    }

    public static node findInroderSuccessor(node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    public static void Inorder(node root)
    {
        if(root==null)
            return;
        Inorder(root.left);
        System.out.print(root.data+ " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        node root=null;
        for(int i=0;i< value.length;i++)
        {
            root=insert(root,value[i]);
        }
        Inorder(root);
       root= deleteNode(root,4);
        System.out.println();
        Inorder(root);
    }
}
