package com.demoqa.data.enums.cities;

import com.demoqa.data.enums.StatesEnum;

public enum CitiesHaryanaEnum {

    KARNAL("Karnal", StatesEnum.HARYANA),
    PANIPAT("Panipat",StatesEnum.HARYANA);

    private String name;
    private StatesEnum statesEnum;

    CitiesHaryanaEnum(String name, StatesEnum statesEnum) {
        this.name = name;
        this.statesEnum = statesEnum;
    }

    public String getName() {
        return name;
    }
}
