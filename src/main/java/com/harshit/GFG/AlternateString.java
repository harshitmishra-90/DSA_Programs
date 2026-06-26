package com.harshit.GFG;

public class AlternateString {
    public static String atlernate(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
            i++;
        }
        while (i < word1.length()) {
            str.append(word1.charAt(i));
            i++;
        }
        while (i < word2.length()) {
            str.append(word2.charAt(i));
            i++;
        }

        return str.toString();
}
    static void main() {
    String a="abcd";
    String b="12345";
        System.out.println(atlernate(a,b));
    }
}
