package com.teachmeskills.lesson9.part1.model.User_exception;

public class WrongLoginException extends Exception {
    private int validationErrorLong;

    public WrongLoginException() {

    }

    public WrongLoginException(int validationErrorLong, String message) {
        super(message);
        this.validationErrorLong = validationErrorLong;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "validationErrorLong=" + validationErrorLong +
                '}';
    }
}
