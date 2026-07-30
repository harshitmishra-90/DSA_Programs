package com.harshit.Hashing.HashMap;

import java.util.HashMap;

public class ItineraryTickets {
    public static String getstart(HashMap<String, String>maps)
    {
        HashMap<String,String>revMaps=new HashMap<>();
        int size=maps.size();
        for(String key:maps.keySet())
        {
            revMaps.put(maps.get(key),key);
        }

        for(String key:maps.keySet())
        {
            if(!revMaps.containsKey(key))
            {
                return key;//starting pointing
            }
        }
        return null;
    }
    static void main() {
        HashMap<String,String> maps=new HashMap<>();
        maps.put("Chennai","Bengaluru");
        maps.put("mumbai","Delhi");
        maps.put("Goa","Chennai");
        maps.put("Delhi","Goa");
        String start =getstart(maps);
        System.out.println(start+" ");
        for(String key:maps.keySet())
        {
            System.out.print("-->"+maps.get(start));
            start=maps.get(start);
        }

    }
}
