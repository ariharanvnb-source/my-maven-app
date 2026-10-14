package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testFactorial() {
        assertEquals(120L, App.factorial(5));
    }

    @Test
    public void testZero() {
        assertEquals(1L, App.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        App.factorial(-1);
    }
}
