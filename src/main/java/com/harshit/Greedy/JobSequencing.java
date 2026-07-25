package com.harshit.Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class job{
        int id;
        int profit;
        int deadline;
        public job(int i,int t,int d)
        {
             id=i;
             deadline=t;
             profit=d;
        }
    }
    static void main() {

        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs=new ArrayList<>();
        for(int i=0;i<jobinfo.length;i++) {
            jobs.add(new job(i, jobinfo[i][0], jobinfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
        //sort the object in descending order
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0; i<jobs.size();i++)
        {
            job curr=jobs.get(i);
            if(curr.deadline>time)
            {
                seq.add(curr.id) ;
                time++;
            }
        }
        System.out.println("maximum number of jobs : "+seq.size());
        for(int i=0;i<seq.size();i++)
        {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
