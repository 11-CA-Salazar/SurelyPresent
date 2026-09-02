package com.example.surelypresent.quarter2;

import org.junit.Test;
public class cerbitoFunction {
    @Test
    public void printMyProfile() {
        // ---1. THE INPUT (storing your personal details in variables)--//
        String myName = "Gelo";
        String petName = "Clyde";
        String favFood = "Fries";
        int myAge = 16;

        // --- 2 THE OUTPUT (Printing to the console) ---
        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello my name is " + myName + " And I am " + myAge + " Years old");
        System.out.println("I have a wonderful pet named " + petName);
        System.out.println("If i could, I would eat " + favFood + " Every single day!");

    }
}