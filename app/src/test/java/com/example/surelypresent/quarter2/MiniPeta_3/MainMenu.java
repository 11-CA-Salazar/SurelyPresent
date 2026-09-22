package com.example.surelypresent.quarter2.MiniPeta_3;

import java.util.Scanner;

public class MainMenu{
    public void start(Scanner scanner){
        System.out.println("=============");
        System.out.println("  Main Menu");
        System.out.println("#############");
        System.out.println("#############");
        System.out.println("#############");
        System.out.println("#############");
        System.out.println("#############");
        System.out.println("#############");
        System.out.println("#############\n");
        int choice = 1;
        boolean chosed = true;
        while (chosed) {
            if (choice == 1) {
                System.out.println("================");
                System.out.println("    Settings!   ");
                System.out.println("================\n");
                Settings settings = new Settings();
                Settings.execute(scanner);

            }else if (choice == 2){
                System.out.println("================");
                System.out.println("FILTERING USER!");
                System.out.println("================\n");
                FilterUser filterUser = new FilterUser();
                FilterUser.execute(scanner);
            }else if (choice == 3){
                System.out.println("==============");
                System.out.println("COLOR CHANGER!");
                System.out.println("==============\n");
                ColorChanger colorChanger = new ColorChanger();
                ColorChanger.execute(scanner);
            }else {
                chosed = false;
            }
            choice++;
        }
    }
}