package com.harshit.BinaryTree;

public class MInDIstance {
    //minimum distance between nodes
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
        public static node lca(node root,int n1,int n2)
        {
            if(root==null)
                return null;
            if(root.data==n1||root.data==n2)
                return root;
            node left =lca(root.left,n1,n2);
            node right=lca(root.right,n1,n2);
            if(left==null)
                return right;
            if(right==null)
                return left;
            return root;
        }
        public static int lcaDist(node root,int n)
        {
            if(root==null)
                return -1;
            if(root.data==n)
                return 0;
            int leftDis=lcaDist(root.left,n);
            int rightDis=lcaDist(root.right,n);
            if(leftDis==-1&&rightDis==-1)
            {
                return -1;
            }
            else if(leftDis==-1)
                return rightDis+1;
            else
                return leftDis+1;
        }
        public static int minDist(node root,int n1,int n2)
        {
            node lca=lca(root,n1,n2);
            int dist1=lcaDist(lca,n1);
            int dist2=lcaDist(lca,n2);
            return dist1+dist2;
        }

        public static void main(String[] args) {
            node root=new node(1);
            root.left=new node(2);
            root.right=new node(3);
            root.left.left=new node(4);
            root.left.right=new node(5);
            root.right.left=new node(6);
            root.right.right=new node(7);
            int n1=2,n2=5;
            System.out.println(minDist(root,n1,n2));

        }
    }


