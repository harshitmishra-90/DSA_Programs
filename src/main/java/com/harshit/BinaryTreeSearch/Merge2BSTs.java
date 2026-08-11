package com.harshit.BinaryTreeSearch;

import java.util.ArrayList;

public class Merge2BSTs {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }
        public static void getInorder(node root, ArrayList<Integer> arr)
        {
            if(root==null)
                return;
            getInorder(root.left,arr);
            arr.add(root.data);
            getInorder(root.right,arr);
        }
        public static node mergebSST(node root1,node root2)
        {
            ArrayList<Integer>arr1=new ArrayList<>();
            getInorder(root1,arr1);
            ArrayList<Integer> arr2=new ArrayList<>();
            getInorder(root2,arr2);
            int i=0,j=0;
            ArrayList<Integer> finalArr =new ArrayList<>();
            while(i< arr1.size()&&j< arr2.size())
            {
                if(arr1.get(i)<arr2.get(j))
                {
                    finalArr.add(arr1.get(i));
                    i++;
                }
                else
                {
                    finalArr.add(arr2.get(j));
                    j++;
                }
            }
            while(i<arr1.size()) {
                finalArr.add(arr1.get(i));
                i++;
            }

            while(j<arr1.size()) {
                finalArr.add(arr2.get(j));
                j++;
            }
            //sorted arrayList--->balnced bST
            return createbST(finalArr,0,finalArr.size()-1);
        }
        public static node createbST(ArrayList<Integer> arr,int str,int end)
        {
            if(str>end)
                return null;
            int mid=(str+end)/2;
            node newnode=new node(arr.get(mid));
            newnode.left=createbST(arr,str,mid-1);
            newnode.right=createbST(arr,mid+1,end);
            return newnode;
        }

        public static void preOrder(node root)
        {
            if(root==null)
                return;
            System.out.println(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void main(String[] args) {
            node root1=new node(2);
            root1.left=new node(1);
            root1.right=new node(4);

            node root2=new node(9);
            root2.left=new node(3);
            root2.right=new node(12);

            node root =mergebSST(root1,root2);
            preOrder(root);
        }
    }

