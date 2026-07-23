package com.harshit.Greedy;

import java.util.ArrayList;

public class MaxActivity {
    //page no. 47
    static void main() {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //end time basic sorted
        int maxAct=0;
        ArrayList<Integer> ans =new ArrayList<>();
         maxAct=1;
         int lastend =end[0];

        for(int i=1;i<end.length;i++)
        {
            if(start[i]>=lastend)
            {
                maxAct++;
                lastend=end[i];
                ans.add(i);
            }
        }


    }
}
