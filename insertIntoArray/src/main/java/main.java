
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

   public static void insertIntoArray(ArrayList<Integer> array, int data, int position) {
        //You should preserve the order of the array list after inserting.
        //Example, if the array is [0,2,3] and you call
        //insertIntoArray(array, 10, 1) then the array should now be [0,10,2,3].
        if (position < array.size()){
            array.add(position,data);
        }
        //If the position given is larger than the array.
        //Add the data to the end of the array.
        else {
            array.add(array.size(), data);
        }
        //another way you can achieve that, but I will comment that, and you can check it
        //array.add(Math.min(position, array.size()), data);

        System.out.println(array);

    }
}

//Create a function called insertIntoArray with the following prototype:
//The first argument ArrayList<Integer> array is an array of integers.
//The second argument int data is an integer to be inserted into the array list.
//The third argument int position is the index within the 
//array that data should be added to.
//You should preserve the order of the array list after inserting. 
//Example, if the array is [0,2,3] and you call 
//insertIntoArray(array, 10, 1) then the array should now be [0,10,2,3].
//If the position given is larger than the array. 
//Add the data to the end of the array. 
