package com.codedifferently;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        Map<Character, Integer> letterCount = new TreeMap<>();
        for(char c : input.toCharArray()){
            letterCount.merge(c, 1, Integer::sum);
        }
        return formatResult(letterCount);
    }

    private String formatResult(Map<Character, Integer> map){
        StringBuilder builder = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            builder.append(entry.getKey()).append(":").append(entry.getValue()).append(" ");
        }
        return builder.toString().trim();
    }
}
