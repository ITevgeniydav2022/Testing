package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void createObjectTest() {
        User user = new User("Dzhuzeppe", "defox2022@gmail.com");
        String testLogin = user.getLogin();
        String testEmail = user.getEmail();
        Assertions.assertEquals(testLogin, "Dzhuzeppe");
        Assertions.assertEquals(testEmail, "defox2022@gmail.com");
    }

    @Test
    public void createObjectTransmitNullTest() {
        User user = new User(null, null);
        String testLogin = user.getLogin();
        String testEmail = user.getEmail();
        Assertions.assertNull(testLogin);
        Assertions.assertNull(testEmail);
    }

    @Test
    public void incorrectDataTest() {
        User user = new User("Dzhuzeppe", "defox2022@gmail.com");
        String testEmail = user.getEmail();
        Assertions.assertTrue(testEmail.contains("@"));
        Assertions.assertTrue(testEmail.contains("."));
    }

    @Test
    public void equalsLogAndEMail() {
        User user = new User("Dzhuzeppe", "defox2022@gmail.com");
        String testLogin = user.getLogin();
        String testEmail = user.getEmail();
        Assertions.assertNotEquals(testLogin, testEmail);
    }
}