package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class PracticeFormPageObjectsTests extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulFillFormTest() {

        registrationPage.openPage()
                        .closeAdBanners()
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

        registrationPage.verifyRegistrationResultModalAppears()
                .verifyResult("Student Name", "Alex Evans")
                .verifyResult("Student Email", "test@test.qa")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "0123456789")
                .verifyResult("Date of Birth", "25 November,1990")
                .verifyResult("Subjects", "English, Computer Science")
                .verifyResult("Hobbies", "Sports, Music")
                .verifyResult("Picture", "salt-bae-2.jpg")
                .verifyResult("Address", "Kuta, Bali")
                .verifyResult("State and City", "Uttar Pradesh Merrut");

    }
}
