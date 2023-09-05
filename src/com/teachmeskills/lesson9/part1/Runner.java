package com.teachmeskills.lesson9.part1;

import com.teachmeskills.lesson9.part1.model.User_exception.WrongLoginException;
import com.teachmeskills.lesson9.part1.model.User_exception.WrongPasswordException;
import com.teachmeskills.lesson9.part1.model.user.UserVerification;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login: ");
        String login = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Enter confirmPassword: ");
        String confirmPassword = scanner.nextLine();

        boolean bool = false;
        try {
            bool = UserVerification.loginAndPasswordVerification(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            if (bool) {
                System.out.println("You entered everything correctly.");
            } else {
                System.out.println("You entered something wrong.");
            }
        }
    }
}
