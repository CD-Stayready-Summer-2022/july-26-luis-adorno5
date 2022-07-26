package com.codedifferently;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        Map<Character, Integer> letterCount = new TreeMap<>();
        for(char c : input.toCharArray()){
            letterCount.merge(c, 1, Integer::sum);
        }
        return letterCount.toString().replaceAll("[,{}]+", "").replaceAll("=", ":");
    }
}
