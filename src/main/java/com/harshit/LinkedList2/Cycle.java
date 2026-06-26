package com.harshit.LinkedList2;


//dectecting the loop/cycle ;
public class Cycle {

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
       Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;

    }

    static void main() {

    }
}
