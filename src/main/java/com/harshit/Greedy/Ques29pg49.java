package com.harshit.Greedy;

import java.util.Arrays;
import java.util.Comparator;
//maximum length chain of pair
public class Ques29pg49 {
    static void main() {
        int pairs[][]={{5,24},{30,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int ans=1;
        int lastEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++)
        {
            if(pairs[i][0]>lastEnd)
            {
                ans++;
                lastEnd=pairs[i][1];
            }
        }
        System.out.println("max length chain of pairs are : "+ans);
        for (int i = 0; i < pairs.length; i++) {
            for (int j = 0; j < pairs[i].length; j++) {
                System.out.print(pairs[i][j] + " ");
            }
            System.out.println();
        }
    }
}
