package com.demoqa.tests;

import com.demoqa.data.viewModel.RegistrationPageViewModel;
import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class PracticeFormDataFakerTests extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPageViewModel registrationPageViewModel = new RegistrationPageViewModel();

    @Test
    @DisplayName("Successful registration")
    void successfulFillFormTest() {

        step("Fill form", () -> {
                    registrationPage.openPage()
                            .closeAdBanners()
                            .setFirstName(registrationPageViewModel.nameValue)
                            .setLastName(registrationPageViewModel.lastNameValue)
                            .setUserEmail(registrationPageViewModel.emailValue)
                            .setGender(registrationPageViewModel.genderValue)
                            .setUserNumber(registrationPageViewModel.numberValue)
                            .setBirthDate(registrationPageViewModel.dayValue,
                                    registrationPageViewModel.monthValue,
                                    registrationPageViewModel.yearValue)
                            .setSubject(registrationPageViewModel.subjectValue)
                            .setHobby(registrationPageViewModel.hobbyValue)
                            .selectPicture(registrationPageViewModel.pathValue)
                            .setCurrentAddress(registrationPageViewModel.addressValue)
                            .setStateAndCity(registrationPageViewModel.stateValue,
                                    registrationPageViewModel.cityValue)
                            .clickOnSubmitButton();
                });

        step("Verify result", () -> {
            registrationPage.verifyRegistrationResultModalAppears()
                    .verifyResult(registrationPageViewModel);
        });

    }
}