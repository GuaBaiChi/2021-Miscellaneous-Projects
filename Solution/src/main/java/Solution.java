
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        NumberGame game = new NumberGame();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int lowerBound = 0;
        int higherBound = 100;

        System.out.println("Guess a number");
        while (run) {//start the while loop
            int number = (lowerBound + higherBound) / 2;
            System.out.println("Guess a number: " + number);
            
            int result = game.Guess(number);
             if (result == -1) {
                System.out.println("Lower");
                higherBound = number;
            }
            if (result == 1) {
                System.out.println("Higher");
                lowerBound = number + 1;
            }
            if (result == 0) {
                System.out.println("Would you like to play again? (Y/N)");
                String inputYN = scanner.nextLine();
                if (inputYN.equals("n")) {
                    run = false;
                }
                    lowerBound = 0;
                    higherBound = 100;
            }
        }//end the while loop
        System.out.println("Goodbye");
    }
}
