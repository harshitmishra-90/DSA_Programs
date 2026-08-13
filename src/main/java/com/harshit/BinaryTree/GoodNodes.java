package com.harshit.BinaryTree;
//Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
//
//Return the number of good nodes in the binary tree.
//
//
//
//Example 1:
//
//
//
//Input: root = [3,1,4,3,null,1,5]
//Output: 4
//Explanation: Nodes in blue are good.
//        Root Node (3) is always a good node.
//Node 4 -> (3,4) is the maximum value in the path starting from the root.
//        Node 5 -> (3,4,5) is the maximum value in the path
//Node 3 -> (3,1,3) is the maximum value in the path.

//pg 71
public class GoodNodes {
    static class node{
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
        }
    }
    //static int count =0;
    public static int countGoodNode(node root,int maxnode)
    {
        if(root==null){
            return 0;
        }
        int count =0;
        if(root.data>=maxnode)
        {
            maxnode=root.data;
            count=1;
        }
        count+=countGoodNode(root.left,maxnode);
        count+=countGoodNode(root.right,maxnode);
        return count;
    }

    public static void main(String[] args) {
        node newnode=new node(3);
        newnode.left=new node(1);
        newnode.left.left=new node(3);
        newnode.right=new node(4);
        newnode.right.left=new node(1);
        newnode.right.right=new node(5);

    }
}
