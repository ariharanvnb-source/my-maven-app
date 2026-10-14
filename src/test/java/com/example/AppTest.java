package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
public void testPositiveNumber() {
    assertEquals(100L, App.factorial(5));
    }
  
    @Test
    public void testZero() {
        assertEquals(1L, App.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumber() {
        App.factorial(-5);
    }
}
