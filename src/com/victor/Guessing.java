package com.victor;
import java.util.Scanner;
import java.util.Random;

public class Guessing {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(10);

        Scanner input = new Scanner(System.in);
        System.out.println("Can you guess my number? Pick a number 0-10.");

        int yourNumb = Integer.parseInt(input.nextLine());
        if (randomNumber == yourNumb) {
            System.out.print("Wow!");
        } else {
            System.out.print("Nope! My number was " + randomNumber);
        }
    }
}

