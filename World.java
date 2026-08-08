//This program uses the Tree.java file to run the full program

import java.util.*;

public class World {
    public static void main(String[] args) {

        // Create a new Oak tree that starts at 10 feet tall.
        Tree myTree = new Tree("Oak", 10, "Fullgrown");

        // Create a Scanner so we can read input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.println("You have planted a new tree.");
        System.out.println("It's an Oak tree, it is 10 feet tall, and it is Fullgrown.");
        System.out.println();

        // Keep asking the user if they want to move to the next season.
        // The loop will continue until the user enters "n".
        while (true) {

            System.out.println("Would you like to wait for the next season?");
            System.out.println("Enter y for yes or n for no:");

            String answer = scan.nextLine();

            // If the user enters "y", move the tree to the next season.
            if (answer.equalsIgnoreCase("y")) {
                myTree.nextSeason();

            // If the user enters "n", stop the program.
            } else if (answer.equalsIgnoreCase("n")) {
                break;

            // If anything other than y or n is entered,
            // ask the user again.
            } else {
                System.out.println("Please enter y or n.");
            }
        }

        // Once the user chooses to stop, display the tree's
        // current information.
        System.out.println();
        System.out.println("You have finished growing your tree!");
        System.out.println("Tree type: " + myTree.getGenus());
        System.out.println("Height: " + myTree.getHeight() + " feet");
        System.out.println("Size: " + myTree.getSize());
        System.out.println("Current season: " + myTree.getSeason());

        // Close the Scanner when we are finished using it.
        scan.close();
    }
}
