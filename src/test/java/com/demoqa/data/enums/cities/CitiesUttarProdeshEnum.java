package com.demoqa.data.enums.cities;

import com.demoqa.data.enums.StatesEnum;

public enum CitiesUttarProdeshEnum {

    AGRA("Agra", StatesEnum.UTTAR_PRADESH),
    LUCKNOE("Lucknow", StatesEnum.UTTAR_PRADESH),
    MERRUT("Merrut",StatesEnum.UTTAR_PRADESH);

    private String name;
    private StatesEnum statesEnum;

    CitiesUttarProdeshEnum(String name, StatesEnum statesEnum) {
        this.name = name;
        this.statesEnum = statesEnum;
    }

    public String getName() {
        return name;
    }
}
