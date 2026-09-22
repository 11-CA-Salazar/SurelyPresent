package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;
public class ColorChanger {
    public static void execute(Scanner scanner) {
        String present = "Green";
        String late = "Yellow";
        String absent = "Red";

        System.out.println("================================");
        System.out.println("========= USER STATUS ==========");
        System.out.println("================================");


        int choice = 1;
        boolean chosed = true;

        while(chosed) {
                    switch (choice) {
                        case 1:  // If user is present and late he is present
                            System.out.println("===========================================");
                            System.out.println("========= USER IS PRESENT: " + present + " ==========");
                            System.out.println("===========================================");
                            choice++;
                            break;
                        case 2: // If user is present and late he is late
                            System.out.println("===========================================");
                            System.out.println("========= USER IS LATE: " + late + " ============");
                            System.out.println("===========================================");
                            choice++;
                            break;
                        case 3: // If user is present and late he is absent
                            System.out.println("===========================================");
                            System.out.println("========= USER IS ABSENT: " + absent + " =============");
                            System.out.println("===========================================");
                            chosed = false;
                            break;
                        default:
                            chosed = false;
                            break;
                    }

        }
    }
}