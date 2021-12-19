// Write a program that prompts the user to input a number. 
// The number is expected to be an integer (no error handling necessary). 
// If the number is a multiple of 3, print "fizz", if the number is a multiple of 5, print "buzz", 
// if the number is both a multiple of 3 and 5, print "fizzbuzz".

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
            

        while (true) {
            int input = scanner.nextInt();
            
            if (input == 0) {
                System.out.println("Thank you!");
                break;
            }
            else if (input % 3 == 0 && input % 5 ==0) {
                System.out.println("FizzBuzz");
            }
            else if (input % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (input % 5 == 0) {
                System.out.println("Buzz");

            }
//            System.out.println("Input a number: ");
        }
    }
}