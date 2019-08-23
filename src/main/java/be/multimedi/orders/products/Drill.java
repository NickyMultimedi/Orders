package be.multimedi.orders.products;

import be.multimedi.orders.products.productExceptions.*;

public class Drill implements Product {
    private int id;
    private String name;
    private int stock;
    private double price;
    private Product.Brand brand;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void increaseStock(int adjustment) {
        checkIfPositive(adjustment);
        stock += adjustment;
    }

    @Override
    public void decreaseStock(int adjustment) {
        checkIfPositive(adjustment);
        checkIfSufficientStock(adjustment);
        stock -= adjustment;
    }

    private void checkIfPositive(int adjustment) {
        if (adjustment <= 0) {
            throw new NegativeStockAdjustment("Number should be positive!");
        }
    }

    private void checkIfSufficientStock(int adjustment) {
        try {
            checkIfPositive(stock - adjustment);
        } catch (Exception e) {
            throw new OutOfStockException("Not enough in stock");
        }
    }
}
