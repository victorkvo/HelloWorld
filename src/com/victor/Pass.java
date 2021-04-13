package com.victor;
import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What was your grade in the class?");

        int yourNumb = Integer.parseInt(input.nextLine());
        if (yourNumb >= 60) {
            System.out.print("You have passed!");
        } else {
            System.out.print("You must retake the class!");
        }

    }
}
