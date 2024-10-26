package service;

import org.junit.Before;
import org.junit.Test;
import service.decorator.Milk;

import static org.junit.Assert.assertEquals;

public class DecafTest {
    private Beverage b;

    @Before
    public void setUp() {
        b = new Decaf();
    }

    @Test
    public void testCost() {
        assertEquals(1.05, b.cost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        assertEquals("Decaf Coffee", b.getDescription());
    }

    @Test
    public void testWithMilkCost() {
        b = new Milk(b);
        assertEquals(1.15, b.cost(), 0.01);
    }

    @Test
    public void testWithMilkDescription() {
        b = new Milk(b);
        assertEquals("Decaf Coffee, with Steamed Milk", b.getDescription());
    }
}
