package PizzaOrderSystem.src;

import java.util.List;

public class TropicalGardenPizza extends Pizza{
    
    // Constructor to create a Tropical Garden Pizza with fixed size, crust, and toppings
    public TropicalGardenPizza(){
        super(Size.LARGE, Crust.THIN, List.of(Topping.ONION, Topping.PINEAPPLE, Topping.BLACK_OLIVES, Topping.SWEET_CORN, Topping.EXTRA_CHEESE));
    }
    
    // Method to calculate the price of the Tropical Garden Pizza
    @Override
    public double calculatePrice() {
        return 35.0; // Tropical Garden Pizza price
    }

}
