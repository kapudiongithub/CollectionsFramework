package collections;

public class Arrays {

    public static void main(String[] args) {
        String[] namesArray = {"Bobo", "Gomo", "Kamo", "Lebo", "Nolo"};

        /* SEARCH FOR A SPECIFIC ELEMENT IN AN ARRAY AND ASSIGN IT TO A VARIABLE
         * Approach1: Using a Loop
         */
        String result1 = null;

        for (String name : namesArray) {
            if (name.equalsIgnoreCase("Nolo")) {
                result1 = name;
                break;
            }
        }
        if (result1 != null) {
            System.out.println("The name " + "'" + result1 + "'" + " was found in the namesArray");
        } else {
            System.out.println("Name was not found in the namesArray");
        }

        /* SEARCH FOR A SPECIFIC ELEMENT IN AN ARRAY AND ASSIGN IT TO A VARIABLE
         * Approach2: Using 'Arrays' Class
         */


    }
}
