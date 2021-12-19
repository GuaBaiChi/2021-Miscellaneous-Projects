// Write a program that prompts the user to input a number. 
// The number is expected to be an integer (no error handling necessary). 
// If the number is a multiple of 3, print "fizz", if the number is a multiple of 5, print "buzz", 
// if the number is both a multiple of 3 and 5, print "fizzbuzz".

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number == 0){
                break;
            }
            else if (number % 3 == 0 && number % 5 ==0){
                System.out.println("FizzBuzz");
            }
            else if (number % 3 == 0){
                System.out.println("Fizz");
            }
            else if (number % 5 == 0){
                System.out.println("Buzz");
            }
        }
        System.out.println("Thank you!");
    }
}