package com.harshit.BinaryTree;

//transform to sum tree
public class transform {
    static class node {
        int data;
        node left;
        node right;

        node(int root) {
            this.data = root;
            this.left = null;
            this.right = null;
        }
    }
        public static int transform(node root)
        {
            if(root==null)
            {
                return 0;
            }
            int leftdata=transform(root.left);
            int rightdata=transform(root.right);
            int data=root.data;
            int leftval=root.left==null?0:root.left.data;
            int rightval=root.right==null?0:root.right.data;
                root.data = leftval + leftdata + rightdata + rightval;
            return data;
        }
    public static void preoder(node root)
    {
        //parent node
        //left node
        //right node
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preoder(root.left);
        preoder(root.right);
    }

        public static void main(String[] args) {
            node root=new node(1);
             root.left=new node(2);
             root.right=new node(3);
             root.left.left=new node(4);
             root.left.right=new node(5);
             root.right.right=new node(7);
             root.right.left=new node(6);
            transform(root);
            preoder(root);

        }

}
