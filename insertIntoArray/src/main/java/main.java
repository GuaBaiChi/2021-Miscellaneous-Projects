import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };

        System.out.println("Printing array list");
        for (Integer x : array) {
            System.out.println(x);
        }

        System.out.println("Inserting value 10 into list at index 1");
        insertIntoArray(array, 10, 1);

        System.out.println("Printing array list");
        for (Integer x : array) {
            System.out.println(x);
        }
        // Should print: 1, 10, 2, 3

        System.out.println("Inserting value 200 into list at index 12");
        insertIntoArray(array, 200, 12);

        System.out.println("Printing array list");
        for (Integer x : array) {
            System.out.println(x);
        }
        // Should print: 1, 10, 2, 3, 200

        System.out.println("Inserting value 5 into list at index 0");
        insertIntoArray(array, 5, 0);

        System.out.println("Printing array list");
        for (Integer x : array) {
            System.out.println(x);
        }
        // Should print: 5, 1, 10, 2, 3, 200
    }
}
