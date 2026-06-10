package com.harshit.Backtracking;
//find and print all subsets of a given string
//such as for "abc"
//so subsets of abc is a,b,c,ab,ac,bc,abc,null
//string length n then subsets will be 2^n subsets
public class findSubsets {

    public static void findsubsets(String str,String ans,int i){
         //base case
        if(i==str.length())
        {
            if(ans.length()==0)
                System.out.println("null");
            else
                 System.out.println(ans);
            return;
        }

        //yes choice
        findsubsets(str,ans+str.charAt(i),i+1);
        //no choice
        findsubsets(str,ans,i+1);
    }
    static void main() {

        String str="abc";
        findsubsets(str,"",0);
    }
}


//backtracking mostly used in choice yes/no
   //tc O(2^n*n)