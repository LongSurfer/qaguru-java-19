package com.demoqa.tests;


import com.codeborne.selenide.Configuration;
import com.demoqa.TestBase;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest extends TestBase {



    @Test
    void successfulFillFormTest() {
        open("/automation-practice-form");

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Evans");
        $("#userEmail").setValue("test@test.qa");
        $("#gender-radio-1").parent().click();
        $("#userNumber").setValue("0123456789");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("November")).click();
        $(".react-datepicker__year-select").$(byText("1990")).click();
        $(".react-datepicker__day--025").click();

        $("#subjectsInput").setValue("Eng");
        $("#react-select-2-option-0").click(); //кликаем на результат
        $("#subjectsInput").setValue("Comp");
        $("#subjectsInput").pressEnter(); // выбираем результат с помощью ентера
        $(byText("Sports")).click();
        $(byText("Music")).click();

        $("#uploadPicture").uploadFromClasspath("salt-bae-2.jpg");
        $("#currentAddress").setValue("Kuta, Bali");
        $("#state").click();
        $("#react-select-3-option-1").click(); //Uttar Pradesh
        $("#city").click();
        $("#react-select-4-option-2").click(); //Merrut

        $("#submit").click();

        $(".table").shouldHave(
                text("Alex"), text("Evans"), text("test@test.qa"), text("Male"), text("0123456789"),
                text("25 November,1990"), text("English, Computer Science"), text("Sports, Music"),
                text("salt-bae-2.jpg"), text("Kuta, Bali"), text("Uttar Pradesh Merrut"));

    }
}
