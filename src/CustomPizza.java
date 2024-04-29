package PizzaOrderSystem.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomPizza extends Pizza{
    
    // Constructor to create a custom pizza with default parameters
    public CustomPizza() {
        super(null, null, null); 
        preparePizza();
    }
    
    // Constructor to create a custom pizza with specified size and crust
    public CustomPizza(Size size, Crust crust) {
        super(size, crust, new ArrayList<>()); 
        preparePizza();
    }    
    
    // Scanner object for user input
    Scanner input = new Scanner(System.in);
    
    // Method to prepare the custom pizza
    private void preparePizza() {
        try {
            setSize(selectSize());
            setCrust(selectCrust());
            setToppings(selectToppings());
        } catch (Exception e) {
            System.out.println("An error occurred while preparing the pizza: " + e.getMessage());
        }
    }
    
    // Method to select the size of the pizza
    private Size selectSize() {
        System.out.println("Select pizza size:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        System.out.println("4. Extra Large");
        System.out.print("Enter your choice (1/2/3/4): ");
        int sizeChoice = input.nextInt();
        
        switch (sizeChoice) {
            case 1:
                return Size.SMALL;
            case 2:
                return Size.MEDIUM;
            case 3:
                return Size.LARGE;
            case 4:
                return Size.EXTRA_LARGE;
            default:
                System.out.println("Invalid choice. Defaulting to Medium size.");
                return Size.MEDIUM;
        }
    }
    
    // Method to select the crust of the pizza
    private Crust selectCrust() {
        System.out.println("Select pizza crust:");
        System.out.println("1. Thin");
        System.out.println("2. Regular");
        System.out.println("3. Thick");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                return Crust.THIN;
            case 2:
                return Crust.REGULAR;
            case 3:
                return Crust.THICK;
            default:
                System.out.println("Invalid choice. Defaulting to Regular crust.");
                return Crust.REGULAR;
        }
    }
    
    // Method to select toppings for the pizza
    private List<Topping> selectToppings() {
        List<Topping> selectedToppings = new ArrayList<>();
        boolean done = false;
        while (!done) {
            System.out.println("Select toppings (type 'done' to finish):");
            for (Topping topping : Topping.values()) {
                System.out.println( topping);
            }
            System.out.print("Enter topping or 'done': ");
            String st = input.next().toUpperCase();
            if (st.equals("DONE")) {
                done = true;
            } else {
                try {
                    Topping selectedTopping = Topping.valueOf(st);
                    selectedToppings.add(selectedTopping);
                    System.out.println(selectedTopping + " added to the pizza.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid topping. Please enter a valid topping or 'done' to finish.");
                }
            }
        }
        return selectedToppings;
    }
    
    // Method to calculate the price of the custom pizza
    @Override
    public double calculatePrice() {
        double basePrice = 0;
        double toppingPrice = getToppings().size() * 2.5; // Assuming $2.5 per topping

        Size size = getSize();
        switch (size) {
            case SMALL:
                basePrice = 15.0;
                break;
            case MEDIUM:
                basePrice = 18.0;
                break;
            case LARGE:
                basePrice = 21.0;
                break;
            case EXTRA_LARGE:
                basePrice = 25.0;
                break;
        }

        return basePrice + toppingPrice;
    }
}
