// File: FastFoodMenu.java
package com.example.surelypresent.quarter2.practicalexam;

import java.util.Scanner;

public class FastFoodMenu {
    public void start(Scanner scanner) {
        boolean ordering = true;

        System.out.println("--- GENERATING FAST FOOD TEST DATA ---");
        System.out.println("What would you like to order?");
        System.out.println("1. Burger");
        System.out.println("2. Fries");
        System.out.println("3. Exit");

        while (ordering && scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    System.out.println("Would you like to upgrade to a combo meal?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    if (scanner.hasNextLine()) {
                        String tierInput = scanner.nextLine().trim();
                        if (tierInput.equals("1")) {
                            System.out.println("Successfully upgraded to a combo meal");
                        } else if (tierInput.equals("2")) {
                            System.out.println("Successfully ordered a burger (solo)");
                        }
                    }
                    break;
                case "2":
                    System.out.println("Successfully ordered fries");
                    break;
                case "3":
                    System.out.println("Exiting system... Thank you!");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid option — please try again.");
            }
        }
    }
}