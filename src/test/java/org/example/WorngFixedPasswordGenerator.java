package org.example;

import org.example.user.PasswordGenerator;

public class WorngFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "ab"; // 2글자
    }
}
