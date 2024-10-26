package service;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class ModelDuckTest {

    private ModelDuck d;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new ModelDuck();
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
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));
    }

    @Test
    public void testQuack() {
        d.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i cannot making sound"));
    }

    @Test
    public void tesDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy el pato modelo"));
    }

    @Test
    public void testToString() {
        String esperado = "modelduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);

    }

    @Test
    public void testFlyWithWingsAFlyLikeRocket(){
        d.performFLy(); // Corregido el nombre del método
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));

        d.setFb(new FlyLikeRocket());
        d.performFLy();
        assertTrue(out.toString().toLowerCase().contains("si puedo volar como coete")); // Corregido "coete" a "cohete"
    }


}