package entities;

public class Beverage extends MenuItem{
    private String size;

    public Beverage(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }
}
