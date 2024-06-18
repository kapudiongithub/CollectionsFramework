package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsExercise {

    static ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("Orange", "Banana", "Grape", "Guava"));

    public static void main(String[] args) {

        String targetFruit = "Guava";
        useContainsMethod(targetFruit);

        /* SEARCH FOR A SPECIFIC ELEMENT IN AN ARRAYLIST AND ASSIGN IT TO A VARIABLE
         * Approach1: Using a Loop
         */

        String foundElement = null;

        for (String element : fruitList) {
            if (element.equals("Grape")) {
                foundElement = element;
                break;
            }
        }

        if (foundElement != null) {
            System.out.println("The fruit " + "'" + foundElement + "'" + " was found in the fruitList");
        } else {
            System.out.println("Fruit was not found in the fruitList");
        }

    }

    /* SEARCH FOR A SPECIFIC ELEMENT IN AN ARRAYLIST AND ASSIGN IT TO A VARIABLE
     * Approach2: Use the contains method and get the index
     */
    public static void useContainsMethod(String fruit) {

        //Check if the list contains the specific element
        if (fruitList.contains(fruit)) {
            // Find the index of the element and retrieve it
            int index = fruitList.indexOf(fruit);
            // Get element by index and Assign it to a variable
            String elementFound = fruitList.get(index);

            System.out.println("The fruit " + "'" + elementFound + "'" + " was found at index " + index);
        } else {
            System.out.println("Fruit was not found in the fruitList");
        }
    }
}
