package service.decorator;

import org.junit.Before;
import org.junit.Test;
import service.Beverage;
import service.HouseBlend;

import static org.junit.Assert.assertEquals;

public class SoyTest {
    private Beverage beverage;

    @Before
    public void setUp() {
        beverage = new HouseBlend();
        beverage = new Soy(beverage);
    }

    @Test
    public void testCost() {
        assertEquals(1.04, beverage.cost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        assertEquals("House Blend Coffee, with Soy", beverage.getDescription());
    }

    @Test
    public void testWithDoubleSoyCost() {
        beverage = new Soy(beverage);
        assertEquals(1.19, beverage.cost(), 0.01);
    }

    @Test
    public void testWithDoubleSoyDescription() {
        beverage = new Soy(beverage);
        assertEquals("House Blend Coffee, with Soy, with Soy", beverage.getDescription());
    }
}
