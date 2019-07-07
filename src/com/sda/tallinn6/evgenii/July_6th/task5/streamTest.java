package com.sda.tallinn6.evgenii.July_6th.task5;

import java.util.ArrayList;
import java.util.List;

public class streamTest {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i=0; i<100; i++) {
            nums.add(i);
        }

        long t0 = System.currentTimeMillis();
        nums.parallelStream().forEach(integer -> {
            System.out.println(integer);
        });
        System.out.println(System.currentTimeMillis() - t0);
    }
}



