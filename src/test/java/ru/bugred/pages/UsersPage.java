package ru.bugred.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class UsersPage {
    public UsersPage verifyResults(String value) {
        $(".ajax_load_row").shouldHave(text(value));
        return this;
    }
}
