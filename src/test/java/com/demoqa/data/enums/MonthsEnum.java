package com.demoqa.data.enums;

public enum MonthsEnum {

    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String name;

    MonthsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
