package service.decorator;

import org.junit.Before;
import org.junit.Test;
import service.Beverage;
import service.Espresso;

import static org.junit.Assert.assertEquals;

public class MochaTest {
    private Beverage beverage;

    @Before
    public void setUp() {
        beverage = new Espresso();
        beverage = new Mocha(beverage);
    }

    @Test
    public void testCost() {
        assertEquals(2.19, beverage.cost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        assertEquals("Espresso, with Mocha", beverage.getDescription());
    }

    @Test
    public void testWithDoubleMochaCost() {
        beverage = new Mocha(beverage);
        assertEquals(2.39, beverage.cost(), 0.01);
    }

    @Test
    public void testWithDoubleMochaDescription() {
        beverage = new Mocha(beverage);
        assertEquals("Espresso, with Mocha, with Mocha", beverage.getDescription());
    }
}
