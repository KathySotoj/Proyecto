package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class QuackTest {

    private SoundBehavior sb;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        sb = new Quack();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly(){
        sb.makeSound();
        assertTrue(out.toString().toLowerCase().contains("i am quack"));
    }


    @Test
    public void testToString(){
        String esperado = "quack{}";
        String obtenido = sb.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}