package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static char findFirstUniqueChar(String str1, String str2) {
        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()) {
            return ' ';
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                return c;
            }
        }

        return ' ';
    }

    public static void main(String[] args) {
        String str1 = "aabcccbb";
        String str2 = "ad";
        char result = findFirstUniqueChar(str1, str2);
        System.out.println(result);
    }
}