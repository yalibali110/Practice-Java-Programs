public static void main(String[] args) {

    // Creates a Scanner to read input from the customer.
    Scanner scan = new Scanner(System.in);

    // Prices for the food and drinks on the menu.
    double PizzaPrice = 14.99;
    double SaladPrice = 7.99;
    double SandwichPrice = 8.99;
    double PastaPrice = 9.99;
    double SoupPrice = 6.99;
    double CoffeePrice = 1.99;
    double SodaPrice = 1.49;

    // Keeps track of the customer's order.
    double Subtotal = 0.00;
    double DrinkTotal = 0.00;

    // Tax is 6%.
    double Tax = 1.06;

    // Used to format the final prices to two decimal places.
    DecimalFormat df = new DecimalFormat("#.##");

    // Welcome the customer.
    System.out.println("Welcome to Alvin's Pizzeria!");
    System.out.println();

    // This variable controls whether the customer wants
    // to continue adding items to their order.
    boolean ordering = true;

    // Continue ordering until the customer enters "n".
    while (ordering) {

        // Display the menu each time the loop starts.
        System.out.println("Please choose an item from our menu:");
        System.out.println("Pizza $" + PizzaPrice);
        System.out.println("Salad $" + SaladPrice);
        System.out.println("Sandwich $" + SandwichPrice);
        System.out.println("Pasta $" + PastaPrice);
        System.out.println("Soup $" + SoupPrice);
        System.out.println();

        // Ask the customer what food they would like.
        System.out.println("What would you like to order?");

        String Input = scan.next();

        // Check which food item the customer selected.
        if (Input.equalsIgnoreCase("Pizza")) {
            Subtotal += PizzaPrice;

        } else if (Input.equalsIgnoreCase("Salad")) {
            Subtotal += SaladPrice;

        } else if (Input.equalsIgnoreCase("Sandwich")) {
            Subtotal += SandwichPrice;

        } else if (Input.equalsIgnoreCase("Pasta")) {
            Subtotal += PastaPrice;

        } else if (Input.equalsIgnoreCase("Soup")) {
            Subtotal += SoupPrice;

        } else {
            // If the customer enters something that isn't
            // on the menu, don't add anything to the order.
            System.out.println("Invalid Input.");
            continue;
        }

        // After ordering food, ask whether they want a drink.
        System.out.println();
        System.out.println(
            "Would you like a Soda for $1.49, " +
            "a Coffee for $1.99, or no drink?"
        );

        System.out.println("Enter [S] for soda, [C] for coffee, or [N] for neither.");

        char drinkChoice = scan.next().charAt(0);

        // Add the selected drink to the running drink total.
        if (drinkChoice == 'S' || drinkChoice == 's') {

            DrinkTotal += SodaPrice;

            System.out.println("Soda added to your order.");

        } else if (drinkChoice == 'C' || drinkChoice == 'c') {

            DrinkTotal += CoffeePrice;

            System.out.println("Coffee added to your order.");

        } else if (drinkChoice == 'N' || drinkChoice == 'n') {

            System.out.println("No drink added.");

        } else {

            // Invalid drink choices don't add anything.
            System.out.println("Invalid drink choice. No drink added.");
        }

        // Show the customer their current subtotal.
        double CurrentSubtotal = Subtotal + DrinkTotal;

        System.out.println();
        System.out.println(
            "Current subtotal: $" + df.format(CurrentSubtotal)
        );

        // Ask whether they want to add another item.
        System.out.println();
        System.out.println("Would you like to order another item?");
        System.out.println("Enter [Y] for yes or [N] for no.");

        char anotherItem = scan.next().charAt(0);

        // If the customer enters N, the loop will end.
        if (anotherItem == 'N' || anotherItem == 'n') {
            ordering = false;

        // If they enter Y, the loop starts over and
        // displays the menu again.
        } else if (anotherItem == 'Y' || anotherItem == 'y') {
            System.out.println();
            System.out.println("Let's add another item!");
            System.out.println();

        } else {
            // For an invalid answer, end the order rather than
            // accidentally adding another item.
            System.out.println("Invalid response. Ending order.");
            ordering = false;
        }
    }

    // Once the customer is finished ordering, combine the
    // food and drink prices to get the final subtotal.
    double FinalSubtotal = Subtotal + DrinkTotal;

    // Calculate 6% sales tax.
    double SalesTax = FinalSubtotal * 0.06;

    // Calculate the final total including tax.
    double Total = FinalSubtotal * Tax;

    // Display the customer's final order information.
    System.out.println();
    System.out.println("========== FINAL ORDER ==========");
    System.out.println("Food subtotal: $" + df.format(Subtotal));
    System.out.println("Drink subtotal: $" + df.format(DrinkTotal));
    System.out.println("Subtotal: $" + df.format(FinalSubtotal));
    System.out.println("Tax: $" + df.format(SalesTax));
    System.out.println("Total: $" + df.format(Total));
    System.out.println("=================================");

    // Close the Scanner when we are finished with it.
    scan.close();
}
