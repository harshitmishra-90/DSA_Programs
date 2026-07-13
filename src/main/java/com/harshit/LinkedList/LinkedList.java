package com.harshit.LinkedList;

public class LinkedList {
    public static Node head;
    public static Node tail;
    public static class Node{
        int data;
      public  Node next;
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
    public void removeFirst()
    {
        if(head==null||head.next==null)
        {
            head=tail=null;
            System.out.println("no element in linkedlist");
            return;
        }

        head =head.next;
    }
    public void removeLast()
    {
        if(head==null||head.next==null)
        {

            head=tail=null;
            System.out.println("no element ");
            return ;
        }
        Node temp=head;
        if(temp.next.next==null)
        {
            temp.next=null;
            tail=temp;
            return;

        }
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    public int search(int key)
    {
        int indx=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
                return indx;
            temp=temp.next;
            indx++;
        }

        return -1;
    }
    public int helper(Node head ,int key)
    {
        if(head==null)
            return -1;
        if(head.data==key)
            return 0;
        int indx=helper(head.next,key);
        if(indx==-1)
        {
            return -1;
        }
        return indx+1;
    }
    public int RecursiveSearch(int key)
    {
        Node temp=head;
        return helper(temp,key);
    }
    public void reverse()
    {


        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
       head=prev;
    }
    public void removeNthNode(int indx)
    {
        if(head==null)
        {
            return ;
        }
        if(indx==0)
        {
            head=head.next;
            return ;
        }
        Node temp=head;
        int n=1;
        while(temp!=null&&n<indx)
        {
            temp=temp.next;
            n++;
        }
        temp.next=temp.next.next;
        return ;
    }
    public int size() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public void removeNthNode1(int indx)
    {
        //remove the nth node from the end
        if(head==null)
        {
            return;
        }
        int n=size();
        if(n==indx)
        {
            head=head.next ;
            return;
        }
        int i=0;
        Node temp=head;
        while(temp!=null&&i<n-indx-1)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return;
    }
    static void main() {

        LinkedList ll =new LinkedList();
        ll.addFirst(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.print();
        ll.addMiddle(1,15);
        ll.print();
        System.out.println("element is present in index "+ll.search(20));
        System.out.println("element is present in index "+ll.RecursiveSearch(20));
        ll.reverse();
        ll.print();
        ll.removeNthNode1(3);
        ll.print();
    }
}
