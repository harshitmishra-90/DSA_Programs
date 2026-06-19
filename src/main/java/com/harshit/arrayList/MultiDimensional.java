package com.harshit.arrayList;

import java.util.ArrayList;

public class MultiDimensional {
   public static void main() {
       ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
       ArrayList<Integer> list1=new ArrayList<>();
       ArrayList<Integer> list2=new ArrayList<>();

       mainlist.add(list1);
        for(int i=0;i<5;i++) {
            list1.add(i);
            list2.add(i*2);
        }
       mainlist.add(list2);

       //traversing the arraylist
       for (ArrayList<Integer> curr : mainlist) {
           // System.out.println(curr);
           for (Integer integer : curr) {
               System.out.print(integer + " ");
           }
           System.out.println();
       }
       System.out.println(mainlist);
    }
}
