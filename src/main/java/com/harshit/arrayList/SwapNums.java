package com.harshit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;



public class SwapNums {
    public static void swap(ArrayList<Integer> arr,int indx1,int indx2 )
    {
        int temp=arr.get(indx1);
        arr.set(indx1,arr.get(indx2));
        arr.set(indx2,temp);
        System.out.println("after swaping the array");
        System.out.println(arr);
    }

    static void main() {
        Scanner scn= new Scanner(System.in);
        System.out.println("enter the indx 1 ");
        int x = scn.nextInt();
        System.out.println("enter the indx 2 :");
        int y = scn.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        if(x>=list.size()||y>=list.size()) {
            System.out.println("Indx out of bound");
            return;
        }

        System.out.println("before swaping the arraylist");
        System.out.println(list);
        swap(list,x,y);

    }
    }




