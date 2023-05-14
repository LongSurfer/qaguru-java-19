package com.demoqa.data.enums.cities;

import com.demoqa.data.enums.StatesEnum;

public enum CitiesRajasthanEnum {

    JAIPUR("Jaipur", StatesEnum.RAJASTHAN),
    JAISELMER("Jaiselmer", StatesEnum.RAJASTHAN);

    private String name;
    private StatesEnum statesEnum;

    CitiesRajasthanEnum(String name, StatesEnum statesEnum) {
        this.name = name;
        this.statesEnum = statesEnum;
    }

    public String getName() {
        return name;
    }
}
