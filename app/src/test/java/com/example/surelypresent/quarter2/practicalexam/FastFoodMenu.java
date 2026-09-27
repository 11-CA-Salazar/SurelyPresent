package com.example.surelypresent.quarter2.practicalexam;

import java.util.Scanner;

public class FastFoodMenu {

    // Starts the fast food ordering system.
    public void start(Scanner scanner) {

        // Controls whether the ordering loop should continue.
        boolean ordering = true;

        // ==========================================
        // WELCOME SCREEN
        // ==========================================
        System.out.println();
        System.out.println("==========================================");
        System.out.println("       🍔 FAST FOOD ORDERING SYSTEM 🍟");
        System.out.println("==========================================");
        System.out.println("        Welcome! What would you like?");
        System.out.println("==========================================");

        // Continue accepting choices while the system is active.
        while (ordering && scanner.hasNextLine()) {

            // ==========================================
            // MAIN MENU
            // ==========================================
            System.out.println();
            System.out.println("+----------------------------------------+");
            System.out.println("|              MAIN MENU                 |");
            System.out.println("+----------------------------------------+");
            System.out.println("|  [1] 🍔 Burger                         |");
            System.out.println("|  [2] 🍟 Fries                          |");
            System.out.println("|  [3] 🚪 Exit                           |");
            System.out.println("+----------------------------------------+");
            System.out.print("Choose an option: ");

            // Read and clean the user's menu selection.
            String input = scanner.nextLine().trim();

            // Determine what action should be performed.
            switch (input) {

                // ==========================================
                // BURGER ORDER
                // ==========================================
                case "1":

                    System.out.println();
                    System.out.println("+----------------------------------------+");
                    System.out.println("|              🍔 BURGER                 |");
                    System.out.println("+----------------------------------------+");
                    System.out.println("| Would you like to upgrade to a combo?  |");
                    System.out.println("|                                        |");
                    System.out.println("| [1] Yes                                |");
                    System.out.println("| [2] No                                 |");
                    System.out.println("+----------------------------------------+");
                    System.out.print("Choose an option: ");

                    if (scanner.hasNextLine()) {

                        String tierInput =
                                scanner.nextLine().trim();

                        if (tierInput.equals("1")) {

                            System.out.println();
                            System.out.println(
                                    "✓ SUCCESS! Burger upgraded to COMBO meal!"
                            );

                        } else if (tierInput.equals("2")) {

                            System.out.println();
                            System.out.println(
                                    "✓ SUCCESS! Burger ordered as SOLO."
                            );

                        } else {

                            // Handles an invalid burger option.
                            System.out.println();
                            System.out.println(
                                    "✗ ERROR: Invalid burger option."
                            );
                        }
                    }
                    break;

                // ==========================================
                // FRIES ORDER
                // ==========================================
                case "2":

                    System.out.println();
                    System.out.println("+----------------------------------------+");
                    System.out.println("|               🍟 FRIES                 |");
                    System.out.println("+----------------------------------------+");
                    System.out.println("| Would you like to upgrade to a combo?  |");
                    System.out.println("|                                        |");
                    System.out.println("| [1] Yes                                |");
                    System.out.println("| [2] No                                 |");
                    System.out.println("+----------------------------------------+");
                    System.out.print("Choose an option: ");

                    if (scanner.hasNextLine()) {

                        String tierInput =
                                scanner.nextLine().trim();

                        if (tierInput.equals("1")) {

                            System.out.println();
                            System.out.println(
                                    "✓ SUCCESS! Fries upgraded to COMBO meal!"
                            );

                        } else if (tierInput.equals("2")) {

                            System.out.println();
                            System.out.println(
                                    "✓ SUCCESS! Fries ordered as REGULAR."
                            );

                        } else {

                            // Handles an invalid fries option.
                            System.out.println();
                            System.out.println(
                                    "✗ ERROR: Invalid fries option."
                            );
                        }
                    }
                    break;

                // ==========================================
                // EXIT SYSTEM
                // ==========================================
                case "3":

                    System.out.println();
                    System.out.println("==========================================");
                    System.out.println("          THANK YOU FOR ORDERING!         ");
                    System.out.println("==========================================");
                    System.out.println("     🍔 Have a great day! 🍟");
                    System.out.println("==========================================");

                    // Stop the ordering loop.
                    ordering = false;
                    break;

                // ==========================================
                // INVALID MAIN MENU OPTION
                // ==========================================
                default:

                    System.out.println();
                    System.out.println(
                            "✗ ERROR: Invalid option."
                    );
                    System.out.println(
                            "Please choose 1, 2, or 3."
                    );
            }
        }
    }
}