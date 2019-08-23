package be.multimedi.orders.adjustables;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddedTest {
    private Added added;

    private class IncreaseMock {
        double number;

        public double getNumber() {
            return number;
        }

        public void setNumber(double number) {
            this.number = number;
        }
    }

    @BeforeEach
    public void init() {
        added = new Added();
    }

    @Test
    void increase() {

    }
}