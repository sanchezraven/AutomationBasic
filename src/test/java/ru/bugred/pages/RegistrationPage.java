package ru.bugred.pages;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    public void doLogin() {
        open("/user/login/index.html");
        $(byName("login")).setValue("johnyboy@bober.ru");
        $(byName("password")).setValue("123");
        $(by("value", "Авторизоваться")).click();
    }
}
