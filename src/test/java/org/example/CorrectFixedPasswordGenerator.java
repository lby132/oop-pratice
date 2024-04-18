package org.example;

import org.example.user.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "abcdefg"; // 8글자
    }
}
