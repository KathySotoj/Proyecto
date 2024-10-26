package service;

import org.junit.Before;
import org.junit.Test;
import service.decorator.Milk;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class HouseBlendTest {
    private Beverage b;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        b = new HouseBlend();
        out = new ByteArrayOutputStream();
        System.setOut( new java.io.PrintStream( out ));
    }

    @Test
    public void testCost() {
        double esperado = 1.99;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }

    @Test
    public void testGetDescription() {
        String esperado = "houseBlend";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }

    @Test
    public void testWithDobleMilkCost() {
        b = new Milk(b);
        b = new Milk(b);
        double esperado = 2.19;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }

    @Test
    public void testWithDobleMilkDescription() {
        b = new Milk(b);
        b = new Milk(b);
        String esperado = "houseBlend, with steamed milk, with steamed milk";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }

    @Test
    public void testToString() {
        String esperado = "houseBlend{'description'='houseBlend'}";
        String obtenido = b.toString().toLowerCase();
        assertEquals( esperado, obtenido );
    }
}