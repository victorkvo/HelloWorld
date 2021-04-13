package com.victor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = input.nextLine();

        System.out.println("Hello " + firstName);
        // System.out.println("Hello %s!\n", firstName);
        System.out.print("Son");
    }
}
