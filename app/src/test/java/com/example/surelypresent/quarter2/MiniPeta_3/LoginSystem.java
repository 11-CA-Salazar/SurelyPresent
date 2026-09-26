package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;

public class LoginSystem {

    public boolean authenticate(Scanner scanner) {

        while (scanner.hasNextLine()) {

            String input = scanner.nextLine().trim();

            switch (input) {



                case "1":

                    System.out.println("Username: ######");
                    String username = scanner.nextLine().trim();

                    System.out.println("Password: ######");
                    String password = scanner.nextLine().trim();


                    if (username.equalsIgnoreCase("Clyde") && password.equals("Clyde123")) {
                        System.out.println("Welcome back Admin Clyde!\n");
                        return true;
                    } else if (username.equalsIgnoreCase("Joaquin") && password.equals("Joaquin123")) {
                        System.out.println("Welcome back Teacher Joaquin!\n");
                        return true;
                    } else if (username.equalsIgnoreCase("Cerbito") && password.equals("Cerbito123")) {
                        System.out.println("Welcome back Student Cerbito!\n");
                        return true;
                    } else {
                        System.out.println("Does user want to login?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        System.out.println("Invalid user, please try again.\n");
                        return false;
                    }


                // ==========================================
                // INVALID MENU OPTION
                // ==========================================

                default:

                    System.out.println("Invalid option. Please try again.");
                    return false;
            }
        }

        return false;
    }
}