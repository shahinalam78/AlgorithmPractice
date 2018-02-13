package com.shifted.finalalgo;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

public class MapToList {

    public static void main(String[] args){

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"alam");

        map.put(2,"shathi");

        map.put(3,"prioty");

        map.put(4,"ahonaf");

        map.put(5,"prioty");

        //System.out.println("Maping key and values: " + map);


        List<String> list = new ArrayList<String>(map.values()); // map values to list

        List<Integer> listt = new ArrayList<Integer>(map.keySet()); // map keys to list



       /* System.out.println("Converting list values: " + list);

        System.out.println("Converting list keys: " + listt);

*/
        Collections.reverse(list);

        System.out.println(list);


        Object[] values = map.values().toArray(new String[0]); // conveting map to array

        System.out.println(Arrays.toString(values));

        Set set = map.entrySet();

        System.out.println("converting set: " + set);


    }
}
