package com.victor;
import java.util.Scanner;

public class Madlib {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = userInput.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = userInput.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = userInput.nextLine();
        System.out.println("Give me a noun: ");
        String noun = userInput.nextLine();
        System.out.println("Give me another noun: ");
        String nounTwo = userInput.nextLine();
        System.out.println("Give me your name: ");
        String yourName = userInput.nextLine();
        System.out.println("Give me a number: ");
        int number = Integer.parseInt(userInput.nextLine());

        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and " +
                "I want to be your %s!", adverb, adjective, noun);
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);
    }
}










//package com.victor;
//
//import java.util.Scanner;
//
//public class Madlib {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter another person's name.");
//        String name = input.nextLine();
//        System.out.println("Enter an adverb.");
//        String adverb = input.nextLine();
//        System.out.println("Enter an adjective.");
//        String adjective = input.nextLine();
//        System.out.println("Enter a noun.");
//        String nounOne = input.nextLine();
//        System.out.println("Enter another noun.");
//        String nounTwo = input.nextLine();
//        System.out.println("What is your name?");
//        String yourName = input.nextLine();
////        System.out.println("Enter a number.");
////        int number = input.nextInt();
//
//
//        System.out.println("Dear %s", name);
//        System.out.println("You are %s %s and I want to be your %s! I want to go to the %s with you in %d days. ",
//                adverb, adjective, nounOne, nounTwo, number);
//        System.out.println("Sincerely %s", yourName);
//    }
//}



//    Scanner input = new Scanner(System.in);
//        System.out.println("What is your name?");
//                String firstName = input.nextLine();
//
//                System.out.println("Hello " + firstName);
//                // System.out.println("Hello %s!\n", firstName);
//                System.out.print("Son");