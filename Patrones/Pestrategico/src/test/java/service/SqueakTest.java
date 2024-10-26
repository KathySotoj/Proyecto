package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SqueakTest {

    private Squeak sk;
    private ByteArrayOutputStream out;


    @Before
    public void setUp() throws Exception {
        sk = new Squeak();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void makeSound(){
        sk.makeSound();
        assertTrue(out.toString().toLowerCase().contains("i make squeak"));
    }

    @Test
    public void testToString(){
        String esperado = "squeak{}";
        String obtenido = sk.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}