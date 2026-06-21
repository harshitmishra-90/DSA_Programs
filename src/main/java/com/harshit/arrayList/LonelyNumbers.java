package com.harshit.arrayList;

import java.util.ArrayList;
import java.util.Collections;

//sort karke previous aur next of curr element should be neighbour otherwise element is lonely

public class LonelyNumbers {

    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> arr) {
        Collections.sort(arr);
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int curr = arr.get(i);
            boolean hasprev =(i>0)&&((curr==arr.get(i-1)+1)||(arr.get(i)==arr.get(i-1)));
            boolean hasnext =(i<arr.size()-1)&&((curr==arr.get(i+1)-1)||(curr==arr.get(i-1)));
            if(!hasnext&&!hasprev)
                arr1.add(curr);

        }
    return arr1;
    }
                static void main() {
                    ArrayList<Integer> arr =new ArrayList<>();
                    arr.add(2);
                    arr.add(3);
                    arr.add(4);
                    arr.add(66);
                    arr.add(5);
                    System.out.println(lonelyNumber(arr));

                }
            }
//brute force approach
//        for(int i=0;i<arr.size();i++)
//        {
//        for(int j=i+1;j<arr.size();j++)
//        {
//        if(arr.get(i)==arr.get(j)+1||arr.get(i)==arr.get(j)-1)
//        {
//        arr.remove(j);
//                    arr.remove(i);
//                }
//                        }
//                        }
//                        return arr;
