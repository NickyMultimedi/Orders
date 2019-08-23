package be.multimedi.orders.products.productExceptions;

public class NegativeStockAdjustment extends RuntimeException {
    NegativeStockAdjustment() {
        super();
    }
    public NegativeStockAdjustment(String message) {
        super(message);
    }
    public NegativeStockAdjustment(Throwable thrown) {
        super(thrown);
    }
    NegativeStockAdjustment(String message, Throwable thrown) {
        super(message, thrown);
    }
}
