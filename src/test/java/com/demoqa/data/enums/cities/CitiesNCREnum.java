package com.demoqa.data.enums.cities;

import com.demoqa.data.enums.StatesEnum;

public enum CitiesNCREnum {

    DELHI("Delhi", StatesEnum.NCR),
    GURGAON("Gurgaon", StatesEnum.NCR),
    NOIDA("Noida", StatesEnum.NCR);

    private String name;
    private StatesEnum statesEnum;

    CitiesNCREnum(String name, StatesEnum statesEnum) {
        this.name = name;
        this.statesEnum = statesEnum;
    }

    public String getName() {
        return name;
    }
}
