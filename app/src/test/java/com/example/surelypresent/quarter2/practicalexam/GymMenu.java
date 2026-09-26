package com.example.surelypresent.quarter2.practicalexam;

import java.util.Scanner;

public class GymMenu {

    public void start(Scanner scanner) {

        boolean lifting = true;

        // Display initial entry menu options
        System.out.println("Does user want to enter the gym?"); // Ask the user if they want to enter the gym
        System.out.println("1. Yes");
        System.out.println("2. No\n");

        // Continuously process commands until the user exits or input stream ends
        while (lifting && scanner.hasNextLine()) {
            // Read next line of input and strip leading/trailing whitespace
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1": // Option 1: Enter the gym directly
                    System.out.println("Entering gym...\n"); // Executed once the condition is met
                    break;

                case "2": // Option 2:  Display the initial question once user entered the gym
                    System.out.println("Do you want to hire a trainer?(Note: ONLY VIP CAN HIRE)"); // Asks the user if they want to hire a trainer
                    System.out.println("1. Yes");
                    System.out.println("2. No\n");

                    // Read secondary input for trainer hire decision
                    if (scanner.hasNextLine()) {
                        String tierInput = scanner.nextLine().trim();

                        if (tierInput.equals("1")) { // Option 1: User chooses to hire a trainer (VIP path)
                            // Display VIP profile details
                            System.out.println("-----USER PROFILE-----");
                            System.out.println("Username: ########            ");
                            System.out.println("Membership: VIP       ");
                            System.out.println("Trainer hired: #######       \n");

                            // Display that the user has an assigned trainer
                            System.out.println("Trainer ####### assigned\n");

                            // Display exit navigation banner
                            System.out.println("============================");
                            System.out.println("         3. EXIT            ");
                            System.out.println("============================\n");

                        } else if (tierInput.equals("2")) { // Option 2: The automated input is 2, but the option should be one: User tries to hire a trainer but needed to upgrade
                            // Display Regular profile details with upgrade notification
                            System.out.println("-----USER PROFILE-----");
                            System.out.println("Username: #########           ");
                            System.out.println("Membership: Regular (UPGRADE?) ");
                            System.out.println("Trainer hired: (UNAVAILABLE: VIP membership needed)        \n");

                            System.out.println("Need to upgrade membership\n");

                            // Display exit navigation banner
                            System.out.println("============================");
                            System.out.println("         3. EXIT            ");
                            System.out.println("=============================\n");
                        }
                    }
                    break;

                case "3": // Option 3: Exit the program loop
                    System.out.println("Succesfully exited the app gym...\n");
                    lifting = false; // Terminate loop on next iteration
                    break;

                default: // Ignore unhandled menu options and continue looping
                    break;
            }
        }
    }
}