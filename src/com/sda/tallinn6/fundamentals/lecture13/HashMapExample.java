package com.sda.tallinn6.fundamentals.lecture13;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("one", 1);//put can overwrite
        numberMapping.put("two", 2);
        numberMapping.put("three", 3);
        numberMapping.putIfAbsent("four", 4);
        numberMapping.putIfAbsent("twelve", 12);
        System.out.println(numberMapping);

        String input = "One";
        if (numberMapping.containsKey(input)){
            //get the value to a given key in the hashmap
            int value = numberMapping.get(input);
            System.out.println(input + " is" + value);
        }else{
            System.out.println("No value for " + numberMapping);
        }

        if (numberMapping.containsValue(1)){
            System.out.println("There is a key for the value 1");
        }else{
            System.out.println("There is no key for the value 1");
        }
        numberMapping.put("One", 3);
        System.out.println(numberMapping);

        for (Map.Entry<String, Integer> entry: numberMapping.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());

        }
        Integer retrievedValue = numberMapping.remove("One");



    }
}
