package be.multimedi.orders.products;

public interface Product {
    int getId();
    String getName();
    double getPrice();
    int getStock();
    Brand getBrand();
    void setPrice(double newPrice);
    void increaseStock(int adjustment);
    void decreaseStock(int adjustment);

    enum Brand {
        BOSCH, BAD, MAKITA, STARK_INDUSTRIES;
    }
}
