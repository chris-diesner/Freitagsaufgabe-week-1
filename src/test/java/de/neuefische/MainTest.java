package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void returnIsPasswordLong() {
        assertTrue(Password.checkPasswordLength("hfdghajfgahgkjh"));
    }

    @Test
    void returnIsPasswordToShort() {
        assertFalse(Password.checkPasswordLength("dfjg"));
    }

    @Test
    void returnIsPasswordWithInt() {
        assertTrue(Password.checkPasswordInt("sdfh..jejk3452sjdkf"));
    }

    @Test
    void returnIsPasswordWithoutInt() {
        assertFalse(Password.checkPasswordInt("sd..fhjejksjdkf"));
    }

    @Test
    void returnIsPasswordWithCapitalLetters() {
        assertTrue(Password.checkPasswordUpperCase("sdfhkDSsjdkf"));
    }

    @Test
    void returnIsPasswordNotOnlyLowerLetters() {
        assertTrue(Password.checkPasswordLowerCase("dfahadgha"));
    }

    @Test
    void returnIsPasswordWithoutCapitalLetters() {
        assertFalse(Password.checkPasswordUpperCase("sdfhksjdkf"));
    }

    @Test
    void returnIsPasswordOnlyInt() {
        assertFalse(Password.checkPasswordOnlyInt("3245"));
    }

    @Test
    void returnIsPasswordBadInput_Password123456() {
        assertTrue(Password.checkBadPassword("sdgeiufhgsD123456"));
    }

    @Test
    void returnIsPasswordWithSpecialChar() {
        assertTrue(Password.checkPasswordSpecialChar("sdgeiu.fhgsD123456"));
    }

}