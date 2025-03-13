package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    private Cat cat = new Cat("Asteroid Destroyer");
    @Test
    void greets() {
        Cat cat = new Cat("Gato");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        cat.greets();

        assertEquals("Meow",outContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    void testToString() {assertEquals("Cat[Mammal[Animal[name=Asteroid Destroyer]]]",cat.toString());
    }
}