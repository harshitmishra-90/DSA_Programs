package com.harshit.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    static void main() {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int count=0;
        int amount=120;
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i]<=amount)
            {
                while(coins[i]<=amount)
                {
                    count++;
                    amount=amount-coins[i];
                    arrayList.add(coins[i]);
                }
            }
            if(amount==0){
                break;
            }
        }
        System.out.println(count);
        System.out.println(arrayList);

    }
}
