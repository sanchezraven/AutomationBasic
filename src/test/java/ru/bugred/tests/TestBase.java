package ru.bugred.tests;

import com.codeborne.selenide.Configuration;
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
        baseUrl = "http://users.bugred.ru";
        Configuration.browserSize = "1920x1080";

        new RegistrationPage().doLogin();
    }
}
