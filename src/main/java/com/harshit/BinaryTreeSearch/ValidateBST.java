package com.harshit.BinaryTreeSearch;

public class ValidateBST {
    //code for the ValidateBST, MirrorBST and Balance the bst
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static node insert(node root, int val) {
        if (root == null) {
            root = new node(val);
            return root;
        }
        if (root.data > val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
    }

    public static void Inorder(node root) {
        if (root == null)
            return;
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static boolean validateBST(node root, node max, node min) {
        if (root == null)
            return true;
        if (min != null && root.data <= min.data)
            return false;
        else if (max != null && root.data >= max.data) {
            return false;
        }
        return validateBST(root.left, root, min) && validateBST(root.right, max, root);
    }
    public static node Mirror(node root)
    {
        if(root==null)
            return null;
        node leftSide =Mirror(root.left);
        node rightSide=Mirror(root.right);
        root.left=rightSide;
        root.right=leftSide;
        return root;
    }

//    you are given the root of a binary search tree (BST) and an integer val.
//
//    Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
//
//
//
//    Example 1:
//
//
//    Input: root = [4,2,7,1,3], val = 2
//    Output: [2,1,3]
    public node searchBST(node root, int val) {
        if(root==null)
            return null;
        if(root.data==val)
        {
            return root;
        }
        if(val<root.data)
            return searchBST(root.left,val);
        else
            return searchBST(root.right,val);

    }

    public static void main(String[] args) {

        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        Inorder(root);
        System.out.println();
        System.out.println(validateBST(root,null,null));
        Mirror(root);
        Inorder(root);
    }
}