package PizzaOrderSystem.src;

import java.util.Scanner;

public class Main {
     
    //Main method to start the Pizza Ordering System.    
    public static void main(String[] args) {
        orderDetails();
    }
     
    // Method to get order details from the user
    public static void orderDetails() {
        
        char orderChoice = 0; // Variable to store user's choice for continuing ordering
        
        System.out.println("Welcome to Pizza Ordering System!");        

        try (Scanner input = new Scanner(System.in)) {
            

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Tropical Garden Pizza");
                System.out.println("2. Spicy Veggie Pizza");
                System.out.println("3. Custom Pizza");
                System.out.print("Please enter your choice (1/2/3): ");

                try {
                    int pizzaChoice = input.nextInt();
                    input.nextLine();

                    switch (pizzaChoice) {
                        case 1:
                            // Order Tropical Garden Pizza
                            Order tropicalGarden = new Order();
                            tropicalGarden.addPizza(new TropicalGardenPizza());
                            System.out.println("You ordered a Tropical Garden Pizza.");
                            System.out.println("Total price: $" + tropicalGarden.calculateTotalPrice());
                            break;
                        case 2:
                            // Order Spicy Veggie Pizza
                            Order spicyVeggie = new Order();
                            spicyVeggie.addPizza(new SpicyVeggiePizza());
                            System.out.println("You ordered a Spicy Veggie Pizza.");
                            System.out.println("Total price: $" + spicyVeggie.calculateTotalPrice());
                            break;
                        case 3:
                            // Order Custom Pizza
                            CustomPizza customPizza = new CustomPizza();
                            System.out.println("You ordered a Custom Pizza.");
                            System.out.println("Total price: $" + customPizza.calculatePrice());
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }

                } catch (Exception e) {
                    System.out.println("Error: Invalid input. Please enter a valid choice.");
                    input.nextLine(); 
                    continue;
                }

                System.out.print("Do you want to order something else? (Y/N): ");
                try {
                    orderChoice = input.next().toUpperCase().charAt(0);
                    input.nextLine(); 
                } catch (Exception e) {
                    System.out.println("Error: Invalid input. Please enter Y or N.");
                    input.nextLine(); 
                    orderChoice = 'N'; 
                }
            } while (orderChoice == 'Y');

            System.out.println(" Thank you . Enjoy your pizza!");
        }
    }

      
}
