package com.harshit.LinkedList;

public class LinkedList {
    public static Node head;
    public static Node tail;
    public static class Node{
        int data;
        Node next;
        //store the reference or address of node
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
          head=tail=newnode;
          return;
        }
        newnode.next=head;
        head=newnode;

    }
    public void addLast(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        if(head==null)
        {
            System.out.println("no element is present");
            return;
        }
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int indx,int data)
    {
        if(head==null)
        {
            System.out.println("no element is present");
            return;
        }
        int n=1;
        Node curr1=head;
        Node curr2=head.next;
        while(curr2!=null&&n<indx)
        {
            curr1=curr1.next;
            curr2=curr2.next;
            n++;
        }
        Node newNode=new Node(data);
        curr1.next=newNode;
        newNode.next=curr2;
    }

    static void main() {

        LinkedList ll =new LinkedList();
        ll.addFirst(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.print();
        ll.addMiddle(1,15);
        ll.print();
    }
}
