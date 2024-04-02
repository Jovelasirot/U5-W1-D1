import jovelAsirot.U5W1D1.entities.Beverage;
import jovelAsirot.U5W1D1.entities.Menu;
import jovelAsirot.U5W1D1.entities.Pizza;
import jovelAsirot.U5W1D1.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeansConfig {

    @Bean
    public Pizza margherita() {
        Pizza pizzaA = new Pizza();
        pizzaA.setName("Margherita");
        pizzaA.setPrice(7.0);
        return pizzaA;
    }

    @Bean
    public Pizza fourSeasons() {
        Pizza pizzaB = new Pizza();
        pizzaB.setName("Four season");
        pizzaB.setPrice(7.0);
        return pizzaB;
    }

    @Bean
    public Toppings prosciutto() {
        Toppings toppingsA = new Toppings();
        toppingsA.setPrice(2.0);
        return toppingsA;
    }

    @Bean
    public Toppings fries() {
        Toppings toppingsB = new Toppings();
        toppingsB.setPrice(4.0);
        return toppingsB;
    }

    @Bean
    public Beverage cokeZero() {
        Beverage beverageA = new Beverage();
        beverageA.setName("Coke zero");
        beverageA.setPrice(3.5);
        return beverageA;
    }

    @Bean
    public Beverage sprite() {
        Beverage beverageB = new Beverage();
        beverageB.setName("Sprite");
        beverageB.setPrice(3.5);
        return beverageB;
    }

    @Bean
    public Menu menuBean(Pizza margherita, Pizza fourSeasons, Toppings prosciutto, Toppings fries, Beverage cokeZero, Beverage sprite) {
        Menu menu = new Menu();
        menu.setItems(Arrays.asList(margherita, fourSeasons, prosciutto, fries, cokeZero, sprite));
        return menu;
    }
}
