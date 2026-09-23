package com.example.surelypresent.quarter2.practicalexam;

import java.util.Scanner;
public class CinemaMenu {
    public static void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("==== CINEMA TICKET SYSTEM ====");
            System.out.println("Choose an option");
            System.out.println("1. Buy a ticket");
            System.out.println("2. Buy Snacks");
            System.out.println("3. Exit.");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    buyTicket(scanner);
                    break;
                    case "2":
                        BuySnacks(scanner);
                        break;
                    case "3":
                        System.out.println("Exiting System");
                        running = false;
                        break;
                    default:
                }
            }
        }
    public static void buyTicket(Scanner scanner) {
        System.out.println("Please enter age:");
        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number, please return to main menu");
        }
        if (age < 18) {
            System.out.println("Access denied!");
        } else
            System.out.println("Ticket Printed");
    }
    public static void BuySnacks(Scanner scanner) {
        System.out.println("--- Snack Menu ---");
        System.out.println("1. Popcorn - $5");
        System.out.println("2. Soda - $3");
        System.out.println("3. Candy - $2");
        System.out.println("Snack purchased successfully! Enjoy!");
    }
}




