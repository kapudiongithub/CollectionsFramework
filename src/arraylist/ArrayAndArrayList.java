package arraylist;

import java.sql.Array;
import java.util.*;

public class ArrayAndArrayList {

    public static void main(String[] args) {
        String[] namesArray = {"Bobo", "Gomo", "Kamo", "Lebo", "Nolo"};

        // Check length of namesArray
        System.out.println("\nLength of namesArray is: " + namesArray.length);

        // Print contents of namesArray
        System.out.println("\nElements of namesArray:");
        for (String el : namesArray) {
            System.out.println(el);
        }

        // Read from Array into an ArrayList: Using simple FOR Loop
        ArrayList<String> namesList1 = new ArrayList<>();
        for (int i = 0; i < namesArray.length; i++) {
            namesList1.add(namesArray[i]);
        }

        // Check size of namesList1
        System.out.println("\nSize of namesList1 is: " + namesList1.size());

        System.out.println("\nElements of namesList1:");
        System.out.println("namesList: " + namesList1);

        // Modify namesArray - Replace name in second place
        namesArray[1] = "Jomo";

        // Read from Array into an ArrayList: Using Advanced FOR Loop
        ArrayList<String> namesList2 = new ArrayList<>();
        for (String element : namesArray) {
            namesList2.add(element);
        }

        // Print contents of namesList2
        System.out.println("\nElements of namesList2:");
        System.out.println("namesList: " + namesList2);

        // Modify namesArray - Replace name in third place
        namesArray[3] = "Kholo";

        // Read from Array into an ArrayList: Using Collection.addAll
        ArrayList<String> namesList3 = new ArrayList<>();
        Collections.addAll(namesList3, namesArray);

        // Print contents of namesList3
        System.out.println("\nElements of namesList3:");
        System.out.println("namesList: " + namesList3);

        // Modify namesArray - Replace name in fourth place
        namesArray[3] = "Lesh";

        // Read from Array into an ArrayList: Initialize ArrayList with Arrays.asList
        ArrayList<String> arrayList4 = new ArrayList<>(Arrays.asList(namesArray));

        // Print contents of namesList4 using Iterator
        System.out.println("\nIterate thru namesList4:");
        Iterator<String> iterate = arrayList4.iterator();
        while (iterate.hasNext()) {
            String names = iterate.next();
            System.out.println(names);
        }

        /*
         READING FROM ARRAYLIST INTO AN ARRAY
          Convert the ArrayList to an Array
          Method1: Using toArray() with no arguments (returns Object[])
         */
        Object[] objectArray = namesList1.toArray();

        // Print objectArray
        System.out.println("\nElements of objectArray:");
        for (Object obj : objectArray) {
            System.out.println(obj);
        }

        /*
         READING FROM ARRAYLIST INTO AN ARRAY
          Convert the ArrayList to an Array
          Method2: Using toArray(T[] a) with a typed array (returns T[])
         */
        String[] stringArray = new String[arrayList4.size()];
        stringArray = arrayList4.toArray(stringArray);

        // Print stringArray
        System.out.println("\nElements of stringArray:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
