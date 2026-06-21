package com.harshit.arrayList;

import java.util.ArrayList;

public class MonotonicArrayList {
    public static String monotonic(ArrayList<Integer> arr)
    {
        String b="";
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)<=arr.get(i+1)&&b.equalsIgnoreCase("")) {
                b = "monotonic increasing";
            }
            if(arr.get(i)>=arr.get(i+1)&&b.equalsIgnoreCase("")){
                b=" monotonic decreasing";
            }
            if(arr.get(i)>arr.get(i+1)&&b.equalsIgnoreCase("monotonic increasing")){
                return "non-monotonic";
            }

        }

        return b;
    }

    static void main() {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(66);
        arr.add(5);
        System.out.println( monotonic(arr));
    }

}
