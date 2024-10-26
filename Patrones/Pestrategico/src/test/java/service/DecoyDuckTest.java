package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DecoyDuckTest {
    private DecoyDuck dd;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception{
        dd = new DecoyDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwin(){
        dd.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }

    @Test
    public void testFly(){
        dd.performFLy();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));
    }

    @Test
    public void testQuack(){
        dd.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i am quack"));
    }

    @Test
    public void testDisplay(){
        dd.display();
        assertTrue(out.toString().toLowerCase().contains("i am a decoy duck"));
    }

    @Test
    public void testToString(){
        String esperado = "decoyduck{}";
        String obtenido = dd.toString().toLowerCase();
        assertEquals(esperado,obtenido);
    }
}