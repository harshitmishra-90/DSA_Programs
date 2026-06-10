package com.harshit.Backtracking;

//if there are n no.of string then there will be n! permutation
public class permutation {
    public static void findpermutation(String str, String ans) {

        //base case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            char curr = str.charAt(j);
            String str1=str.substring(0,j)+str.substring(j+1);
            findpermutation(str1,ans+curr);
        }
    }

    static void main() {
        String str="abc";
        findpermutation(str,"");
    }
}
