package com.harshit.arrayList;

import java.util.ArrayList;
//container with most water

public class Container {
public static void store_water(ArrayList<Integer> arr){

    //brute force
    int maxx=0;
    for(int i =0;i<arr.size();i++)
    {
        for(int j=i+1;j<arr.size();j++)
        {
            int curr=Math.min(arr.get(i),arr.get(j));
            int height =(j-i)*curr;
            maxx=Math.max(maxx,height);
        }
    }
    System.out.println(maxx);


}

    static void main() {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1); list.add(8);
        list.add(6); list.add(2);
        list.add(5); list.add(4);
        list.add(8); list.add(3);
        list.add(7);
        store_water(list);

    }
}
