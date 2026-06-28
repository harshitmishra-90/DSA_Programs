package com.harshit.LinkedList2;

import java.util.LinkedList;

public class ZigZag {
    public static node head;
    public static class node{
        int data;
        node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("no element is present");
            return ;
        }
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public static node midnode(){
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public void zigzag(){
        node mid=midnode();
        node curr=mid.next;
        mid.next=null;
        node prev=null;

        node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;
        node left=head;
        node nextL;
        node nextR;
        while(left!=null&&right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;

        }
    }

    static void main() {

    ZigZag ll=new ZigZag();
 //   ll.add(40);
    ll.add(30);
    ll.add(20);
    ll.add(10);

    ll.print();
    ll.zigzag();
    ll.print();


    }
}
