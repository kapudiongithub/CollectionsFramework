package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Hyundai");
        cars.add("Benz");
        cars.add("Toyota");

        System.out.println("\nArray size is: " + cars.size());
        System.out.println("Car at index 1 is: " + cars.get(2));

        System.out.println("\nAll cars added:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car at index " + i + " is " + cars.get(i));
        }

        cars.remove(cars.size()-2);

        System.out.println("\nAfter removing middle car:");
             for (String car : cars) {
                 System.out.println("Car is: " + car);
             }

    }
}
