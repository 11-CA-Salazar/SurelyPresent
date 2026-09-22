package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;
public class Settings {
    public static void execute(Scanner scanner){

        System.out.println("====1.PROFILE");
        System.out.println("====2.NOTIFICATION");
        System.out.println("====3.DARK MODE");
        System.out.println("====4.PRIVACY");
        System.out.println("====5.ABOUT");
        System.out.println("====6.LOGOUT\n");

        int choice = 1;
        boolean chosed = true;

        while(chosed){
            switch(choice){
                case 1:
                    System.out.println("============");
                    System.out.println("USER PROFILE");
                    System.out.println("============\n");
                    System.out.println("1.Change username");
                    System.out.println("2.Change Password");
                    System.out.println("3.Add email\n");
                    choice++;
                    break;
                case 2:
                    System.out.println("============");
                    System.out.println("NOTIFICATION");
                    System.out.println("============\n");
                    System.out.println("1.On Notification");
                    System.out.println("2.Off Notification\n");
                    choice++;
                    break;
                case 3:
                    System.out.println("============");
                    System.out.println("  DARK MODE  ");
                    System.out.println("============\n");
                    System.out.println("1.On Darkmode");
                    System.out.println("2.Off Darkmode\n");
                    choice++;
                    break;
                case 4:
                    System.out.println("============");
                    System.out.println("   PRIVACY  ");
                    System.out.println("============\n");
                    System.out.println("1. Privacy Center");
                    System.out.println("2. Privacy Checkup");
                    System.out.println("3. Activity log\n");
                    choice++;
                    break;
                case 5:
                    System.out.println("============");
                    System.out.println("    ABOUT    ");
                    System.out.println("============\n");
                    System.out.println("#############");
                    System.out.println("#############");
                    System.out.println("#############");
                    System.out.println("#############");
                    System.out.println("#############");
                    System.out.println("#############\n");
                    choice++;
                    break;
                case 6:
                    System.out.println("=============");
                    System.out.println("   LOG OUT   ");
                    System.out.println("=============\n");
                    chosed = false; // ENDS THE LOOP
                    break;

                default:
                    chosed = false;
                    break;
            }
        }



    }
}
