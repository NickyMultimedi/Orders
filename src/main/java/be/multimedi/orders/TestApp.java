package be.multimedi.orders;

import be.multimedi.orders.products.Hammer;
import be.multimedi.orders.products.Product;

public class TestApp {
    public static void main(String[] args) {
        Hammer hammer = new Hammer();
        hammer.setBrand(Product.Brand.BAD);
        hammer.setStock(20);
        hammer.setId(1);
        hammer.setName("MkII");
        hammer.setPrice(2.4);

        Product prod = hammer;
        System.out.printf("%s\nstock: %d\nprice: %.2f",
                prod.getName(),
                prod.getStock(),
                prod.getPrice()
                );
        prod.setPrice(2.7);
        System.out.printf("%s\nstock: %d\nprice: %.2f",
                prod.getName(),
                prod.getStock(),
                prod.getPrice()
        );
        prod.increaseStock(5);
        System.out.printf("%s\nstock: %d\nprice: %.2f",
                prod.getName(),
                prod.getStock(),
                prod.getPrice()
        );
        prod.decreaseStock(5);
        System.out.printf("%s\nstock: %d\nprice: %.2f",
                prod.getName(),
                prod.getStock(),
                prod.getPrice()
        );

        try {
            prod.decreaseStock(-4);
        } catch (Exception e) {
            System.out.println("That didnt work well");
        }
        try {
            prod.decreaseStock(100);
        } catch (Exception e) {
            System.out.println("That didnt work wel either");
        }
        try {
            prod.increaseStock(-5);
        } catch (Exception e) {
            System.out.println("Will it ever work again?????");
        }

    }
}
