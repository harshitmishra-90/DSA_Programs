package com.harshit.LinkedList2;
import com.harshit.LinkedList.LinkedList.Node;
public class TwinsSum {
    public static int pairsum(Node head){
        //find the mid node
        Node slow =head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev =null;
        Node curr=slow;
        while(curr!=null)
        {
            Node next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        int maxSum=0;
        Node first=head;
        Node Second=prev;
        while(Second!=null)
        {
            maxSum=Math.max(maxSum,(first.data+Second.data));
            first=first.next;
            Second=Second.next;
        }

        return maxSum;
    }

    static void main() {

    }

}
