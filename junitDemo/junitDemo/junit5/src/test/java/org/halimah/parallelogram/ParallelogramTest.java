package org.halimah.parallelogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelogramTest {
    @Test
    void testArea() {
        Parallelogram p = new Parallelogram();

        double result = p.area(4, 5);
        assertEquals(20.0, result);

        System.out.println("Test passed: Area of parallelogram is " + result);
    }

}