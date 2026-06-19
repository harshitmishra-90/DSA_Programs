package com.harshit.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {


    static void main() {
        ArrayList<Integer>arr =new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(2);
        arr.add(-1);
        arr.add(2);
        System.out.println("arraylist before sorting " +arr);

        Collections.sort(arr);
        System.out.println("arraylist after sorting in ascending order : "+arr);

        //decending order
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("arraylist after sorting in decending order : "+ arr);

    }
}
