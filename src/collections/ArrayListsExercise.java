package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsExercise {
    public static void main(String[] args) {

        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("Orange", "Banana", "Grape", "Guava"));

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

        /* SEARCH FOR A SPECIFIC ELEMENT IN AN ARRAYLIST AND ASSIGN IT TO A VARIABLE
         * Approach2: Using the contains method and get the index
         */

        //Check if the list contains the specific element
        if (fruitList.contains("Guava")) {
            // Find the index of the element and retrieve it
            int index = fruitList.indexOf("Guava");
            String elementFound = fruitList.get(index);
            System.out.println("The fruit " + "'" + elementFound + "'" + " was found at index " + index);
        }else {
            System.out.println("Fruit was not found in the fruitList");
        }
    }


    public static String searchList(String ele) {
        String foundElement = ele;

        return foundElement;
    }
}
