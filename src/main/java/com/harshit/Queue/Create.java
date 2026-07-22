package com.harshit.Queue;

public class Create {
    //create queue using array
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front ;
        Queue(int n)
        {
            arr =new int[n];
            size=n;
             rear=-1;
        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
        public void add(int data)
        {
            if(rear==arr.length-1)
            {
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
            return ;
        }
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("empty queue");
                return -1;
            }
            int front =arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

    }

    static void main() {
        Queue q =new Queue(5);
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);
    }
}
