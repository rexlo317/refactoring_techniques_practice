package com.tws.refactoring.extract_variable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    @Test
    void getNoDiscountPrice() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertEquals(50100,  priceCalculator.getPrice(50, 1000));
    }

    @Test
    void getDiscountPrice() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertEquals(47850,  priceCalculator.getPrice(5000, 10));
    }

}