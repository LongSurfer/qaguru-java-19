package com.demoqa.data.viewModel;

import static com.demoqa.utils.RandomData.*;

public class RegistrationPageViewModel {

    public String nameValue = getRandomFirstName(),
            lastNameValue = getRandomLastName(),
            emailValue = getRandomEmail(),
            genderValue = getRandomGender(),
            numberValue = getRandomPhone(),
            monthValue = getRandomMonth(),
            yearValue = getRandomYear(),
            dayValue = getRandomDay(),
            subjectValue = getRandomSubject(),
            hobbyValue = getRandomHobby(),
            pathValue = "salt-bae-2.jpg",
            addressValue = getRandomAddress(),
            stateValue = getRandomState(),
            cityValue = getRandomCity(stateValue);
}
