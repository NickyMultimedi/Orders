package be.multimedi.orders.products;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    private Product productFactory(int i) {
        switch (i) {
            case 1:
                return new Hammer();
            case 2:
                return new Drill();
            case 3:
                return new Saw();
            default:
                return null;
        }
    }

    @BeforeEach
    public void init() {
        product = new Hammer();
    }

    @ParameterizedTest
    @CsvSource({"1","2","3"})
    //TODO werk met Class<? ext Product> product, en geef een csv lijst mee van de te testen klassen. Dan is een factory niet nodig.
    void testStockDecrease(int impl) {
        product = productFactory(impl);
        product.increaseStock(5);
        assertEquals(product.getStock(), 5);
    }

    @AfterEach
    public void destroy() {
        product = null;
    }

}