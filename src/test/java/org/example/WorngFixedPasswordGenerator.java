package org.example;

public class WorngFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "ab"; // 2글자
    }
}
