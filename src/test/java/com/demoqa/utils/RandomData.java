package com.demoqa.utils;

import com.demoqa.data.enums.*;
import com.demoqa.data.enums.cities.*;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class RandomData {

    private static Faker fakerEn = new Faker(new Locale("en"));

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static <T extends Enum<?>> T getRandomEnum(Class<T> enumClass) {
        int index = getRandomInt(0,enumClass.getEnumConstants().length - 1);
        return enumClass.getEnumConstants()[index];
    }

    public static String getRandomFirstName() {
        return fakerEn.name().firstName();
    }

    public static String getRandomLastName() {
        return fakerEn.name().lastName();
    }

    public static String getRandomEmail() {
        return fakerEn.internet().emailAddress();
    }

    public static String getRandomGender() {
        return getRandomEnum(GenderEnum.class).getName();
    }

    public static String getRandomPhone() {
        return fakerEn.numerify("##########");
    }

    public static String getRandomMonth() {
        return getRandomEnum(MonthsEnum.class).getName();
    }

    public static String getRandomYear() {
        return Integer.toString(getRandomInt(1900, 2023));
    }

    public static String getRandomDay() {
        int day = getRandomInt(1, 28);
        if (day < 10) {
            return "0" + Integer.toString(day);
        } else {
            return Integer.toString(day);
        }
    }

    public static String getRandomSubject() {
        return getRandomEnum(SubjectsEnum.class).getName();
    }

    public static String getRandomHobby() {
        return getRandomEnum(HobbiesEnum.class).getName();
    }

    public static String getRandomAddress() {
        return fakerEn.address().fullAddress();
    }

    public static String getRandomState() {
        return getRandomEnum(StatesEnum.class).getName();
    }

    public static String getRandomCity(String state) {
        String city;
        switch (state) {
            case "NCR": {
                city = getRandomEnum(CitiesNCREnum.class).getName();
                return city;
            }
            case "Uttar Pradesh": {
                city = getRandomEnum(CitiesUttarProdeshEnum.class).getName();
                return city;
            }
            case "Haryana": {
                city = getRandomEnum(CitiesHaryanaEnum.class).getName();
                return city;
            }
            case "Rajasthan": {
                city = getRandomEnum(CitiesRajasthanEnum.class).getName();
                return city;
            }
        }
        return null;
    }

}
