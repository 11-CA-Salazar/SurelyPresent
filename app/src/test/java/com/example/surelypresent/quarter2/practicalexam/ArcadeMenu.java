package com.example.surelypresent.quarter2.practicalexam;

import java.util.Scanner;
public class ArcadeMenu {
    public static void start(Scanner scanner) {

        boolean running = true;

        while (running) {
            System.out.println("|||||||||||||||||||||||||||");
            System.out.println("||||||||A R C A D E||||||||");
            System.out.println("||||||||S Y S T E M||||||||");
            System.out.println("|||||||||||||||||||||||||||");
            System.out.println("||||| C h o i c e s |||||");
            System.out.println("1. Buy Tokens");
            System.out.println("2. Count Tickets");
            System.out.println("3. Exit.");

            String choice = scanner.nextLine().trim(); // MENU
            switch (choice) {
                case "1":
                    buyTokens(scanner);
                    break;
                case "2":
                    ticketCount(scanner);
                    break;
                case "3":
                    System.out.println("Closing window...");
                    running = false;
                    break;
                default:
            }
        }
    }

    public static void buyTokens(Scanner scanner) { // Tokens can be bought here.
        System.out.println("How many tokens would you like to buy?"); // Enter how many tokens to buy.
        System.out.println("5 pesos each token."); // Price for each token.
        int token;
        try {
            token = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("You cannot buy less than 1 token!");
            return;
        }
        if (token < 1) {
            System.out.println("Cannot buy less than 1 token.");
        } else
            System.out.println("Bought " + token + " tokens.");

    }
    public static void ticketCount(Scanner scanner) { // < 500 tickets = (Expected to keep playing), >= 500 tickets = (Claim Teddy Bear)
        System.out.println("Enter ticket to start counting");
        int ticket;
        try {
            ticket = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("No tickets found.");
            return;
        }
        if (ticket >= 500) {
            System.out.println("Enough tickets, Teddy Bear claimed.");
        } else {
            System.out.println("Not enough ticket, keep playing.");
        }
    }
}