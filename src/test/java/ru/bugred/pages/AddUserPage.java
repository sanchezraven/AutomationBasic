package ru.bugred.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class AddUserPage {
    private final String ADD_USER = "Добавить пользователя";

    public AddUserPage setName(String name){
        $(byName("noibiz_name")).setValue(name);
        return this;
    }

    public AddUserPage setEmail(String mail){
        $(byName("noibiz_email")).setValue(mail);
        return this;
    }

    public AddUserPage setPassword(String password){
        $(byName("noibiz_password")).setValue(password);
        return this;
    }

    public AddUserPage setGender(String gender){
        $(byName("noibiz_gender")).click();
        $(by("value", gender)).click();
        return this;
    }

    public AddUserPage submit(){
        $(byName("act_create")).click();
        return this;
    }

    public AddUserPage openAddUserPage() {
        $(byText(ADD_USER)).click();
        $(".content").shouldHave(text(ADD_USER));
        return this;
    }
}
