package PizzaOrderSystem.src;

import java.util.List;

public class SpicyVeggiePizza extends Pizza{

    // Constructor to create a Spicy Veggie Pizza with fixed size, crust, and toppings
    public SpicyVeggiePizza(){
        super(Size.EXTRA_LARGE, Crust.REGULAR, List.of(Topping.ONION, Topping.TOMATO, Topping.CORIANDER, Topping.BLACK_OLIVES));
    }
    
    // Method to calculate the price of the Spicy Veggie Pizza
    @Override
    public double calculatePrice() {
        return 40.0; // Spicy Veggie Pizza price
    }
    
}
