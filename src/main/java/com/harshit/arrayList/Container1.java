package com.harshit.arrayList;

import java.util.ArrayList;

public class Container1 {

    //using 2 pointer approach
    public static int store_water(ArrayList<Integer> arr){
        int left=0;
        int right=arr.size()-1;
        int maxx =0;
        while(left<right)
        {
            int curr=Math.min(arr.get(left),arr.get(right));
            int curr_water =(right-left)*curr;
            maxx=Math.max(maxx,curr_water);
            if(arr.get(left)<arr.get(right))
                left++;
            else
                right--;
        }
        return maxx;
    }



    static void main() {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1); list.add(8);
        list.add(6); list.add(2);
        list.add(5); list.add(4);
        list.add(8); list.add(3);
        list.add(7);
        System.out.println(store_water(list));
    }
}
