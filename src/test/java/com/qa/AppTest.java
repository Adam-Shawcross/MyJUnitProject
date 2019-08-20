package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    private App app;


    @Test
    public void oneReturnTest() {
        app = new App();
        assertEquals(0, app.returnOne(0, 3));

    }

    @Test
    public void oneReturnTest2() {
        app = new App();
        assertEquals(2, app.returnOne(2, 3));
    }

    @Test
    public void oneReturnTest3() {
        app = new App();
        assertEquals(-2, app.returnOne(-2, 3));
    }

}