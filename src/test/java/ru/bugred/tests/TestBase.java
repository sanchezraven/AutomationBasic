package ru.bugred.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import ru.bugred.pages.AddUserPage;
import ru.bugred.pages.RegistrationPage;
import ru.bugred.pages.UsersPage;

import static com.codeborne.selenide.Configuration.baseUrl;

public class TestBase {

    AddUserPage addUserPage = new AddUserPage();
    UsersPage usersPage = new UsersPage();

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        baseUrl = "http://users.bugred.ru";
        Configuration.browserSize = "1920x1080";

        new RegistrationPage().doLogin();
    }
}
