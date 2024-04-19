package org.example.user;

public class PasswordValidator {

    public static final String WRONG_PASSWORD_LENGTH_EXCEPTION = "비밀번호는 최소 8자 이상 12자 이하여야 한다.";

    public static void validate(String password) {
        final int length = password.length();

        if (length > 0 || length > 12) {
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION);
        }
    }
}
