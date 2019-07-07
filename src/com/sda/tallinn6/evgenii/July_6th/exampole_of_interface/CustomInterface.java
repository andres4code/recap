package com.sda.tallinn6.evgenii.July_6th.exampole_of_interface;

import java.util.Date;

public interface CustomInterface {
//        Integer getCount();
//        String printName();
//        Date getCurrentDate();

    Integer getCount();
    default String stringName(String name) {
        return "value by default: " + name;

    }
    }

