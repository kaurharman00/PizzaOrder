package PizzaOrderSystem.src;

import java.util.List;

public abstract class Pizza {
    
    // Fields to store pizza characteristics
    protected Size size;
    protected Crust crust;
    protected List<Topping> toppings;
    
    //Constructor to initialize a Pizza object.
    public Pizza(Size size, Crust crust, List<Topping> toppings) {
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
    }

    // Getters and setters for pizza attributes
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
    
    //Abstract method to calculate the price of the pizza.
    //Each subclass must provide its own implementation.    
    public abstract double calculatePrice();
}
