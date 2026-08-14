package com.harshit.BinaryTree;

public class Path_sumIII {
    static class node{
        int val;
        node left;
        node right;
        node(int data)
        {
            this.val=data;
        }
    }
    public static int pathSum(node root, int targetSum) {
        if(root==null)
            return 0;
        return countsum(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
    public static int countsum(node root,long targetsum)
    {
        if(root==null)
            return 0;
        int count =0;
        if(root.val==targetsum)
        {
            count++;
        }
        count+=countsum(root.left,targetsum-root.val);
        count+=countsum(root.right,targetsum-root.val);
        return count;
    }

    public static void main(String[] args) {

    }
}
