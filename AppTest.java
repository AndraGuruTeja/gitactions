package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    public void testString() {
        String message = "Hello GitHub Actions!";
        assertEquals("Hello GitHub Actions!", message);
    }
}
