package com.harshit.GFG.Strings;

public class ReverseVowel {
public static String swap(String s,int a,int b)
{
    char[] arr = s.toCharArray();

    char temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
    s = new String(arr);
    return s;
}
    public static String reverse(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            while (left<right&&(s.charAt(left)!='a'&&s.charAt(left)!='A'&&s.charAt(left)!='e'&&s.charAt(left)!='E'&&s.charAt(left)!='i'&&s.charAt(left)!='I'&&s.charAt(left)!='o'&&s.charAt(left)!='O'&&s.charAt(left)!='U'&&s.charAt(left)!='u'))
            {
                left++;
            }
            while (right>left&&(s.charAt(right)!='a'&&s.charAt(right)!='A'&&s.charAt(right)!='e'&&s.charAt(right)!='E'&&s.charAt(right)!='i'&&s.charAt(right)!='I'&&s.charAt(right)!='o'&&s.charAt(right)!='O'&&s.charAt(right)!='U'&&s.charAt(right)!='u'))
            {
                right--;
            }
            s=swap(s,left,right);
            left++;
            right--;
        }
        return s;
    }


    static void main() {

        System.out.println(reverse("IceCream"));
    }
}



//
//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//Example 1:
//
//Input: s = "IceCreAm"
//
//Output: "AceCreIm"
//
//Explanation:
//
//The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
//
//Example 2:
//
//Input: s = "leetcode"
//
//Output: "leotcede"