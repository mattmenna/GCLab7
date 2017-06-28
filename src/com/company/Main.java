package com.company;

/*
Write a program that will recognize invalid inputs when the user requests information about students in a class
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        int[] studentNum = new int[20];
        String[] studentFood = new String[20];
        String[] studentHome = new String[20];

        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-20);");
        try {
            num = scnr.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
