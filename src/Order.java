package PizzaOrderSystem.src;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    // List to store pizzas in the order
    private List<Pizza> pizzas;

    // Constructor to initialize the order with an empty list of pizzas
    public Order() {
        pizzas = new ArrayList<>();
    }

    // Method to add a pizza to the order
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    // Method to get the list of pizzas in the order
    public List<Pizza> getPizzas() {
        return pizzas;
    }

    // Method to calculate the total price of the order
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calculatePrice();
        }
        return totalPrice;
    }

}
