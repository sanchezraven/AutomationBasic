package ru.bugred.tests;

import org.junit.jupiter.api.Test;

public class AddUserTest extends TestBase{

    @Test
    void successfulAddUserTest() {
        addUserPage.openAddUserPage()
                .setName("Alex")
                .setEmail("lida@bober.ru")
                .setPassword("321")
                .setGender("m")
                .submit();
        usersPage.verifyResults("lida@bober.ru")
                .verifyResults("Alex")
                .verifyResults("johnyboy@bober.ru");
    }
}
