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
        System.out.println("#############");
        int choice = 1;
        boolean chosed = true;
        while (chosed) {
            if (choice == 1) {
                System.out.println("=========");
                System.out.println("FILTERING USER!");
                FilterUser filterUser = new FilterUser();
                FilterUser.execute(scanner);
            } chosed = false;
        }
    }
}