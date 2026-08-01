package com.harshit.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BulidTree {
    static class node{
        int root;
        node left;
        node right;
        node(int root)
        {
            this.root=root;
            this.left=null;
            this.right=null;
        }
    }
//O(n)
    static class BinaryTree {
        static int idx = -1;

        public static node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;

            node newNode = new node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);

            return newNode;
        }
        public static void preoder(node root)
        {
            //parent node
            //left node
            //right node
            if(root==null) {
                return;
            }
            System.out.print(root.root+" ");
            preoder(root.left);
            preoder(root.right);
        }
        public static void Inorder(node root)
        {
            //left node
            //parent node
            //left node
            if(root==null)
                return;
            Inorder(root.left);
            System.out.print(root.root+" ");
            Inorder(root.right);
        }
        public static void postOrder(node root)
        {
            if(root==null)
            {
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.root+" ");
        }
        public static void levelOrder(node root)
        {
            if(root==null)
            {
                return ;
            }
            Queue<node> queue=new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty()) {
                node currNode = queue.remove();
                if (currNode == null)
                {
                    System.out.println();
                     if (queue.isEmpty()) {
                        break;
                     } else queue.add(null);
                }
                else {
                    System.out.print(currNode.root+" ");
                    if(currNode.left!=null)
                        queue.add(currNode.left);
                    if (currNode.right!=null)
                        queue.add(currNode.right);
                }
            }
        }
    }

    static void main() {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree =new BinaryTree();
        node root =tree.buildtree(node);
        System.out.println(root.root);
        tree.preoder(root);
        System.out.println();
        tree.Inorder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.levelOrder(root);

    }
}
