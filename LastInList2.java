
import java.util.ArrayList;
import java.util.Scanner;
//For an array list
//For getting input from a user

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This will convert input from the scanner into a String for the Array
        ArrayList<String> inputList = new ArrayList<>();

        // Part 1) Read input from user and store into an ArrayList until the user enters an empty string
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            inputList.add(input);
        }

        // Part 2) TODO: Read input from the user until the user enters an empty string. For each non-empty input a user provides, print "FOUND" or "NOT FOUND" depending on whether or not the input is within the ArrayList
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            // Check if input is in the ArrayList!
            if (inputList.contains(input)) {
                System.out.println("FOUND");
            } else {
                System.out.println("NOT FOUND");
            }
        }

        // Part 3) Print the number of items in the ArrayList and exit
        System.out.println("The list size is: " + inputList.size());

    }
}
