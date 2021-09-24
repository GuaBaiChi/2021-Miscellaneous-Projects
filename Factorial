//

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Que es la ultima nombre?");
        int ultimaNombre = Integer.valueOf(scanner.nextLine());
        int product = 1;
        
        for(int i = 2; i <= ultimaNombre; i++) {
            product = product * i;
        }
        System.out.println("Factorial: " + product);
    }
}
// start i at 2, for the factorial to avoid 1*1
// sum is not accurate, change sum to product. This reflects multiplication
// <= in the for loop instead of an < and having an additional step outside the for loop
// bug, did not produce a factorial. '<= sum' into ultimaNombre
