package com.melik.JavaExercise.livecoding;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author mselvi
 * @Created 15.05.2024
 */

/*
 * First Unique Character in a String Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1. Example 1: Input: s = "qnbeyond" Output: 0
 * Example 2: Input: s = "qqbbeeyyoonndd" Output: -1 Method bu : public int firstUniqChar(String s) { }
 * */

    /*
    *
    * */
public class LiveCoding2 {
    public static void main(String[] args) {

        int result = firstUniqChar("qqbeeyyoonnddd");

        System.out.println(result);
    }
    public static int firstUniqChar(String input) {

        int finalResult=-1;

        Map<Character,Integer> numberOfCharacter=new HashMap<>();

        for (Character character : input.toCharArray()) {
            Integer numberOf = numberOfCharacter.get(character);
            if (numberOf != null) {
                Integer oldNumberOfChar = numberOf;
                numberOfCharacter.put(character,++oldNumberOfChar);
            }else {
                numberOfCharacter.put(character,1);
            }
        }

        for (Character character: input.toCharArray()) {
            Integer numberOfChar = numberOfCharacter.get(character);
            if (numberOfChar.equals(1)) {
                int indexOf = input.indexOf(character);
                finalResult=indexOf;
                break;
            }
        }

        return finalResult;
    }
}


