package com.sda.tallinn6.advancedFeatures.enums;

public enum DaysOfWeek {
    MONDAY("first day of the week"),
    TUESDAY("first day of the week"),
    WEDNESDAY("first day of the week"),
    THURSDAY("first day of the week"),
    FRIDAY("first day of the week"),
    SATURDAY("first day of the week"),
    SUNDAY("first day of the week");

    String description;

    DaysOfWeek(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
