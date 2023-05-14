package com.demoqa.data.enums;

public enum HobbiesEnum {

    SPORTS("Sports"),
    READING("Reading"),
    MUSIC("Music");

    private String name;

    HobbiesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
