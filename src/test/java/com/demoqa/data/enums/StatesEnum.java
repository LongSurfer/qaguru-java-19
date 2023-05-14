package com.demoqa.data.enums;

public enum StatesEnum {

    NCR("NCR"),
    UTTAR_PRADESH("Uttar Pradesh"),
    HARYANA("Haryana"),
    RAJASTHAN("Rajasthan");

    private String name;

    StatesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
