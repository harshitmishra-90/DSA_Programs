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
       public static int diameter(node root)  //O(n^2)
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
//       public static boolean isIdentical(node root,node subroot)
//       {
//           if(root ==null && subroot ==null)
//               return true;
//           if((root==null&&subroot!=null)||(root!=null&&subroot==null))
//               return false;
//           if(!isIdentical(root.left,subroot.left))
//               return false;
//           if(!isIdentical(root.right,subroot.right))
//               return false;
//           return true;
//       }
       public static boolean isIdentical(node root,node subroot)
       {
           if(root == null && subroot == null)
               return true;

           if(root == null || subroot == null)
               return false;

           if(root.root != subroot.root)
               return false;

           return isIdentical(root.left, subroot.left)
                   && isIdentical(root.right, subroot.right);
       }
       public static boolean isSubtree(node root,node subroot)
       {
           if(root==null)
           {
               return false;
           }
           if(root.root==subroot.root)
           {
               if(isIdentical(root,subroot))
               {
                   return true;
               }
           }
           boolean leftans =isSubtree(root.left,subroot);
           boolean rightans=isSubtree(root.right,subroot);
           return leftans||rightans;
       }

   }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        node root=tree.buildtree(node);
        System.out.println(root.root);
        System.out.println("diameter : "+tree.diameter(root));
        int subnode[] = {
                2,
                5,-1,-1,
                6,-1,-1
        };
        BinaryTree.idx=-1;
        node subroot=tree.buildtree(subnode);
        System.out.println(tree.isSubtree(root,subroot));

    }
}
