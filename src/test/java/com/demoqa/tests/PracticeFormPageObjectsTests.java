package com.demoqa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPageObjectsTests extends TestBase{

    @Test
    void successfulFillFormTest() {

        registrationPage.openPage()
                        .setFirstName("Alex")
                        .setLastName("Evans")
                        .setUserEmail("test@test.qa")
                        .setGender("Male")
                        .setUserNumber("0123456789")
                        .setBirthDate("25", "November", "1990")
                        .setSubject("English")
                        .setSubject("Computer Science")
                        .setHobby("Sports")
                        .setHobby("Music")
                        .selectPicture("salt-bae-2.jpg")
                        .setCurrentAddress("Kuta, Bali")
                        .setStateAndCity("Uttar Pradesh", "Merrut")
                        .clickOnSubmitButton();

        $(".table").shouldHave(
                text("Alex"), text("Evans"), text("test@test.qa"), text("Male"), text("0123456789"),
                text("25 November,1990"), text("English, Computer Science"), text("Sports, Music"),
                text("salt-bae-2.jpg"), text("Kuta, Bali"), text("Uttar Pradesh Merrut"));

    }
}
