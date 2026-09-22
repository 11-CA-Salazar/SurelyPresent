package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;
public class ColorChanger {
    public static void execute(Scanner scanner) {
        String present = "Green";
        String late = "Yellow";
        String absent = "Red";
        String user = scanner.nextLine();

        switch (user) {
            case "Green":  // If user is present and late he is present
                System.out.println("User color is: " + present);
                break;
            case "Yellow": // If user is present and late he is late
                System.out.println("User Color is: " + late);
                break;
            case "Red": // If user is present and late he is absent
                System.out.println("User Color is:" + absent);
                break;
        }
    }
}