package com.victor;
import java.util.Scanner;


public class Homework {
    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                System.out.println("What animal sound do you want to hear?\n Choose from sheep, horse, cat, dog, cow," +
                        " or pikachu.");
                String name = input.nextLine();
                if (name.equalsIgnoreCase("sheep")) {
                    System.out.print("bahh!");
                } else if (name.equalsIgnoreCase("horse"))  {
                    System.out.print("neigh!");
                } else if (name.equalsIgnoreCase("cat"))  {
                    System.out.print("moew!");
                } else if (name.equalsIgnoreCase("dog"))  {
                    System.out.print("wooof!");
                } else if (name.equalsIgnoreCase("cow"))  {
                    System.out.print("moooo!");
                } else if (name.equalsIgnoreCase("pikachu"))  {
                    System.out.print("pika!");
                } else {
                    System.out.print("meh!");
            }
        }
    }

