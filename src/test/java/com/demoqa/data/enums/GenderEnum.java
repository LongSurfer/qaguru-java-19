package com.demoqa.data.enums;

public enum GenderEnum {

    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private String name;

    GenderEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
