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
                    System.out.println("Successfully ordered a burger");
                    break;
                case "2":
                    System.out.println("Successfully ordered fries");
                    break;
                case "3":
                    ordering = false;
                    break;
            }
        }
    }
}