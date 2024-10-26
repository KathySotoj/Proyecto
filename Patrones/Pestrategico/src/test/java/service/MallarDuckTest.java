package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MallarDuckTest {

    private Duck d;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new MallarDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwim() {
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }

    @Test
    public void testFly() {
        d.performFLy();
        assertTrue(out.toString().toLowerCase().contains("i am flying"));
    }

    @Test
    public void testQuack() {
        d.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i am quack"));
    }

    @Test
    public void tesDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("i am a mallar duck"));
    }

    @Test
    public void testToString() {
        String esperado = "mallarduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);

    }
}