package com.harshit.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {

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
        public static void LevelOrder(node root,int target ) {
            Queue<node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            int k = 1;
            while (!q.isEmpty()) {

                node curr = q.remove();
                if (curr == null) {
                    k++;
                    if (q.isEmpty())
                        return;
                    else
                        q.add(null);
                } else {
                    if (k == target)
                        System.out.print(curr.data + " ");
                    if (curr.left != null)
                        q.add(curr.left);
                    if (curr.right != null)
                        q.add(curr.right);
                }
            }
        }
            //recursive approach
            public static void KthlevelOrder(node root, int target ,int k)
            {

                if(root==null) {
                    return;
                }
                if(k==target) {
                    System.out.println(root.data);
                    return;
                }
                KthlevelOrder(root.left,target,k+1);
                KthlevelOrder(root.right,target,k+1);
               // KthlevelOrder(root.left, target, k++);
              //  KthlevelOrder(root.right, target, k++);

                //Remember:

//                k++ is post-increment.
//                    It passes the current value of k to the function, then increments the local variable after the call.
//                    Since Java passes primitives (int) by value, the increment does not affect the value inside the recursive call.
            }
            static boolean getpath(node root,int n,ArrayList<node> path)
            {
                path.add(root);
                if(root==null)
                    return false;
                if(root.data==n)
                    return true;
                Boolean foundleft=getpath(root.left,n,path);
                boolean foundright=getpath(root.right,n,path);
                if(foundleft||foundright)
                    return true;
                path.remove(path.size()-1);
                return false;
            }
            public static node lca(node root,int m1,int m2)
            {
                ArrayList<node> arr1=new ArrayList<>();
                ArrayList<node> arr2=new ArrayList<>();
                getpath(root,m1,arr1);
                getpath(root,m2,arr2);
                //last comman ancestor
                int i=0;
                for(;i<arr1.size() && i<arr2.size();i++)
                {
                    if(arr1.get(i)!=arr2.get(i))
                        break;
                }
                node lca=arr1.get(i-1);
                return lca;

            }

        public static void main(String[] args) {
            node root =new node(1);
            root.left=new node(2);
            root.right=new node(3);
            root.left.left=new node(4);
            root.left.right=new node(5);
            root.right.left=new node(6);
            root.right.right=new node(7);
            System.out.println(root.data);
            LevelOrder(root,3);
            System.out.println();
            KthlevelOrder(root,3,1);

        }
}
