package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    private Dog dog = new Dog("Galaxy Destroyer");
    @Test
    void greets() {
        Dog dog = new Dog("Perro");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog.greets();

        assertEquals("Woof",outContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    void testGreets() {
        Dog dog = new Dog("Perro");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog.greets(dog);

        assertEquals("Woooof",outContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    void testToString() {assertEquals("Dog[Mammal[Animal[name=Galaxy Destroyer]]]", dog.toString());
    }
}