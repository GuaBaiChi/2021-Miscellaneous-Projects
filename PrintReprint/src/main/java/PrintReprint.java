//

import java.util.Scanner;

public class PrintReprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("How many times?");
        int xtimes = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        while (count < xtimes) {
            printText();
            count++;
        }
        
        // then call the printText-method multiple times with a while-loop
        
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
