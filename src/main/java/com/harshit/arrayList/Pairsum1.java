package com.harshit.arrayList;
import java.util.ArrayList;
public class Pairsum1 {
    //using 2 pointer approach
    public static boolean pairsum(ArrayList<Integer> arr,int target)
    {
        int lp=0;
        int rp=arr.size()-1;
        while(lp<rp) {
            int sum = arr.get(lp) + arr.get(rp);
            if (sum == target)
                return true;

            if (sum > target)
                rp--;
            else
                lp++;
        }
        return false;
    }
    static void main() {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        System.out.println( pairsum(arr,32));
    }
}
