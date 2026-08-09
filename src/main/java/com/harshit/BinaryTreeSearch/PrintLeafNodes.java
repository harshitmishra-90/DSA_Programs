package com.harshit.BinaryTreeSearch;

import java.util.ArrayList;

public class PrintLeafNodes {
    //pg 67
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

    public static void Inorder(node root)
    {
        if(root==null)
            return;
        Inorder(root.left);
        System.out.print(root.data+ " ");
        Inorder(root.right);
    }
    public static void printleaf(node root, ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.data);
        if(root.left==null&&root.right==null)
        {
            System.out.println(arr);
            arr.remove(arr.size()-1);
            return;
        }
        printleaf(root.left,arr);
        printleaf(root.right,arr);
        arr.remove(arr.size()-1);
        return;

    }
    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        node root=null;
        for(int i=0;i< value.length;i++)
        {
            root=insert(root,value[i]);
        }
        Inorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
        ArrayList<Integer> arrayList=new ArrayList<>();
        printleaf(root,arrayList);
    }
}
