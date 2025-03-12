package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio6;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

class CatTest {

    @Test
    void greets() {
        Cat cat = new Cat("Gato");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        cat.greets();

        assertEquals("Meow",outContent.toString().trim());

        System.setOut(System.out);
    }
}