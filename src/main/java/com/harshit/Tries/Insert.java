package com.harshit.Tries;

public class Insert {
    static class node {
        node[] children;
        boolean endofwords;
        node()
        {
            this.children=new node[26];
        }
    }
    public static node root=new node();
    public static void insert(String word)
    {
        node curr =root;
        for(int level=0;level<word.length();level++)
        {
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new node();
            }
            curr=curr.children[idx];
        }
        curr.endofwords=true;

    }
    public static void main(String[] args) {
        String words[]={"the ","a","there","their","any","thee"};
    }
}
