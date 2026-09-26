package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;

public class MainMenu {

    public static void execute(Scanner scanner, String role) {

        System.out.println();
        System.out.println("================================");
        System.out.println("           MAIN MENU");
        System.out.println("================================");

        System.out.println();


        // ==========================================
        // ADMIN MAIN MENU
        // ==========================================

        if (role.equalsIgnoreCase("Admin")) {

            System.out.println("1. PROFILE");
            System.out.println("2. CLASS LIST");
            System.out.println("3. ADVISORY");
            System.out.println("4. OFFICERS");
            System.out.println("5. AUDIT");
            System.out.println("6. ATTENDANCE");
            System.out.println("7. CLEANERS");

            System.out.println();
            System.out.println("Automatically loading ADMIN features...");


            // ==========================================
            // PROFILE
            // ==========================================

            System.out.println();
            System.out.println("----- PROFILE -----");

            System.out.println("NAME: CLYDE");
            System.out.println("ROLE: ADMIN");
            System.out.println("SCHOOL: CARLO ACUTIS");


            // ==========================================
            // CLASS LIST
            // ==========================================

            System.out.println();
            System.out.println("----- CLASS LIST -----");

            System.out.println("Class 1");
            System.out.println("Class 2");
            System.out.println("Class 3");
            System.out.println("Class 4");
            System.out.println("Class 5");


            // ==========================================
            // ADVISORY
            // ==========================================

            System.out.println();
            System.out.println("----- ADVISORY -----");

            System.out.println("ADVISORY CLASS: CARLO ACUTIS");
            System.out.println("ADVISOR: JOAQUIN");


            // ==========================================
            // OFFICERS
            // ==========================================

            System.out.println();
            System.out.println("----- OFFICERS -----");

            System.out.println("VICE PRESIDENT");
            System.out.println("SECRETARY");
            System.out.println("TREASURER");
            System.out.println("AUDITOR");
            System.out.println("CLEANERS");


            // ==========================================
            // AUDIT
            // ==========================================

            System.out.println();
            System.out.println("----- AUDIT -----");

            System.out.println("TOTAL FUNDS: PHP 10,000");
            System.out.println("EXPENSES: PHP 3,500");
            System.out.println("REMAINING FUNDS: PHP 6,500");


            // ==========================================
            // ATTENDANCE
            // ==========================================

            System.out.println();
            System.out.println("----- ATTENDANCE -----");

            System.out.println("PRESENT: 25");
            System.out.println("ABSENT: 3");
            System.out.println("LATE: 2");


            // ==========================================
            // CLEANERS
            // ==========================================

            System.out.println();
            System.out.println("----- CLEANERS -----");

            System.out.println("CLEANER 1: CLASSROOM");
            System.out.println("CLEANER 2: RESTROOM");
            System.out.println("CLEANER 3: CANTEEN");
        }


        // ==========================================
        // TEACHER MAIN MENU
        // ==========================================

        else if (role.equalsIgnoreCase("Teacher")) {

            System.out.println("1. PROFILE");
            System.out.println("2. CLASS LIST");
            System.out.println("3. ADVISORY");
            System.out.println("4. OFFICERS");

            System.out.println();
            System.out.println("Automatically loading TEACHER features...");


            // ==========================================
            // PROFILE
            // ==========================================

            System.out.println();
            System.out.println("----- PROFILE -----");

            System.out.println("NAME: JOAQUIN");
            System.out.println("ROLE: TEACHER");
            System.out.println("ASSIGNED AREA: CARLO ACUTIS");


            // ==========================================
            // CLASS LIST
            // ==========================================

            System.out.println();
            System.out.println("----- CLASS LIST -----");

            System.out.println("Class 1");
            System.out.println("Class 2");
            System.out.println("Class 3");
            System.out.println("Class 4");
            System.out.println("Class 5");


            // ==========================================
            // ADVISORY
            // ==========================================

            System.out.println();
            System.out.println("----- ADVISORY -----");

            System.out.println("ADVISORY CLASS: CARLO ACUTIS");
            System.out.println("ADVISOR: JOAQUIN");


            // ==========================================
            // OFFICERS
            // ==========================================

            System.out.println();
            System.out.println("----- OFFICERS -----");

            System.out.println("VICE PRESIDENT");
            System.out.println("SECRETARY");
            System.out.println("TREASURER");
            System.out.println("AUDITOR");
            System.out.println("CLEANERS");
        }


        // ==========================================
        // STUDENT MAIN MENU
        // ==========================================

        else if (role.equalsIgnoreCase("Student")) {

            System.out.println("MAIN MENU FEATURES");
            System.out.println();

            System.out.println("---- VICE/PRESIDENT ----");
            System.out.println("1. AUDIT");
            System.out.println("2. ATTENDANCE");
            System.out.println("3. CLEANERS");

            System.out.println();

            System.out.println("---- ASST/SECRETARY ----");
            System.out.println("1. ATTENDANCE");
            System.out.println("2. CLEANERS");

            System.out.println();

            System.out.println("---- TREASURER/AUDITOR ----");
            System.out.println("1. AUDIT");
            System.out.println("2. CLEANERS");


            // ==========================================
            // AUDIT
            // ==========================================

            System.out.println();
            System.out.println("----- AUDIT -----");

            System.out.println("TOTAL FUNDS: PHP 10,000");
            System.out.println("EXPENSES: PHP 3,500");
            System.out.println("REMAINING FUNDS: PHP 6,500");


            // ==========================================
            // ATTENDANCE
            // ==========================================

            System.out.println();
            System.out.println("----- ATTENDANCE -----");

            System.out.println("PRESENT: 25");
            System.out.println("ABSENT: 3");
            System.out.println("LATE: 2");


            // ==========================================
            // CLEANERS
            // ==========================================

            System.out.println();
            System.out.println("----- CLEANERS -----");

            System.out.println("CLEANER 1: CLASSROOM");
            System.out.println("CLEANER 2: RESTROOM");
            System.out.println("CLEANER 3: CANTEEN");
        }


        // ==========================================
        // UNKNOWN ROLE
        // ==========================================

        else {

            System.out.println("ERROR: Unknown role.");
        }


        // ==========================================
        // END
        // ==========================================

        System.out.println();
        System.out.println("================================");
        System.out.println("        MAIN MENU COMPLETE");
        System.out.println("================================");
    }
}