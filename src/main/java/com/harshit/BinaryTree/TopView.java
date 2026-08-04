package com.harshit.BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
    static class node{
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
            this.left =null;
            this.right=null;
        }
    }
    static class info{
        node node;
        int hd;
        public info(node node,int hd)
        {
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topview(node root)
    {
        Queue<info> queue =new LinkedList<>();
        HashMap<Integer,node> maps =new HashMap<>();
        int min=0;
        int max=0;
        queue.add(new info(root,0));
        queue.add(null);
        while(!queue.isEmpty())

        {
            info curr =queue.remove();
            if(curr==null)
            {
                if(queue.isEmpty())
                    break;
                else
                    queue.add(null);
            }
            if(!maps.containsKey(curr.hd))
            {
                maps.put(curr.hd, curr.node);
            }
            if(curr.node.left!=null)
            {
                queue.add(new info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null)
            {
                queue.add(new info(curr.node.right,curr.hd-1));
                max=Math.max(max,curr.hd+1);
            }

        }
        for(int i=min;i<=max;i++)
        {
            System.out.println(maps.get(i).data);
        }
    }
    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \  / \
            4  5  6  7

         */

        node root =new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.right=new node(6);
        root.right.right=new node(7);

    }
}
