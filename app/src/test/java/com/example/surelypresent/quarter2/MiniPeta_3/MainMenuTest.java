package com.example.surelypresent.quarter2.MiniPeta_3;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainMenuTest {

    @Test
    public void testCompleteSystemFlow() {



        StringBuilder simulatedUserInput = new StringBuilder();

        System.out.println("--- GENERATING SIMULATED USER INPUTS ---");

        simulatedUserInput.append("1\n");
        simulatedUserInput.append("Clyde\n");
        simulatedUserInput.append("Clyde123\n");

        simulatedUserInput.append("1\n");
        simulatedUserInput.append("Joaquin\n");
        simulatedUserInput.append("Joaquin123\n");

        simulatedUserInput.append("1\n");
        simulatedUserInput.append("Cerbito\n");
        simulatedUserInput.append("Cerbito123\n");

        simulatedUserInput.append("1\n");
        simulatedUserInput.append("Sophia\n");
        simulatedUserInput.append("Sophia123\n");

        Scanner scanner = new Scanner(
                new ByteArrayInputStream(
                        simulatedUserInput.toString().getBytes()
                )
        );

        LoginSystem loginSystem = new LoginSystem();

        System.out.println("\n========================================");
        System.out.println("       LOGIN TEST #1 - ADMIN");
        System.out.println("========================================");

        loginSystem.authenticate(scanner);

        System.out.println("\n========================================");
        System.out.println("       LOGIN TEST #2 - TEACHER");
        System.out.println("========================================");

        loginSystem.authenticate(scanner);


        System.out.println("\n========================================");
        System.out.println("       LOGIN TEST #3 - STUDENT");
        System.out.println("========================================");

        loginSystem.authenticate(scanner);


        System.out.println("\n========================================");
        System.out.println("       LOGIN TEST #4 - INVALID");
        System.out.println("========================================");

        loginSystem.authenticate(scanner);

        scanner.close();

        System.out.println("\n========================================");
        System.out.println("       ALL LOGIN TESTS COMPLETE");
        System.out.println("========================================");
    }
}