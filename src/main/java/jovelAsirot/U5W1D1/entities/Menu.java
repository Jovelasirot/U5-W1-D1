package jovelAsirot.U5W1D1.entities;

import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu() {
    }

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }
}
