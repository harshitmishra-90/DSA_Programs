package com.harshit.arrayList;

import java.util.ArrayList;

public class maxNum {
    static void main() {


        int max=Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(50);
        arr.add(5);
        arr.add(60);
        for (int i=0;i<arr.size();i++)
        {
            max=Math.max(max,arr.get(i));

        }
        System.out.println(max);
    }
}



//how object get stored on the int primitive datatype
//The answer is Autoboxing and Unboxing in Java.

//Behind the Scenes
//
//Your code:
//
//Integer x = 10;
//int y = x;
//
//Compiler converts it to:
//
//Integer x = Integer.valueOf(10); // Autoboxing
//int y = x.intValue();            // Unboxing


//Objects are stored in heap memory, while references to objects are usually stored in stack memory (for local variables).
//
//Example
//String s = new String("Hello");
//
//Memory:
//
//Stack                    Heap
//-----                    ------------------
//s  --------------------> String object ("Hello")
//s → Reference variable (stored on the stack)
//"Hello" object → Stored on the heap
//Another Example
//class Student {
//    int age;
//}
//
//Student st = new Student();