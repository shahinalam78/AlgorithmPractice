package com.shifted.algorithm1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by PaxoStudent on 6/24/2017.
 */
public class DuplicateCharacter {

    public static int duplicateCharCount(String text) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] chars = text.toCharArray();

        for (Character ch : chars) {

            if (map.containsKey(ch)) {

                map.put(ch, map.get(ch) + 1);

            } else {

                map.put(ch, 1);
            }
        }

        Set<Character> keys = map.keySet();

        int count = 0;

        for (Character ch : keys) {

            if (map.get(ch) > 1) {

            }

            count = map.get(ch);
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(duplicateCharCount("aawed"));
    }
}
