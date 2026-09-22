package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;

public class FilterUser {
    public static void execute(Scanner scanner) {

        int choice = 1;
        boolean chosed = true;

        System.out.println("What type of user are you?");
        System.out.println("1. Admin");
        System.out.println("2. Teacher");
        System.out.println("3. Student\n");

        while (chosed) {
            switch (choice) {
                case 1:
                    System.out.println("=====WELCOME BACK ADMIN======\n");
                    System.out.println("============================");
                    System.out.println("         1.CLASS LIST       ");
                    System.out.println("============================\n");
                    System.out.println("===============================");
                    System.out.println("         2.AUDIT               ");
                    System.out.println("===============================\n");
                    System.out.println("============================");
                    System.out.println("         3.SBMO              ");
                    System.out.println("============================\n");
                    System.out.println("===============================");
                    System.out.println("         4.GUIDANCE            ");
                    System.out.println("===============================\n");
                    System.out.println("===============================");
                    System.out.println("         5.TIME OF LOC         ");
                    System.out.println("===============================\n");

                    choice++; // MOVES TO THE TEACHER OPTION
                    break;

                case 2:
                    System.out.println("=====WELCOME BACK TEACHER======\n");
                    System.out.println("==============================");
                    System.out.println("          1.ATTENDANCE        ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          2.SCORES              ");
                    System.out.println("================================\n");
                    System.out.println("==============================");
                    System.out.println("          3.GRADEBOOK ACCESS      ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          4.REPORT CARD          ");
                    System.out.println("================================\n");
                    System.out.println("================================");
                    System.out.println("          5.ONLINE QUIZZEZ        ");
                    System.out.println("================================\n");
                    choice++; // MOVES TO THE QUESTION "ARE YOU AN OFFICER?"
                    break;

                case 3:
                    System.out.println("=====ARE YOU AN OFFICER?=====");
                    System.out.println("1. Yes");
                    System.out.println("2. No\n");
                    choice++; // MOVES TO THE OFFICERS OPTIONS
                    break;

                case 4:
                    System.out.println("What officer are you?");
                    System.out.println("1. Vice/President");
                    System.out.println("2. Asst./Secretary");
                    System.out.println("3. Treasurer/Auditor\n");
                    choice++; // WILL SWITC TO THE VICE PRESIDENT OR IVCE PRESIDENT
                    break;

                case 5:
                    System.out.println("===WELCOME BACK VICE/PRESIDENT===");
                    System.out.println("==============================");
                    System.out.println("          1.STUDENT HANDBOOK        ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          2.ACADEMIC MANAGEMENT   ");
                    System.out.println("================================\n");
                    System.out.println("==============================");
                    System.out.println("          3.STUDENT SERVICES        ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          4.SUPPORT RESOURCES        ");
                    System.out.println("================================\n");
                    System.out.println("================================");
                    System.out.println("          5.CLUBS AND ORGANIZATION DIRECTORY ");
                    System.out.println("================================\n");
                    choice++; // WILL SWITCH TO TREASURER OR AUDITOR
                    break;

                case 6:
                    System.out.println("===WELCOME BACK VICE/PRESIDENT===");
                    System.out.println("==============================");
                    System.out.println("          1.STUDENT HANDBOOK        ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          2.ACADEMIC MANAGEMENT   ");
                    System.out.println("================================\n");
                    System.out.println("==============================");
                    System.out.println("          3.STUDENT SERVICES        ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          4.SUPPORT RESOURCES        ");
                    System.out.println("================================\n");
                    System.out.println("================================");
                    System.out.println("          5.CLUBS AND ORGANIZATION DIRECTORY ");
                    System.out.println("================================\n");
                    choice++; // WILL SWITCH TO TREASURER OR AUDITOR
                    break;

                case 7:
                    System.out.println("===WELCOME BACK TREASURER/AUDITOR===");
                    System.out.println("          1.BUDGET MANAGEMENT        ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          2.FINANCIAL REPORTING     ");
                    System.out.println("================================\n");
                    System.out.println("==============================");
                    System.out.println("          3.RECORD KEEPING      ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          4.PROCESS PAYMENT        ");
                    System.out.println("================================\n");
                    System.out.println("================================");
                    System.out.println("          5.PROFIT DISTRIBUTION ");
                    System.out.println("================================\n");
                    choice++; // WILL SWITCH TO REGULAR STUDENT
                    break;

                case 8:
                    System.out.println("=======WELCOME BACK DEAR STUDENT======");
                    System.out.println("          1.GRADES             ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          2.CLASS SCHEDULE     ");
                    System.out.println("================================\n");
                    System.out.println("==============================");
                    System.out.println("          3.SCHOOL EMAIL     ");
                    System.out.println("===============================\n");
                    System.out.println("================================");
                    System.out.println("          4.ASSIGNMENTS      ");
                    System.out.println("================================\n");
                    System.out.println("================================");
                    System.out.println("          5.QUIPPER           ");
                    System.out.println("================================\n");
                    chosed = false; // ENDS THE LOOP
                    break;

                default:
                    chosed = false;
                    break;
            }
        }
    }
}