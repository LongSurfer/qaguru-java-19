package com.demoqa.tests;

import com.demoqa.data.viewModel.RegistrationPageViewModel;
import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class PracticeFormDataFakerTests extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPageViewModel registrationPageViewModel = new RegistrationPageViewModel();

    @Test
    void successfulFillFormTest() {

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

        registrationPage.verifyRegistrationResultModalAppears()
                .verifyResult(registrationPageViewModel);

    }
}