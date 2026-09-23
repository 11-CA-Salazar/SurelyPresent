package com.example.surelypresent.quarter2.practicalexam;

import java.util.Scanner;
public class CinemaMenu {

    // Step 1: Test underage restriction (< 18)
    // Step 2: Test legal age access (>= 18)
    // Step 3: Test snack purchase
    // Step 4: Exit system
    public static void start(Scanner scanner) {
        System.out.println("======================================");
        System.out.println("==== WOULD YOU LIKE TO BUY TICKET? ===");
        System.out.println("======================================");


        boolean running = true;


        while (running && scanner.hasNextLine()) {
            String choice = scanner.nextLine().trim();
            System.out.println("Does user want to buy a ticket?");
            System.out.println("1. Yes");
            System.out.println("2. No\n");
            int age = scanner.nextInt();
            switch (choice) {
                case "1":
                    if (choice.equals("1")) {
                        System.out.println("User bought Tickets");
                    } else if (choice.equals("2\n")) {
                        System.out.println("User did not bought Tickets");
                    }
                    if (age < 18) {
                        System.out.println("Access denied");
                    } else if (age >= 18) {
                        System.out.println("Ticket Printed");

                    }
                    break;
                default:
            }
            running = false;
            }
        }
    }

