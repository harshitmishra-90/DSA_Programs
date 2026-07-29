package com.harshit.Hashing.HashMap;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean validanagram(String t,String s)
    {
        HashMap<Character,Integer> maps=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            maps.put(s.charAt(i),maps.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char j=t.charAt(i);
            if(maps.get(j)!=null)
            {
                if(maps.get(j)==1)
                {
                    maps.remove(j);
                }
                else {
                    maps.put(j,maps.get(j)-1);
                }
            }
            else{
                return false;
            }
        }
        return maps.isEmpty();

    }
    static void main() {
        String s ="care";
        String t="racce";
        System.out.println(validanagram(t,s));
    }
}
