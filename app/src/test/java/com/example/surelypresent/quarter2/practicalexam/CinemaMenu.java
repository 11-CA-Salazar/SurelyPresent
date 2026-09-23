package com.example.surelypresent.quarter2.practicalexam;

import java.util.Scanner;
public class CinemaMenu {

    // Step 1: Test underage restriction (< 18)
    // Step 2: Test legal age access (>= 18)
    // Step 3: Test snack purchase
    // Step 4: Exit system
    public static void start(Scanner scanner) {

        System.out.println("=========================");
        System.out.println("==== WOULD YOU LIKE TO BUY TICKET?===");
        System.out.println("=========================");

        boolean buying = true;

        while (buying && scanner.hasNext())
            switch (buying) {
                case 1:
                    System.out.println("1. Yes");
                    break;
                case 2:
                    System.out.println("2. No");
                    break;
            }
    }
}