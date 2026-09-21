package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;
public class ColorChanger {
    public void ColorChange(Scanner scanner) {
        String present = "Green";
        String late = "Yellow";
        String absent = "Red";
        String user = scanner.nextLine();

            if (user.equals("Green")) { // If user is present and late he is late
                System.out.println("User color is: " + present);
            } else if (user.equals("Yellow")) {
                System.out.println("User Color is: " + late);
            } else if (user.equals("Red")) {
                System.out.println("User Color is:" + absent);
            }
    }
}