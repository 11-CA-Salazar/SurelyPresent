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
                    System.out.println("Do you want to hire a trainer?(Note: ONLY VIP CAN HIRE)");
                    System.out.println("1. Yes ");
                    System.out.println("2. No\n");
                    break;

                case "3":
                    System.out.println("Succesfully exited the app gym...");
                    lifting = false;
                    break;

                default:
                    break;
            }
        }
    }
}