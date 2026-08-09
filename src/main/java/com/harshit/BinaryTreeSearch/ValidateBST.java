package com.harshit.BinaryTreeSearch;

public class ValidateBST {
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

    public static void main(String[] args) {

        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        Inorder(root);
        System.out.println();
        System.out.println(validateBST(root,null,null));
    }
}