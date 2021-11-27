//Write a Java function called printMultiples which accepts an int argument. 
//This function should print each number 2 or greater that evenly divides 
//the function's argument. 
//print the denominators

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input a number and we'll show you the denominators");
        int number = scanner.nextInt();
        ArrayList<Integer> multiples = findMultiples(number);
        System.out.print("Denominators of " + number + " are: ");
        for (int i = 0; i < multiples.size(); i++) {
            
            System.out.print(multiples.get(i) + " ");
        }
    }

    public static ArrayList<Integer> findMultiples(int number) {
        ArrayList<Integer> multiples = new ArrayList<>();

        // loop runs from 2 to number
        for (int i = 2; i <= number; ++i) {

            // if int number is divisible by i
            // i is a denominator of in number
            if (number % i == 0) {
                multiples.add(i);
            }
        }
        return multiples;
    }
}
