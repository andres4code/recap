package com.sda.tallinn6.evgenii.July_6th.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringParsing {
    public static void main(String[] args) {
        String str1 = "I have to learn Java very well!";

        //Solution 1
        String[] str2 = str1.split(" ");
        Stream<String> stringStream = Arrays.asList(str2).stream();

        final List<String> collect = stringStream.map(word ->
                word
                        .chars()
                        .filter(el -> el < 'z' && el > 'A')
                        .mapToObj(item -> (char) item)
                        .collect(StringBuilder::new,
                                (sb, i) -> sb.append((char) i),
                                StringBuilder::append)
                        .toString()
        ).collect(Collectors.toList());

        collect.stream().forEach(el -> System.out.println(el));
    }
}


