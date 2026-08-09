import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner so we can get input from the user.
        Scanner scan = new Scanner(System.in);

        // Ask the user how large they want their array to be.
        System.out.println("What size would you like the Array to be?");
        int ArraySize = scan.nextInt();

        // Ask the user whether they want an Integer or Double array.
        System.out.println("Enter either [Int] or [Double]");
        String ArrayType = scan.next();

        // Check whether the user selected an Integer array.
        if (ArrayType.equalsIgnoreCase("Int")) {

            // Create an Integer array with the requested size.
            int[] numbers = intArray(ArraySize);

            // Ask the user which index they would like to retrieve.
            System.out.println("What index would you like to retrieve?");
            int index = scan.nextInt();

            // Display the value stored at the selected index.
            System.out.println(
                "Value at index " + index + ": " + numbers[index]
            );

            // Ask whether the user wants to change a value.
            System.out.println("Would you like to change a value?");
            System.out.println("Enter [Y] for yes or [N] for no.");

            char change = scan.next().charAt(0);

            // If the user wants to change a value,
            // start the value-changing loop.
            if (change == 'Y' || change == 'y') {

                boolean changing = true;

                // Continue changing values until the user
                // chooses to stop.
                while (changing) {

                    // Ask which index the user wants to change.
                    System.out.println(
                        "What index would you like to replace?"
                    );
                    int replaceIndex = scan.nextInt();

                    // Ask what the new value should be.
                    System.out.println(
                        "What would you like to change the value to?"
                    );
                    int newValue = scan.nextInt();

                    // Replace the old value with the new value.
                    numbers[replaceIndex] = newValue;

                    System.out.println("The value has been changed.");

                    // Ask whether the user wants to change another value.
                    System.out.println(
                        "Would you like to change another value?"
                    );
                    System.out.println(
                        "Enter [Y] for yes or [N] for no."
                    );

                    char anotherChange = scan.next().charAt(0);

                    // If the user enters N, stop changing values.
                    if (anotherChange == 'N' ||
                        anotherChange == 'n') {

                        changing = false;
                    }

                    // If the user enters Y, the while loop
                    // automatically starts another change.
                }
            }

            // Print every index and the value currently stored there.
            System.out.println();
            System.out.println("Final array values:");

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(
                    "Index " + i + " contains: " + numbers[i]
                );
            }


        // Check whether the user selected a Double array.
        } else if (ArrayType.equalsIgnoreCase("Double")) {

            // Create a Double array with the requested size.
            double[] numbers = doubleArray(ArraySize);

            // Ask the user which index they would like to retrieve.
            System.out.println("What index would you like to retrieve?");
            int index = scan.nextInt();

            // Display the value stored at the selected index.
            System.out.println(
                "Value at index " + index + ": " + numbers[index]
            );

            // Ask whether the user wants to change a value.
            System.out.println("Would you like to change a value?");
            System.out.println("Enter [Y] for yes or [N] for no.");

            char change = scan.next().charAt(0);

            // If the user wants to change a value,
            // start the value-changing loop.
            if (change == 'Y' || change == 'y') {

                boolean changing = true;

                // Continue changing values until the user
                // chooses to stop.
                while (changing) {

                    // Ask which index the user wants to change.
                    System.out.println(
                        "What index would you like to replace?"
                    );
                    int replaceIndex = scan.nextInt();

                    // Ask what the new value should be.
                    System.out.println(
                        "What would you like to change the value to?"
                    );
                    double newValue = scan.nextDouble();

                    // Replace the old value with the new value.
                    numbers[replaceIndex] = newValue;

                    System.out.println("The value has been changed.");

                    // Ask whether the user wants to change another value.
                    System.out.println(
                        "Would you like to change another value?"
                    );
                    System.out.println(
                        "Enter [Y] for yes or [N] for no."
                    );

                    char anotherChange = scan.next().charAt(0);

                    // If the user enters N, stop changing values.
                    if (anotherChange == 'N' ||
                        anotherChange == 'n') {

                        changing = false;
                    }
                }
            }

            // Print every index and the value currently stored there.
            System.out.println();
            System.out.println("Final array values:");

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(
                    "Index " + i + " contains: " + numbers[i]
                );
            }


        } else {

            // Display an error if the user didn't enter
            // Int or Double.
            System.out.println(
                "Input does not match required field."
            );
        }

        // Close the Scanner when the program is finished.
        scan.close();
    }


    // Creates an Integer array and fills it with numbers
    // corresponding to each index.
    private static int[] intArray(int ArraySize) {

        int[] IntNumbers = new int[ArraySize];

        for (int i = 0; i < ArraySize; i++) {
            IntNumbers[i] = i;
        }

        return IntNumbers;
    }


    // Creates a Double array and fills it with numbers
    // corresponding to each index.
    private static double[] doubleArray(int ArraySize) {

        double[] DoubleNumbers = new double[ArraySize];

        for (int i = 0; i < ArraySize; i++) {
            DoubleNumbers[i] = i;
        }

        return DoubleNumbers;
    }
}
