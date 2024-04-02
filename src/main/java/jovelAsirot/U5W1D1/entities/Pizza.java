package jovelAsirot.U5W1D1.entities;

import java.util.List;

public class Pizza extends MenuItem {
    private List<Toppings> toppings;

    public Pizza() {
    }

    public Pizza(String name, double price, List<Toppings> toppings) {
        super(name, price);
        this.toppings = toppings;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }
}
