package entities;

import java.util.List;

public class Pizza extends MenuItem{
    private List<Toppings> toppings;

    public Pizza(String name, double price, List<Toppings> toppings) {
        super(name, price);
        this.toppings = toppings;
    }
}
