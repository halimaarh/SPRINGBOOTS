package org.halimah.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
//        create object of cal class
        Calculator cal = new Calculator();
//        using junit5 assertEquals method
        assertEquals(2,cal.add(1,1));
    }

    @Test
    void subtract() {
        Calculator cal = new Calculator();
//        using junit5 assertEquals method
        assertEquals(2,cal.subtract(3,1));
    }

    @Test
    void multuply() {
        Calculator cal = new Calculator();
//        using junit5 assertEquals method
        assertEquals(2,cal.multuply(2,1));
    }

    @Test
    void divide() {
        Calculator cal= new Calculator();
//        using junit5 assertEquals method
        assertEquals(2,cal.divide(8,4));
    }
    @Test
    void remainder(){
        Calculator cal= new Calculator();
//        using junit5 assertEquals method
        assertEquals(2,cal.remainder(8,3));

    }
}