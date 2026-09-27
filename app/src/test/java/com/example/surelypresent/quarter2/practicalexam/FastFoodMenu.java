package com.example.surelypresent.quarter2.practicalexam;

import java.util.Scanner;

public class FastFoodMenu {

    // This method starts the fast food ordering system.
    public void start(Scanner scanner) {

        // Controls whether the ordering system should continue running.
        boolean ordering = true;

        // Display the title of the system.
        System.out.println("--- GENERATING FAST FOOD TEST DATA ---");

        // Display the available food choices.
        System.out.println("What would you like to order?");
        System.out.println("1. Burger");
        System.out.println("2. Fries");
        System.out.println("3. Exit");
    }
}