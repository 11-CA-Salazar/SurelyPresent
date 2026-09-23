package com.example.surelypresent.quarter2.practicalexam;

import java.util.Scanner;

public class GymMenu {
    public void start(Scanner scanner) {
        boolean lifting = true;

        System.out.println("Does user want to enter the gym?");
        System.out.println("1. Yes");
        System.out.println("2. No\n");

        while (lifting && scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    System.out.println("Entering gym...\n");
                    break;

                case "2":
                    System.out.println("Does the user want to hire a trainer? (Note: ONLY VIP CAN HIRE TRAINERS)");
                    System.out.println("1. Yes");
                    System.out.println("2. No\n");

                    if (scanner.hasNextLine()) {
                        String tierInput = scanner.nextLine().trim();

                        if (tierInput.equals("1")) {
                            System.out.println("Trainer assigned\n");
                            System.out.println("============================");
                            System.out.println("         3. EXIT            ");
                            System.out.println("============================\n");

                        } else if (tierInput.equals("2")) {
                            System.out.println("Need to upgrade membership\n");
                            System.out.println("============================");
                            System.out.println("         3. EXIT            ");
                            System.out.println("============================\n");

                        }
                    }
                    break;

                default:
                    break;
            }
        }
    }
}