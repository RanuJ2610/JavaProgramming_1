package com.test.phone.directory.search;


import java.util.*;

public class PhoneNumberSearch {
   public static final Map<String, String[]> PHONE_DIRECTORY_MAPPING = Collections.unmodifiableMap(Map.ofEntries(
           Map.entry("abc", new String [] {"name: abc", "phoneNo : 12121212"}),
           Map.entry("bcd", new String [] {"name: bcd", "phoneNo : 223232323"}),
           Map.entry("def", new String [] {"name: def", "phoneNo : 23325235757"}),
           Map.entry("efg", new String [] {"name: efg", "phoneNo : 43652351315"}),
           Map.entry("fgh", new String [] {"name: fgh", "phoneNo : 346234425"}),
           Map.entry("agi", new String [] {"name: agi", "phoneNo : 23636768656"}),
           Map.entry("igb", new String [] {"name: igb", "phoneNo : 3456234616"}),
           Map.entry("lma", new String [] {"name: lma", "phoneNo : 436166436"}),
           Map.entry("xyz", new String [] {"name: xyz", "phoneNo : 4575473856"}),
           Map.entry("ysl", new String [] {"name: ysl", "phoneNo : 6785688488"}),
           Map.entry("zae", new String [] {"name: zae", "phoneNo : 8323242426"})
   ));
   public static void main(String[] args) {
      if (args.length > 0) {
         String s = args[0];
         List<String[]> results = new ArrayList<>();
         for (String key : PHONE_DIRECTORY_MAPPING.keySet()) {
            if (key.toLowerCase().contains(s.toLowerCase())) {
               results.add(PHONE_DIRECTORY_MAPPING.get(key));
            }
         }
         if (results.size() == 0) {
            System.out.println("No Record Found");
         } else {
            for (String[] result : results) {
               System.out.println(Arrays.toString(result));
            }
         }
      } else {
         System.out.println("Please provide the search string");
      }
   }
}
