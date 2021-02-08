package com.test.anagrams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TestAnagrams {

    public static void main(String args[]) {
        ArrayList<String> anagramList = new ArrayList<>();
        anagramList.add("ABC");
        anagramList.add("PARET");
        anagramList.add("CAB");
        anagramList.add("CAT");
        anagramList.add("PARTE");
        anagramList.add("DOG");
        anagramList.add("TAC");
        anagramList.add("PRATE");
        anagramList.add("MAD");
        anagramList.add("DAM");
        anagramList.add("AMD");
        anagramList.add("TPRAE");
        anagramList.add("GOD");
        anagramList.add("SET");
        anagramList.add("APRET");

        HashMap<String, String[]> anagramMap = new HashMap<>();
        for (int i = 0; i < anagramList.size(); i++) {
            char[] value1 = anagramList.get(i).toLowerCase().toCharArray();
            String mapValue = anagramList.get(i);
            Arrays.sort(value1);
            for (int j = i + 1; j < anagramList.size(); j++) {
                if (anagramList.get(i).length() == anagramList.get(j).length()) {
                    char[] value2 = anagramList.get(j).toLowerCase().toCharArray();
                    Arrays.sort(value2);
                    if (Arrays.equals(value1, value2)) {
                        mapValue = mapValue + "," + anagramList.get(j);
                    }
                }
            }
            if (!anagramMap.containsKey(Arrays.toString(value1))) {
                anagramMap.put(Arrays.toString(value1), mapValue.split(","));
            }
        }

        for (String anagramSetKey : anagramMap.keySet()) {
            System.out.println(Arrays.toString(anagramMap.get(anagramSetKey)));
        }

    }
}
