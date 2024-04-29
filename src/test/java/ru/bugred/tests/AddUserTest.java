package ru.bugred.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class AddUserTest extends TestBase {

    @Test
    void successfulAddUserTest() {

        Faker faker = new Faker();

        String name = faker.name().fullName();
        String password = faker.internet().password();
        String email = faker.internet().emailAddress();


        addUserPage.openAddUserPage()
                .setName(name)
                .setEmail(email)
                .setPassword(password)
                .setGender("m")
                .submit();
        usersPage.verifyResults(email)
                .verifyResults(name)
                .verifyResults("johnyboy@bober.ru");
    }
}
