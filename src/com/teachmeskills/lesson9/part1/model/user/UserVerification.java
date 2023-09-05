package com.teachmeskills.lesson9.part1.model.user;

import com.teachmeskills.lesson9.part1.model.User_exception.WrongLoginException;
import com.teachmeskills.lesson9.part1.model.User_exception.WrongPasswordException;

public class UserVerification {
    public static boolean loginAndPasswordVerification(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20) {
            throw new WrongLoginException(110, "Login more than twenty digits.");
        } else if (login.contains(" ")) {
            throw new WrongLoginException(120, "Login contains spaces.");
        }

        if (password.length() > 20) {
            throw new WrongPasswordException(130, "Password more than twenty digits.");
        } else if (password.contains(" ")) {
            throw new WrongPasswordException(140, "Password contains spaces.");
        }

        char[] arrayPassword = password.toCharArray();

        for (int i = 0; i < password.length(); i++) {
            if (arrayPassword[i] >= 48 && arrayPassword[i] <= 57) {
                throw new WrongPasswordException(150, "Password contains numbers.");
            }
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(160, "Password and confirmPassword are nor equal.");
        }

        return true;
    }

    public static boolean checkingLoginAndPasswordThrough_toCharArray(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        char[] arrayLogin = login.toCharArray();
        char[] arrayPassword = password.toCharArray();

        if (login.length() > 20) {
            throw new WrongLoginException(110, "Login more than twenty digits.");
        }

        for (int i = 0; i < login.length(); i++) {
            if (arrayLogin[i] == 32) {
                throw new WrongLoginException(120, "Login contains spaces.");
            }
        }

        if (password.length() > 20) {
            throw new WrongPasswordException(130, "Password more than twenty digits.");
        }

        for (int i = 0; i < password.length(); i++) {
            if (arrayPassword[i] == 32) {
                throw new WrongPasswordException(140, "Password contains spaces.");
            } else if (arrayPassword[i] >= 48 && arrayPassword[i] <= 57) {
                throw new WrongPasswordException(150, "Password contains numbers.");
            }
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(160, "Password and confirmPassword are nor equal.");
        }

        return true;
    }
}

