package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;

public class FilterUser {


    public int execute(Scanner scanner, int user) {

        System.out.print("Enter your designated user: ");
        int Function = scanner.nextInt();

        System.out.println(Function);

        if (Function == 1) {
            System.out.println("Welcome back dear student!");
        } else if (Function == 2) {
            System.out.println("Welcome, teacher!");
        } else if (Function == 3) {
            System.out.println("You are an admin!");
        } else {
            System.out.println("You are not from this school.");
        }

        return Function;
    }
}
