package com.demoqa;


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
        $x("//label[text()='Male']").click();
        $("#userNumber").setValue("0123456789");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-dropdown-container").click();
        $x("//option[text()='November']").click();
        $(".react-datepicker__year-select").click();
        $x("//option[text()='1987']").click();
        $(".react-datepicker__day.react-datepicker__day--025").click();

        $("#subjectsInput").setValue("Eng");
        $("#react-select-2-option-0").click(); //кликаем на результат
        $("#subjectsInput").setValue("Comp");
        $("#subjectsInput").pressEnter(); // выбираем результат с помощью ентера
        $(byText("Sports")).click();
        $(byText("Music")).click();

        $("#uploadPicture").uploadFile(new File("src/test/resources/salt-bae-2.jpg"));
        $("#currentAddress").setValue("Kuta, Bali");
        $("#state").click();
        $("#react-select-3-option-1").click(); //Uttar Pradesh
        $("#city").click();
        $x("//div[text()='Merrut']").click(); //тот случай, когда XPath читабельнее

        $("#submit").click();

        //А как правильно юзать команду assert в джаве?
        $(".table").shouldHave(
                text("Alex"), text("Evans"), text("test@test.qa"), text("Male"), text("0123456789"),
                text("25 November,1987"), text("English, Computer Science"), text("Sports, Music"),
                text("salt-bae-2.jpg"), text("Kuta, Bali"), text("Uttar Pradesh Merrut"));

    }
}
