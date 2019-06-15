package com.sda.tallinn6.advancedFeatures.Collections;

import com.sda.tallinn6.advancedFeatures.encapsulation.Student;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> miniDictionary = new HashMap<>();

        miniDictionary.put("Student", "A student is a person...");
        miniDictionary.put("Marker", "A market is...");
        miniDictionary.put("Class", "A class is...");

        System.out.println(miniDictionary.get("Student"));

        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("", "", 12, true));
        studentMap.put(2, new Student("", "", 12, false));

        System.out.println(studentMap.get(1));
        System.out.println(studentMap.get(2));



    }
}
