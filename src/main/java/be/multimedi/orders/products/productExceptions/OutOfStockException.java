package be.multimedi.orders.products.productExceptions;

public class OutOfStockException extends RuntimeException {
    OutOfStockException() {
        super();
    }
    public OutOfStockException(String message) {
        super(message);
    }
    public OutOfStockException(Throwable thrown) {
        super(thrown);
    }
    public OutOfStockException(String message, Throwable thrown) {
        super(message, thrown);
    }
}
