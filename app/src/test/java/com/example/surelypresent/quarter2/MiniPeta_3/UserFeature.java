package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;

public class UserFeature {

    public static void execute(Scanner scanner, String role) {


        // ==========================================
        // ADMIN
        // ==========================================

        if (role.equalsIgnoreCase("Admin")) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("      WELCOME BACK ADMIN");
            System.out.println("==============================");

            System.out.println();
            System.out.println("1. Class List");
            System.out.println("2. Teacher List");
            System.out.println("3. Time of Location");
            System.out.println("4. Main Menu");


            // ==========================================
            // CLASS LIST
            // ==========================================

            System.out.println();
            System.out.println("----- CLASS LIST -----");

            System.out.println("Class 1: ADVISOR: ######");
            System.out.println("Class 2: ADVISOR: ######");
            System.out.println("Class 3: ADVISOR: ######");
            System.out.println("Class 4: ADVISOR: ######");
            System.out.println("Class 5: ADVISOR: ######");


            // ==========================================
            // TEACHER LIST
            // ==========================================

            System.out.println();
            System.out.println("----- TEACHER LIST -----");

            System.out.println("Teacher Joaquin");
            System.out.println("Teacher Example");


            // ==========================================
            // TIME OF LOCATION
            // ==========================================

            System.out.println();
            System.out.println("----- TIME OF LOCATION -----");

            System.out.println();

            System.out.println("CALENDAR:");
            System.out.println("1. TEACHERS");
            System.out.println("2. STUDENTS");

            System.out.println();

            System.out.println("----- TEACHER JOAQUIN -----");
            System.out.println("----- CARLO ACUTIS -----");

            System.out.println();
            System.out.println("CLASSROOM: 10:30 AM");
            System.out.println("GYM: 1:00 PM");
            System.out.println("COMPUTER LAB: 2:00 PM");
            System.out.println("SCIENCE LAB: 3:00 PM");

            System.out.println();

            System.out.println("----- STUDENT CERBITO -----");
            System.out.println("----- CARLO ACUTIS -----");

            System.out.println();
            System.out.println("CLASSROOM: 10:30 AM");
            System.out.println("GYM: 1:00 PM");
            System.out.println("COMPUTER LAB: 2:00 PM");
            System.out.println("SCIENCE LAB: 3:00 PM");


            // ==========================================
            // CONNECT TO MAIN MENU
            // ==========================================

            System.out.println();
            System.out.println("Opening MAIN MENU...");

            MainMenu.execute(scanner, role);
        }


        // ==========================================
        // TEACHER
        // ==========================================

        else if (role.equalsIgnoreCase("Teacher")) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("    WELCOME BACK TEACHER");
            System.out.println("==============================");

            System.out.println();

            System.out.println("1. CLASSROOM");
            System.out.println("2. GYM");
            System.out.println("3. COMPUTER LAB");
            System.out.println("4. SCIENCE LABORATORY");
            System.out.println("5. MAIN MENU");


            // ==========================================
            // CLASSROOM
            // ==========================================

            System.out.println();
            System.out.println("----- CLASSROOM -----");

            System.out.println(
                    "TEACHER JOAQUIN: CLASSROOM: 10:30 AM"
            );


            // ==========================================
            // GYM
            // ==========================================

            System.out.println();
            System.out.println("----- GYM -----");

            System.out.println(
                    "TEACHER JOAQUIN: GYM: 1:00 PM"
            );


            // ==========================================
            // COMPUTER LAB
            // ==========================================

            System.out.println();
            System.out.println("----- COMPUTER LAB -----");

            System.out.println(
                    "TEACHER JOAQUIN: COMPUTER LAB: 2:00 PM"
            );


            // ==========================================
            // SCIENCE LAB
            // ==========================================

            System.out.println();
            System.out.println("----- SCIENCE LABORATORY -----");

            System.out.println(
                    "TEACHER JOAQUIN: SCIENCE LABORATORY: 3:00 PM"
            );


            // ==========================================
            // CONNECT TO MAIN MENU
            // ==========================================

            System.out.println();
            System.out.println("Opening MAIN MENU...");

            MainMenu.execute(scanner, role);
        }


        // ==========================================
        // STUDENT
        // ==========================================

        else if (role.equalsIgnoreCase("Student")) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("    WELCOME BACK STUDENT");
            System.out.println("==============================");

            System.out.println();

            System.out.println("1. CLASSROOM");
            System.out.println("2. RESTROOM");
            System.out.println("3. CANTEEN");
            System.out.println("4. OTHERS");
            System.out.println("5. MAIN MENU");


            // ==========================================
            // CLASSROOM
            // ==========================================

            System.out.println();
            System.out.println("----- CLASSROOM -----");

            System.out.println("CLASSROOM: 10:30 AM");


            // ==========================================
            // RESTROOM
            // ==========================================

            System.out.println();
            System.out.println("----- RESTROOM -----");

            System.out.println("RESTROOM: 11:00 AM");


            // ==========================================
            // CANTEEN
            // ==========================================

            System.out.println();
            System.out.println("----- CANTEEN -----");

            System.out.println("CANTEEN: 12:30 PM");


            // ==========================================
            // OTHERS
            // ==========================================

            System.out.println();
            System.out.println("----- OTHERS -----");

            System.out.println("GYM: 1:00 PM");
            System.out.println("COMPUTER LAB: 2:00 PM");
            System.out.println("SCIENCE LAB: 3:00 PM");


            // ==========================================
            // CONNECT TO MAIN MENU
            // ==========================================

            System.out.println();
            System.out.println("Opening MAIN MENU...");

            MainMenu.execute(scanner, role);
        }


        // ==========================================
        // UNKNOWN ROLE
        // ==========================================

        else {

            System.out.println();
            System.out.println("ERROR: Unknown user role.");
        }
    }
}