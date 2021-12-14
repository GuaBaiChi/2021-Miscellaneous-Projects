//

import java.util.Scanner;

public class EverythingFunctions {
    
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        String menu = "-------------\nMenu\n1) Echo\n2) Sum\n3) Factorial\n4) Exit\n\nYour Selection: ";
        Boolean active = true;
        while (active) {
            System.out.println(menu);
            int userInput = Integer.valueOf(scanner.nextLine());
            // Add code for each menu option

            // Menu option 1)
            if (userInput == 1) {
                Echo();
            } // Menu option 2)
            else if (userInput == 2) {
                Add();
            } //Menu option 3)
            else if (userInput == 3) {
                Factorial();
            } // Menu option 4) Exit here
            else if (userInput == 4) {
                System.out.println("Goodbye");
                active = false;
            } else {
                System.out.println("Selection Invalid");
            }
        }
    }

    public static void Echo() {
        System.out.println("Enter test to echo: ");
        String userInput2 = String.valueOf(scanner.nextLine());
        System.out.println("You entered: " + userInput2);
    }

    public static void Add() {
        System.out.println("Enter the first number: ");
        int numberA = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the second number: ");
        int numberB = Integer.valueOf(scanner.nextLine());
        int sum = numberA + numberB;
        System.out.println(numberA + " + " + numberB + " = " + sum);
    }

    public static void Factorial() {
        
        System.out.println("Enter a number: ");
        int inputFromUser3 = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        if (inputFromUser3 < 0) {
            System.out.println("Invalid input");
        } else {

            if (inputFromUser3 > 0) {
                for (int i = 1; i <= inputFromUser3; i++) {
                    factorial = factorial * i;
                }
            }

            System.out.println(inputFromUser3 + "! = " + factorial);

        }
    }
}

