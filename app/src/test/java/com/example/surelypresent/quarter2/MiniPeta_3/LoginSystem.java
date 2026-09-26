package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;

public class LoginSystem {

    public String authenticate(Scanner scanner) {

        if (!scanner.hasNextLine()) {
            return null;
        }

        String input = scanner.nextLine().trim();

        if (!input.equals("1")) {
            System.out.println("Invalid option. Please try again.");
            return null;
        }

        System.out.println("Username: ######");

        if (!scanner.hasNextLine()) {
            return null;
        }

        String username = scanner.nextLine().trim();

        System.out.println("Password: ######");

        if (!scanner.hasNextLine()) {
            return null;
        }

        String password = scanner.nextLine().trim();


        // ==========================================
        // ADMIN
        // ==========================================

        if (username.equalsIgnoreCase("Clyde")
                && password.equals("Clyde123")) {

            System.out.println();
            System.out.println("Login successful!");
            System.out.println("Role: ADMIN");

            return "Admin";
        }


        // ==========================================
        // TEACHER
        // ==========================================

        else if (username.equalsIgnoreCase("Joaquin")
                && password.equals("Joaquin123")) {

            System.out.println();
            System.out.println("Login successful!");
            System.out.println("Role: TEACHER");

            return "Teacher";
        }


        // ==========================================
        // STUDENT
        // ==========================================

        else if (username.equalsIgnoreCase("Cerbito")
                && password.equals("Cerbito123")) {

            System.out.println();
            System.out.println("Login successful!");
            System.out.println("Role: STUDENT");

            return "Student";
        }


        // ==========================================
        // INVALID USER
        // ==========================================

        else {

            System.out.println();
            System.out.println("Does user want to login?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.println();

            System.out.println("Invalid user, please try again.");

            return null;
        }
    }
}