package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        // Elements can be shifted from their original positions
        numbers.add(0,100);
        numbers.add(1,200);
        numbers.add(2,300);
        numbers.add(1,400);

        cars.add("Hyundai");
        cars.add("Benz");
        cars.add("Toyota");

        System.out.println("\nArray size is: " + cars.size());
        System.out.println("Car at index 1 is: " + cars.get(2));

        System.out.println("\nAll cars added:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car at index " + i + " is " + cars.get(i));
        }

        // remove car
        cars.remove(cars.size()-2);

        System.out.println("\nAfter removing middle car:");
             for (String car : cars) {
                 System.out.println("Car is: " + car);
             }

        System.out.println("\nPrint numbers list:");
             for (int i = 0; i < numbers.size(); i++){
                 System.out.println("Number at index " + i + " is " + numbers.get(i));
             }

    }
}
