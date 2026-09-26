package com.example.surelypresent.quarter2.MiniPeta_3;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainMenuTest {

    @Test
    public void testCompleteSystemFlow() {


        // ==========================================
        // AUTOMATED INPUT
        // ==========================================

        StringBuilder simulatedUserInput =
                new StringBuilder();


        // ==========================================
        // CLYDE - ADMIN
        // ==========================================

        simulatedUserInput.append("1\n");
        simulatedUserInput.append("Clyde\n");
        simulatedUserInput.append("Clyde123\n");


        // ==========================================
        // JOAQUIN - TEACHER
        // ==========================================

        simulatedUserInput.append("1\n");
        simulatedUserInput.append("Joaquin\n");
        simulatedUserInput.append("Joaquin123\n");


        // ==========================================
        // CERBITO - STUDENT
        // ==========================================

        simulatedUserInput.append("1\n");
        simulatedUserInput.append("Cerbito\n");
        simulatedUserInput.append("Cerbito123\n");


        // ==========================================
        // CREATE SCANNER
        // ==========================================

        Scanner scanner =
                new Scanner(
                        new ByteArrayInputStream(
                                simulatedUserInput
                                        .toString()
                                        .getBytes()
                        )
                );


        // ==========================================
        // CREATE LOGIN SYSTEM
        // ==========================================

        LoginSystem loginSystem =
                new LoginSystem();


        // ==========================================
        // LOGIN TEST #1
        // CLYDE
        // ==========================================

        System.out.println();
        System.out.println("========================================");
        System.out.println("             LOGIN TEST #1");
        System.out.println("========================================");

        String role1 =
                loginSystem.authenticate(scanner);


        if (role1 != null) {

            System.out.println();
            System.out.println("Connecting to UserFeature...");

            UserFeature.execute(
                    scanner,
                    role1
            );
        }


        // ==========================================
        // LOGIN TEST #2
        // JOAQUIN
        // ==========================================

        System.out.println();
        System.out.println("========================================");
        System.out.println("             LOGIN TEST #2");
        System.out.println("========================================");

        String role2 =
                loginSystem.authenticate(scanner);


        if (role2 != null) {

            System.out.println();
            System.out.println("Connecting to UserFeature...");

            UserFeature.execute(
                    scanner,
                    role2
            );
        }


        // ==========================================
        // LOGIN TEST #3
        // CERBITO
        // ==========================================

        System.out.println();
        System.out.println("========================================");
        System.out.println("             LOGIN TEST #3");
        System.out.println("========================================");

        String role3 =
                loginSystem.authenticate(scanner);


        if (role3 != null) {

            System.out.println();
            System.out.println("Connecting to UserFeature...");

            UserFeature.execute(
                    scanner,
                    role3
            );
        }


        // ==========================================
        // CLOSE SCANNER
        // ==========================================

        scanner.close();


        // ==========================================
        // COMPLETE
        // ==========================================

        System.out.println();
        System.out.println("========================================");
        System.out.println("          ALL TESTS COMPLETE");
        System.out.println("========================================");
    }
}