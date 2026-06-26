package com.harshit.LinkedList;

public class Palindrome {

    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data)
    {
        Node newnode =new Node(data);
        newnode.next=head;
        head=newnode;
    }
    //slow fast apporach
    public Node findMid()
    {
        Node slow =head;
        Node fast =head;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Boolean checkpalindrome()
    {
        if(head==null||head.next==null)
            return true;
//step-1 find mid node
        Node mid=findMid();
        //step-2 reverse the 2nd half node;
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev; //right half head;
        Node left=head;
        //check wheather left half & right half are equal or not
        while(right!=null)
        {
            if(left.data!=right.data)
                return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public void print(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("mull");
    }

    static void main() {

        Palindrome ll=new Palindrome();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.print();
        System.out.println(ll.checkpalindrome());
    }

}
