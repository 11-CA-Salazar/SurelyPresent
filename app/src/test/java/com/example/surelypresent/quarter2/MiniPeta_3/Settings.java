package com.example.surelypresent.quarter2.MiniPeta_3;

import android.provider.ContactsContract;
import java.util.Scanner;

public class Settings {

    public static void main(String[] args) {
        Scanner input = new Scanner(String.valueOf(System.in));
        int choice;


        do {
            System.out.println("\n--- SETTINGS MENU ---");
            System.out.println("1. View User Profile");
            System.out.println("2. System Functions");
            System.out.println("3. Check for Errors");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice < 1 || choice > 3){
            switch (choice) {
                else if (choice == 1)
                    System.out.println("Loading Profile: " + ContactsContract.Profile);;
               else if (choice == 2)
                    System.out.println("Executing User System Functions...");
                else if (choice == 3)
                    System.out.println("Error Log status: No VerifyError detected.");
                else if (choice == 4)
                    System.out.println("Exiting Settings...");
                default:
                    System.out.println("Invalid choice. Please try again.");
            }