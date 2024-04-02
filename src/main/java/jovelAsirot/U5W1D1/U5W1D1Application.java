package jovelAsirot.U5W1D1;


import jovelAsirot.U5W1D1.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);

        Menu menuBean = ctx.getBean(Menu.class);

        System.out.println("Menu:");

        for (MenuItem item : menuBean.getItems()) {
            if (item instanceof Pizza) {
                Pizza pizza = (Pizza) item;
                System.out.println("Pizza: " + pizza.getName() + ", Price: $" + pizza.getPrice());
                System.out.println("Toppings:");
                for (Toppings topping : pizza.getToppings()) {
                    System.out.println("- " + topping);
                }
            } else if (item instanceof Beverage beverage) {
                System.out.println("Beverage: " + beverage.getName() + ", Price: $" + beverage.getPrice());
            }
        }
    }

}
