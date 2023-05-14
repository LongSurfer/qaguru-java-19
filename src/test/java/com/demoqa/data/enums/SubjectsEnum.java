package com.demoqa.data.enums;

public enum SubjectsEnum {

    HINDI("Hindi"),
    ENGLISH("English"),
    MATHS("Maths"),
    PHYSICS("Physics"),
    CHEMISTRY("Chemistry"),
    BIOLOGY("Biology"),
    COMPUTER_SCIENCE("Computer Science"),
    COMMERCE("Commerce"),
    ACCOUNTING("Accounting"),
    ECONOMICS("Economics"),
    ARTS("Arts"),
    SOCIAL_STUDIES("Social Studies"),
    HISTORY("History"),
    CIVICS("Civics");

    private String name;

    SubjectsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
