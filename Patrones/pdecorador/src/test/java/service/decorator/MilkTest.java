package service.decorator;

import org.junit.Before;
import org.junit.Test;
import service.Beverage;
import service.DarkRoast;

import static org.junit.Assert.assertEquals;

public class MilkTest {
    private Beverage beverage;

    @Before
    public void setUp() {
        beverage = new DarkRoast();
        beverage = new Milk(beverage);
    }

    @Test
    public void testCost() {
        assertEquals(1.09, beverage.cost(), 0.01);
    }

    @Test
    public void testGetDescription() {
        assertEquals("Most Excellent Dark Roast, with Steamed Milk", beverage.getDescription());
    }

    @Test
    public void testWithDoubleMilkCost() {
        beverage = new Milk(beverage);
        assertEquals(1.19, beverage.cost(), 0.01);
    }

    @Test
    public void testWithDoubleMilkDescription() {
        beverage = new Milk(beverage);
        assertEquals("Most Excellent Dark Roast, with Steamed Milk, with Steamed Milk", beverage.getDescription());
    }
}
