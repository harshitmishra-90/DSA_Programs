package com.harshit.BinaryTree;

public class Diameter {

   static class node{
       int root;
       node left;
       node right;
       node(int data)
       {
           this.root=data;
           this.left=null;
           this.right=null;
       }
   }
   static class BinaryTree{
       static int idx=-1;
       public static node buildtree(int node[])
       {
           idx++;
           if(node[idx]==-1)
               return null;
           node newnode=new node(node[idx]);
           newnode.left=buildtree(node);
           newnode.right=buildtree(node);
           return newnode;
       }
       public static int height(node root)
       {
           if(root==null)
               return 0;
           int lh=height(root.left);
           int rh=height(root.right);
           return lh+rh+1;
       }
       public static int diameter(node root)
       {
           if(root==null)
               return 0;
           int ld=diameter(root.left);
           int lh=height(root.left);
           int rd=diameter(root.right);
           int rh=height(root.right);
           int self=lh+rh+1;

           return Math.max(self,Math.max(ld,rd));
       }

   }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        node root=tree.buildtree(node);
        System.out.println(root.root);
        System.out.println("diameter : "+tree.diameter(root));

    }
}
