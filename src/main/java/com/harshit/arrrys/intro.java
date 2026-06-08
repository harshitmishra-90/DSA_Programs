package com.harshit.arrrys;

public class intro {

   public static void main() {
       int arr[] = new int[10];
       arr[1] = 10;
       for (int i = 0; i < 10; i++) {
           arr[i] = i * 2;
       }
       for (int i = 0; i < 10; i++) {
           System.out.println(arr[i]);
       }
       String fruits[] = {"mango", "apple", "graps"};

       for (int i=0;i< fruits.length;i++)
           System.out.println(fruits[i]);
   }
}
