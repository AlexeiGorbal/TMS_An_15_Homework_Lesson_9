package com.teachmeskills.lesson9.part1.model.Exception;

public class WrongPasswordException extends Exception {
    private int validationErrorPassword;

    public WrongPasswordException() {

    }

    public WrongPasswordException(int validationErrorLong, String message) {
        super(message);
        this.validationErrorPassword = validationErrorLong;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "validationErrorLong=" + validationErrorPassword +
                '}';
    }
}
